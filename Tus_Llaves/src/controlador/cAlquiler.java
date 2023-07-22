package controlador;

import controlador.otros.FiltrarTabla;
import controlador.otros.RenderTable;
import controlador.otros.RoundedLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.mAlquiler;
import modelo.mAuto;
import modelo.mCliente;
import modelo.mConductor;
import modelo.mContrato;
import modelo.mDetalle;
import modelo.mExtra;
import modelo.mTotal;
import modelo.tablas.Extra;
import vista.vAlquiler;

public final class cAlquiler {
    private final vAlquiler vista;
    private final mAlquiler modelo;
    
    public cAlquiler(vAlquiler vista, mAlquiler modelo) {
        this.vista = vista;
        this.modelo = modelo;
        iniciar();
    }
    
    private final mCliente mcliente = new mCliente();
    private final mAuto mauto = new mAuto();
    private final mConductor mconductor = new mConductor();
    private final mExtra me = new mExtra();
    ResultSet rs;
    private List<Extra> extras = new ArrayList<>();
    private mAlquiler ma;
    private mDetalle md;
    private mContrato mc;
    private mTotal mt;
    
    
    private boolean con_contrato = false;
    int id, horas, dias;
    double tAlqulerAuto,tContrato,  tDetalles, subtotal, IVA,total;
    ArrayList<Integer> extras_seleccionado = new ArrayList<>();
    
    DefaultTableModel dtm;
    
    JButton btnBien = new JButton();
    JButton btnMal = new JButton();
    
    String[] colDetalles= {"Código extra", "Nombre","Precio", "Cantidad", "Subtotal", "Acción"};
    String[] colExtras= {"Código extra","Nombre","Precio","Stock", "ID categoría", "Acción"};
    
    String[] colClientes= {"ID cliente", "Cédula", "Nombre", "Apellido","Foto", "Acción"};
    String[] colAutos={"Matricula", "Categoría", "Modelo", "Marca", "Precio","Foto","Acción"};
    String[] colConductores={"ID conductor","Licencia", "Nombre","Apellido","Precio/Hora","Foto","Acción"};
    
    JTextField txtIdExtra = new JTextField();
    
