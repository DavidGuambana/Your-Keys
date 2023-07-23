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
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
    private mDetalle md = new mDetalle();
    private mContrato mc = new mContrato();
    private mTotal mt = new mTotal();
    
    
    private boolean hay_contrato = false, hay_detalle;
    int horas, dias;
    double tAlqulerAuto,tContrato,  tDetalles, subtotal, IVA,total,
            precio_auto, precio_conductor;
    
    ArrayList<Integer> extras_seleccionado = new ArrayList<>();
    
    DefaultTableModel dtm, dtm2;
    
    JButton btnBien = new JButton();
    JButton btnMal = new JButton();
    
    String[] colDetalles= {"Código extra", "Nombre","Precio", "Cantidad", "Subtotal", "Acción"};
    String[] colExtras= {"Código extra","Nombre","Precio","Stock", "Categoría", "Acción"};
    String[] colClientes= {"ID cliente", "Cédula", "Nombre", "Apellido","Foto", "Acción"};
    String[] colAutos={"Matricula", "Categoría", "Modelo", "Marca", "Precio","Foto","Acción"};
    String[] colConductores={"ID conductor","Licencia", "Nombre","Apellido","Precio/Hora","Foto","Acción"};
    
    public void iniciar() {
        vista.setVisible(true);
        calculaTotal();
        vista.getTpAlquiler().setEnabledAt(1, false);
        vista.getJbRegContrato().addActionListener(l -> {
            vista.getTpAlquiler().setEnabledAt(0, false);
            vista.getTpAlquiler().setEnabledAt(1, true);
            vista.getTpAlquiler().setSelectedIndex(1);
        });
        vista.getJbCancelar().addActionListener(l -> reiniciarContrato());

        vista.getJbContinuar().addActionListener(l -> setContrato());
        vista.getJbFinalizar().addActionListener(l -> crear());
        
        vista.getCbDias().addActionListener(l->calculaTotal());
        vista.getCbHoras().addActionListener(l->calculaTotal());

        vista.getJbOneAuto().addActionListener(l -> {
            verAutos();
            abrirDialogo("Listado de autos");
        });
        vista.getJbOneCliente().addActionListener(l -> {
            verClientes();
            abrirDialogo("Listado de clientes");
        });
        vista.getJbOneConductor().addActionListener(l -> {
            verConductores();
            abrirDialogo("Listado de conductores");
        });
        vista.getJbOneExtra().addActionListener(l -> {
            verExtras(0);
            abrirDialogo("Listado de extras");
        });

        ControlarTabla(vista.getJtRegistros(), vista.getJtDetalles());

        btnBien.setBackground(Color.black);
        btnMal.setBackground(Color.GRAY);
        btnBien.setText("+ AGREGAR");
        btnMal.setText("× REMOVER");
        btnBien.setForeground(Color.white);
        btnMal.setForeground(Color.white);
        vista.getJtRegistros().setDefaultRenderer(Object.class, new RenderTable());
        dtm2 = new DefaultTableModel(null, colDetalles);
        vista.getJtDetalles().setRowHeight(30);
        vista.getTxtBuscar().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                FiltrarTabla.filtrar(vista.getJtRegistros(), vista.getTxtBuscar(), vista.getCbColumnas());
            }
        });
    }
    
    public void ControlarTabla(JTable t, JTable t2) {
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
                            if (vista.getJdDialog().getTitle().equals("Listado de autos")) {
                                vista.getTxtMatricula().setText(id);
                                precio_auto = Double.parseDouble(t.getValueAt(t.getSelectedRow(), 4).toString());
                            }
                            if (vista.getJdDialog().getTitle().equals("Listado de clientes")) {
                                vista.getTxtCliente().setText(id);
                            }
                            if (vista.getJdDialog().getTitle().equals("Listado de conductores")) {
                                vista.getTxtConductor().setText(id);
                                precio_conductor = Double.parseDouble(t.getValueAt(t.getSelectedRow(), 4).toString());
                            }
                            if (!vista.getJdDialog().getTitle().equals("Listado de extras")) {
                                vista.getJdDialog().setVisible(false);
                            } else {
                                String nombre = t.getValueAt(t.getSelectedRow(), 1).toString();
                                double precio = Double.parseDouble(t.getValueAt(t.getSelectedRow(), 2).toString());
                                int existencias = Integer.parseInt(t.getValueAt(t.getSelectedRow(), 3).toString());
                                agregarExtra(Integer.parseInt(id), nombre, precio, existencias);
                            }
                            calculaTotal();
                        }
                    }
                }
            }
        });
        t2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                   String id_extra = t2.getValueAt(t2.getSelectedRow(), 0).toString();
                        double precio = Double.parseDouble(t2.getValueAt(t2.getSelectedRow(), 2).toString());
                        try {
                            int cantidad = Integer.parseInt(t2.getValueAt(t2.getSelectedRow(), 3).toString());
                            int xcolum = t2.getColumnModel().getColumnIndexAtX(me.getX());
                            int xrow = me.getY() / t2.getRowHeight();
                            if (xcolum <= t2.getColumnCount() && xcolum >= 0 && xrow <= t2.getRowCount() && xrow >= 0) {
                                Object obj = t2.getValueAt(xrow, xcolum);
                                if (obj instanceof JButton) {
                                    removerExtra(Integer.parseInt(id_extra), precio, cantidad);
                                }
                            }
                        } catch (Exception e) {
                        }
                }
            }
        });
    }

    public void crear() {
        //creamos alquiler
        if (setAlquiler()) {
            modelo.crear();
            //creamos detalle/s
            setDetalles();
            if (hay_detalle) {
                for (int i = 0; i < vista.getJtDetalles().getRowCount(); i++) {
                    md.setCodigo_extra(Integer.parseInt(vista.getJtDetalles().getValueAt(i, 0).toString()));
                    md.setNombre(vista.getJtDetalles().getValueAt(i, 1).toString());
                    md.setCantidad(Integer.parseInt(vista.getJtDetalles().getValueAt(i, 3).toString()));
                    md.setSubtotal(Double.parseDouble(vista.getJtDetalles().getValueAt(i, 4).toString()));
                    md.setId_alquiler(modelo.ultimoID());
                    md.crear();
                    actualizarStock(md.getCodigo_extra(), md.getCantidad());
                }
            }

            //creamos contrato
            if (hay_contrato) {
                setContrato();
                mc.setId_alquiler(modelo.ultimoID());
                mc.crear();
            }
            //creamos total
            setTotal();
            mt.setId_alquiler(modelo.ultimoID());
            mt.crear();
            JOptionPane.showMessageDialog(null, "¡Registrado correctamente!");
            reiniciarTodo();
        }
    }
    
    public boolean setAlquiler(){
        if (vista.getTxtMatricula().getText().isEmpty()|| vista.getTxtCliente().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Aún tienes campos por completar!");
            return false;
        } else{
            Date hoy = new Date();
            Long d = hoy.getTime();
            java.sql.Date date = new java.sql.Date(d);
            modelo.setFecha(date);
            modelo.setMatricula_auto(vista.getTxtMatricula().getText());
            modelo.setId_cliente(Integer.parseInt(vista.getTxtCliente().getText()));
            modelo.setDias(dias);
            return true;
        }
    }
    
    public boolean setContrato(){
        if (vista.getTxtConductor().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Aún tienes campos por completar!");
            return false;
        } else{
            Date hoy = new Date();
            Long d = hoy.getTime();
            java.sql.Date date = new java.sql.Date(d);
            mc.setFecha(date);
            mc.setId_conductor(Integer.parseInt(vista.getTxtConductor().getText()));
            mc.setHoras(horas);
            mc.setTotal(tContrato);
            hay_contrato = true;
            vista.getJbRegContrato().setText("¡Conductor alquilado!");
            vista.getJbRegContrato().setForeground(Color.green);
            vista.getTpAlquiler().setEnabledAt(0, true);
            vista.getTpAlquiler().setEnabledAt(1, false);
            vista.getTpAlquiler().setSelectedIndex(0);
            return true;
        }
    }
    
    public boolean setDetalles() {
        int filas = vista.getJtDetalles().getRowCount();
        if (filas > 0) {
            hay_detalle = true;
            return true;
        } else {
            hay_detalle = false;
            return false;
        }
    }
    
    public void setTotal(){
        mt.setTotal_alquiler(tAlqulerAuto);
        mt.setTotal_detalle(tDetalles);
        mt.setTotal_contrato(tContrato);
        mt.setSubtotal(subtotal);
        mt.setIva(IVA);
        mt.setTotal(total);
    }
    
    public void calculaTotal() {
        try {
            dias = Integer.parseInt(vista.getCbDias().getSelectedItem().toString().replaceAll("[^0-9]", ""));
            tAlqulerAuto= precio_auto*dias;
        } catch (NumberFormatException e) {
            tAlqulerAuto = 0;
        }
        
        try {
            horas = Integer.parseInt(vista.getCbHoras().getSelectedItem().toString().replaceAll("[^0-9]", ""));
            tContrato = precio_conductor*horas;
        } catch (NumberFormatException e) {
            tContrato = 0;
        }
        //calculamos...
        subtotal = tAlqulerAuto + tDetalles + tContrato;
        IVA = subtotal*0.12;
        total = subtotal + IVA;
        //seteamos los totales
        vista.getTxtT1().setText("$ "+tAlqulerAuto);
        vista.getTxtT2().setText("$ "+tDetalles);
        vista.getTxtT3().setText("$ "+tContrato);
        vista.getTxtTotalContrato().setText("$ "+tContrato);
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
       try {
            dtm = new DefaultTableModel(null, colExtras);
            rs = me.join2();
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4),rs.getString(5),btnBien});
            }
            vista.getJtRegistros().setModel(dtm);
            vista.getJtRegistros().setRowHeight(30);
        } catch (SQLException ex) {
        }
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
                datos = new String[]{"Código extra", "Nombre", "Precio", "Stock", "Categoría"};
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
    
    public void InsertarIcono(JButton b, String r) { //insertar icono en boton:
        b.setIcon(new javax.swing.ImageIcon(getClass().getResource(r)));
    }

    public void agregarExtra(int id_extra, String nombre, Double precio, int existencias) {
        if (existencias > 0) {
            boolean repetido = false;
            for (int i = 0; i < extras_seleccionado.size(); i++) {
                if (extras_seleccionado.get(i).equals(id_extra)) {
                    repetido = true;
                    break;
                }
            }
            if (repetido) {
                JOptionPane.showMessageDialog(null, "¡Este extra ya fué seleccionado!, Seleccione otro!", null, JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad:", 1));
                    if (cantidad > 0 && cantidad <= existencias) {
                        vista.getJtDetalles().setDefaultRenderer(Object.class, new RenderTable());
                        Object detalle[] = {id_extra, nombre, precio, cantidad, precio * cantidad, btnMal};
                        dtm2.addRow(detalle);
                        vista.getJtDetalles().setModel(dtm2);
                        tDetalles += (precio * cantidad);
                        calculaTotal();
                        extras_seleccionado.add(id_extra);
                        vista.getJdDialog().setVisible(false);
                    } else {
                        if (cantidad > existencias) {
                            JOptionPane.showMessageDialog(null, "¡Solo existen '" + existencias + "' de este extra!", null, JOptionPane.WARNING_MESSAGE);
                        }
                        if (cantidad <= 0) {
                            JOptionPane.showMessageDialog(null, "¡El mínimo de venta es de 1!", null, JOptionPane.WARNING_MESSAGE);
                        }
                    }
                } catch (NumberFormatException e) {
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡Extra agotado!, Seleccione otro!", null, JOptionPane.WARNING_MESSAGE);
        }
    }

    public void removerExtra(int id_extra, Double precio, int cantidad) {
        int valor = JOptionPane.showConfirmDialog(null, "¿Desea remover este extra?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (valor == JOptionPane.YES_OPTION) { 
            tDetalles -= (precio * cantidad);
            calculaTotal();
            dtm2.removeRow(vista.getJtDetalles().getSelectedRow());
            vista.getJtDetalles().setModel(dtm2);
            for (int i = 0; i < extras_seleccionado.size(); i++) {
                if (extras_seleccionado.get(i)==id_extra) {
                    extras_seleccionado.remove(i);
                    i = extras_seleccionado.size();
                }
            }
        }
    }
    public void reiniciarTodo(){
        vista.getTxtCliente().setText("");
        vista.getTxtMatricula().setText("");
        vista.getCbDias().setSelectedIndex(0);
        dtm2 = new DefaultTableModel(null, colDetalles);
        vista.getJtDetalles().setModel(dtm2);
        extras_seleccionado.clear();
        //reinicia variables
        hay_detalle = false;
        tAlqulerAuto = 0;
        tDetalles = 0;
        subtotal = 0;
        IVA = 0;
        total = 0;
        precio_auto = 0;
        reiniciarContrato();
        calculaTotal();
    }

    public void reiniciarContrato() {
        vista.getTxtConductor().setText("");
        vista.getCbHoras().setSelectedIndex(0);
        precio_conductor = 0;
        tContrato = 0;
        calculaTotal();
        hay_contrato = false;
        vista.getTpAlquiler().setSelectedIndex(0);
        vista.getJbRegContrato().setText("Alquilar conductor");
        vista.getJbRegContrato().setForeground(Color.white);
        vista.getTpAlquiler().setEnabledAt(0, true);
        vista.getTpAlquiler().setEnabledAt(1, false);
        vista.getTpAlquiler().setSelectedIndex(0);
    }
}