    public void iniciar(){
        vista.setVisible(true);
        
        vista.getJbCancelar().addActionListener(l-> {
            vista.getTpAlquiler().setSelectedIndex(0);
            con_contrato = false;
            vista.getJbRegContrato().setText("Alquilar conductor");
            vista.getJbRegContrato().setForeground(Color.white);
            
        });
        
        vista.getJbContinuar().addActionListener(l->{
            vista.getTpAlquiler().setSelectedIndex(0);
            setContrato();
        });
        
        vista.getJbFinalizar().addActionListener(l-> crear());
        
        vista.getJbOneAuto().addActionListener(l-> {
            verAutos();
            abrirDialogo("Listado de autos");
                });
        vista.getJbOneCliente().addActionListener(l-> {
            verClientes();
            abrirDialogo("Listado de clientes");
                });
        vista.getJbOneConductor().addActionListener(l-> {
            verConductores();
            abrirDialogo("Listado de conductores");
                });
        vista.getJbOneExtra().addActionListener(l-> {
            verExtras(0);
            abrirDialogo("Listado de extras");
                });
        
        btnBien.setBackground(Color.WHITE);
        btnMal.setBackground(Color.WHITE);
        InsertarIcono(btnBien, "/vista/img/bien.png");
        InsertarIcono(btnMal, "/vista/img/mal.png");
        vista.getJtRegistros().setDefaultRenderer(Object.class, new RenderTable());
        
        vista.getTxtBuscar().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                FiltrarTabla.filtrar(vista.getJtRegistros(), vista.getTxtBuscar(), vista.getCbColumnas());
            }
        });
        
        ControlarTabla(vista.getJtRegistros(),vista.getTxtConductor());
        ControlarTabla(vista.getJtRegistros(),vista.getTxtMatricula());
        ControlarTabla(vista.getJtRegistros(),vista.getTxtCliente());
        ControlarTabla(vista.getJtRegistros(),txtIdExtra);
    }
    
    public void crear() {
        //creamos alquiler
        if (setAlquiler() ) {
            modelo.crear();
            //creamos detalle/s
            for (int i = 0; i < vista.getJtDetalles().getRowCount(); i++) {
                md.setCodigo_extra(Integer.parseInt(vista.getJtDetalles().getValueAt(i, 0).toString()));
                md.setNombre(vista.getJtDetalles().getValueAt(i, 1).toString());
                md.setCantidad(Integer.parseInt(vista.getJtDetalles().getValueAt(i, 3).toString()));
                md.setSubtotal(Double.parseDouble(vista.getJtDetalles().getValueAt(i, 4).toString()));
                md.setId_alquiler(modelo.ultimoID());
                md.crear();
                actualizarStock(md.getCodigo_extra(), md.getCantidad());
            }
            //creamos contrato
            if (con_contrato) {
                setContrato();
                mc.setId_alquiler(modelo.ultimoID());
                mc.crear();
            }
            //creamos total
            setTotal();
            mt.setId_alquiler(modelo.ultimoID());
            mt.crear();
            JOptionPane.showMessageDialog(null, "¡Registrado correctamente!");
            //metodo para reiniciar todo
        }
    }
    
    public boolean setAlquiler(){
        if (vista.getTxtMatricula().getText().isEmpty()|| vista.getTxtCliente().getText().isEmpty()|| vista.getCbDias().getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "¡Aún tienes campos por completar!");
            return false;
        } else{
            modelo.setFecha(new Date());
            modelo.setMatricula_auto(vista.getTxtMatricula().getText());
            modelo.setId_cliente(Integer.parseInt(vista.getTxtCliente().getText()));
            modelo.setDias(dias);
            modelo.setTotal(total);
            return true;
        }
    }
    
    public boolean setContrato(){
        if (vista.getTxtConductor().getText().isEmpty() || vista.getCbHoras().getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "¡Aún tienes campos por completar!");
            return false;
        } else{
            mc.setFecha(new Date());
            mc.setId_conductor(Integer.parseInt(vista.getTxtConductor().getText()));
            mc.setHoras(horas);
            mc.setTotal(tContrato);
            con_contrato = true;
            vista.getJbRegContrato().setText("¡Conductor alquilado!");
            vista.getJbRegContrato().setForeground(Color.green);
            return true;
        }
    }
    
    public boolean setDetalle() {
        
        int filas = vista.getJtDetalles().getRowCount();
        if (filas > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void setTotal(){
        mt.setSubtotal(subtotal);
        mt.setTotal(total);
    }
    
    public void calculaTotal(){
        dias = Integer.parseInt(vista.getCbDias().getSelectedItem().toString().replaceAll("[^0-9]", ""));
        tAlqulerAuto = Double.parseDouble(vista.getTxtT1().getText()) * horas;
        
        horas = Integer.parseInt(vista.getCbHoras().getSelectedItem().toString().replaceAll("[^0-9]", ""));
        tContrato = Double.parseDouble(vista.getTxtTotalContrato().getText()) * horas;
        
        vista.getTxtT1().setText("$ "+tAlqulerAuto);
        vista.getTxtT2().setText("$ "+tDetalles);
        vista.getTxtT3().setText("$ "+tContrato);
        vista.getTxtSubtotal().setText("$ "+subtotal);
        vista.getTxtIVA().setText("$ "+IVA);
        vista.getTxtTotal().setText("$ " + total);
    }

    public void actualizarStock(int cod_extra, int cantidad) {
        extras = me.listar(cod_extra);
        int stock = extras.get(0).getExistencias();
        stock -= cantidad;
        me.setCodigo(cod_extra);
        me.setExistencias(stock);
        me.updateExtraStock();
    }
   
    public void verExtras(int idExtra) {
        dtm = new DefaultTableModel(null, colExtras);
        extras = me.listar(idExtra);
        extras.stream().forEach(e -> dtm.addRow(new Object[]{e.getCodigo(), e.getNombre(), e.getPrecio(), e.getExistencias(), e.getId_categoria(), btnBien}));

        vista.getJtRegistros().setModel(dtm);
        vista.getJtRegistros().setRowHeight(40);
    }
    
    public void verClientes() {
        try {
            dtm = new DefaultTableModel(null, colClientes);
            rs = mcliente.join2();
            while (rs.next()) {
                RoundedLabel rl = new RoundedLabel("", 0, 0xFFFFFF, 0xFFFFFF, 1.0f);
                getIcon(rs.getBytes(5), rl);
                dtm.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rl,btnBien});
            }
            vista.getJtRegistros().setModel(dtm);
            vista.getJtRegistros().setRowHeight(50);
        } catch (SQLException ex) {
            Logger.getLogger(cAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void verConductores() {
        try {
            dtm = new DefaultTableModel(null, colConductores);
            rs = mconductor.join2();
            while (rs.next()) {
                RoundedLabel rl = new RoundedLabel("", 0, 0xFFFFFF, 0xFFFFFF, 1.0f);
                getIcon(rs.getBytes(6), rl);
                dtm.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getDouble(5),rl,btnBien});
            }
            vista.getJtRegistros().setModel(dtm);
            vista.getJtRegistros().setRowHeight(50);
        } catch (SQLException ex) {
            Logger.getLogger(cAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void verAutos() {
        try {
            dtm = new DefaultTableModel(null, colAutos);
            rs = mauto.join2();
            while (rs.next()) {
                RoundedLabel rl = new RoundedLabel("", 0, 0xFFFFFF, 0xFFFFFF, 1.0f);
                getIcon(rs.getBytes(6), rl);
                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getDouble(5),rl,btnBien});
            }
            vista.getJtRegistros().setModel(dtm);
            vista.getJtRegistros().setRowHeight(50);

        } catch (SQLException ex) {
            Logger.getLogger(cAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public void abrirDialogo(String titulo) {
        setComboBox(titulo);
        vista.getLbTitulo().setText(titulo);
        vista.getJdDialog().setLocationRelativeTo(vista);
        vista.getJdDialog().setSize(792, 520);
        vista.getJdDialog().setTitle(titulo);
        vista.getJdDialog().setLocationRelativeTo(null);
        vista.getJdDialog().setVisible(true);
    }
    
    public void setComboBox(String titulo) {
        String[] datos = null;
        switch (titulo) {
            case "Listado de clientes":
                datos = new String[]{"ID cliente", "Cédula", "Nombre", "Apellido"};
                break;
            case "Listado de conductores":
                datos = new String[]{"ID conductor", "Licencia", "Nombre", "Apellido", "Precio/Hora"};
                break;
            case "Listado de autos":
                datos = new String[]{"Matricula", "Categoría", "Modelo", "Marca", "Precio"};
                break;
            case "Listado de extras":
                datos = new String[]{"Código extra", "Nombre", "Precio", "Stock", "ID categoría"};
                break;
        }
        vista.getCbColumnas().setModel(new DefaultComboBoxModel<>(datos));
    }

    
    public void getIcon(byte[] b, RoundedLabel rl) {
        rl.setPreferredSize(new Dimension(50, 50));
        rl.setHorizontalAlignment(JLabel.CENTER);
        if (b == null) {
            rl.setIcon(null);
        } else {
            try {
                InputStream inputStream = new ByteArrayInputStream(b);
                BufferedImage bufferedImage = ImageIO.read(inputStream);
                // Llama al método setRoundedImage
                rl.setRoundedImage2(bufferedImage, rl);
            } catch (IOException ex) {
                rl.setIcon(null);
            }
        }
    }
    
    public void InsertarIcono(JButton b, String r){ //insertar icono en boton:
        b.setIcon(new javax.swing.ImageIcon(getClass().getResource(r)));
    }
    
    public void ControlarTabla(JTable t, JTextField txt){
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 2) {
                    String id = t.getValueAt(t.getSelectedRow(), 0).toString();
                    int xcolum = t.getColumnModel().getColumnIndexAtX(me.getX());
                    int xrow = me.getY() / t.getRowHeight();
                    if (xcolum <= t.getColumnCount() && xcolum >= 0 && xrow <= t.getRowCount() && xrow >= 0) {
                        Object obj = t.getValueAt(xrow, xcolum);
                        if (obj instanceof JButton) {
                            txt.setText(id);
                            vista.getJdDialog().setVisible(false);
                        }
                    }
                }
            }
        });
    }
    
//    public void agregarExtra(String id_extra, String nombre_extra, Double precio_extra, int existencias) {
//        if (existencias > 0) {
//            boolean repetido = false;
//            for (int i = 0; i < extras_seleccionado.size(); i++) {
//                if (extras_seleccionado.get(i).equals(id_extra)) {
//                    repetido = true;
//                    break;
//                }
//            }
//            if (repetido) {
//                JOptionPane.showMessageDialog(null, "¡Este extra ya fué seleccionado!, Seleccione otro!", null, JOptionPane.WARNING_MESSAGE);
//            } else {
//                try {
//                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad:", 1));
//                    if (cantidad > 0 && cantidad <= existencias) {
//                        vista.getJ.setDefaultRenderer(Object.class, new BotonTabla());
//                        Object detalle[] = {id_pro, nombre_pro, precio_pro, cantidad, precio_pro * cantidad, btnEliminar};
//                        dtm2.addRow(detalle);
//                        vista.getT_detalles().setModel(dtm2);
//                        total += (precio_pro * cantidad);
//                        vista.getTxtTotal().setText("$" + total);
//                        productos_agregados.add(id_pro);
//                        vista.getSeleccionar_pro().setVisible(false);
//                    } else {
//                        if (cantidad > existencias) {
//                            JOptionPane.showMessageDialog(null, "¡Solo existen '" + existencias + "' de este producto!", null, JOptionPane.WARNING_MESSAGE);
//                        }
//                        if (cantidad <= 0) {
//                            JOptionPane.showMessageDialog(null, "¡El mínimo de venta es de 1!", null, JOptionPane.WARNING_MESSAGE);
//                        }
//                    }
//                } catch (NumberFormatException e) {
//                }
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "¡Producto agotado!, Seleccione otro!", null, JOptionPane.WARNING_MESSAGE);
//        }
//    }

//    public void removerProducto(String id_pro, Double precio_pro, int cantidad) {
//        int valor = JOptionPane.showConfirmDialog(null, "¿Desea remover este producto?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//        if (valor == JOptionPane.YES_OPTION) { 
//            total -= (precio_pro * cantidad);
//            vista.getTxtTotal().setText("$" + total);
//            dtm2.removeRow(vista.getT_detalles().getSelectedRow());
//            vista.getT_detalles().setModel(dtm2);
//            for (int i = 0; i < productos_agregados.size(); i++) {
//                if (productos_agregados.get(i).equals(id_pro)) {
//                    productos_agregados.remove(id_pro);
//                    i = productos_agregados.size();
//                }
//            }
//        }
//    }
    
}


