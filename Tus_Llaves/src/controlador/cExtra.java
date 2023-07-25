package controlador;

import static controlador.cCliente.rs;
import controlador.otros.FiltrarTabla;
import controlador.otros.Validar;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.mCategoria;
import modelo.mExtra;
import modelo.tablas.Categoria;
import modelo.tablas.Extra;
import vista.vExtras;

public class cExtra {

    private final mExtra modelo;
    private final vExtras vista;
    public static ResultSet rs2 = null;
    mCategoria modeloc = new mCategoria();
    List<Extra> extras = new ArrayList<>();
    List<Categoria> categorias = new ArrayList<>();
    DefaultTableModel dtm;
    String[] columnas = {"Codigo", "Nombre", "Precio", "Existencias", "Categoria"};
    int id;

    public cExtra(mExtra modelo, vExtras vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        visualizar(0);
        iniciarCtrlBtn();
        seleccionar(vista.getJtExtras());
        llenarcate(vista.getCbCategoria());
        crearmodo();
        controlKey();
    }

    public void iniciarCtrlBtn() {
        vista.getJb_ModoEditar().addActionListener(l -> editarmodo());
        vista.getJb_ModoNuevo().addActionListener(l -> crearmodo());
        vista.getJb_ModoVista().addActionListener(l -> eliminarver());
        vista.getJbOK().addActionListener(l -> accionboton());

    }

    private void visualizar(int id) {
        dtm = new DefaultTableModel(null, columnas);
        extras = modelo.listar(id);
        extras.stream().forEach(p -> dtm.addRow(new Object[]{p.getCodigo(), p.getNombre(), p.getPrecio(), p.getExistencias(), p.getId_categoria()}));
        vista.getJtExtras().setModel(dtm);
        vista.getJtExtras().setRowHeight(30);
    }

    public void editarmodo() {
        desckboton(true);
        vista.getJbOK().setText("MODIFICAR");
        vista.getLbModo().setText("Actualizar extras");
    }

    public void crearmodo() {
        vaciarperfil();
        desckboton(true);
        vista.getJbOK().setText("REGISTRAR");
        vista.getLbModo().setText("Registrar extras");

    }

    public void eliminarver() {
        desckboton(false);
        vista.getJbOK().setText("ELIMINAR");
        vista.getLbModo().setText("Eliminar extras");
    }

    public void accionboton() {
        if (vista.getJbOK().getText().equals("MODIFICAR")) {
            if (lleno()) {
                if (valisala()) {
                   setearDatosmod();
                modelo.actualizar();
                visualizar(0);
                JOptionPane.showMessageDialog(null, "Modificado correctamente");   
                }
              
            }
        }
        ////////////////////////////////////////////////////
        if (vista.getJbOK().getText().equals("REGISTRAR")) {
            if (lleno()) {
                if (valisala()) {
                setearDatos();
                modelo.crear();
                visualizar(0);
                JOptionPane.showMessageDialog(null, "Registrado correctamente");
                vaciarperfil();   
                    
                }
               
            }
        }
        /////////////////////////////////////
        if (vista.getJbOK().getText().equals("ELIMINAR")) {
            if (lleno()) {
                setearDatosmod();
                modelo.eliminar(Integer.parseInt(vista.getTxtIdExtras().getText()));
                visualizar(0);
                JOptionPane.showMessageDialog(null, "Eliminado correctamente");
                vaciarperfil();
            }

        }

    }

    public void setearDatos() {
        try {
            modelo.setNombre(vista.getTxtNombre().getText());
            modelo.setPrecio(Double.parseDouble(vista.getTxtPrecio().getText()));
            modelo.setExistencias(Integer.parseInt(vista.getTxtExistencias().getText()));
            rs2 = modeloc.obtener_idcate(vista.getCbCategoria().getSelectedItem().toString());
            rs2.next();
            int nom = rs2.getInt(1);
            modelo.setId_categoria(nom);
        } catch (SQLException ex) {
            Logger.getLogger(cExtra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setearDatosmod() {
        try {
            modelo.setCodigo(Integer.parseInt(vista.getTxtIdExtras().getText()));
            modelo.setNombre(vista.getTxtNombre().getText());
            modelo.setPrecio(Double.parseDouble(vista.getTxtPrecio().getText()));
            modelo.setExistencias(Integer.parseInt(vista.getTxtExistencias().getText()));
            rs2 = modeloc.obtener_idcate(vista.getCbCategoria().getSelectedItem().toString());
            rs2.next();
            int nom = rs2.getInt(1);
            modelo.setId_categoria(nom);
        } catch (SQLException ex) {
            Logger.getLogger(cExtra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void seleccionar(JTable t) {
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    String p = t.getValueAt(t.getSelectedRow(), 0).toString();
                    id = Integer.parseInt(p);
                    String p2 = t.getValueAt(t.getSelectedRow(), 0).toString();
                    id = Integer.parseInt(p);
                    llenarPerfil();
                    desckboton(false);

                }
            }
        });
    }

    public void llenarPerfil() {
        rs = modelo.obtener_extra(id);
        if (rs != null) {
            try {
                while (rs.next()) {
                    vista.getTxtIdExtras().setText(String.valueOf(rs.getInt(1)));//codigo
                    vista.getTxtNombre().setText(rs.getString(2));//nombre
                    vista.getTxtPrecio().setText(rs.getString(3));//precio
                    categorias = modeloc.listar(rs.getInt(4));
                    vista.getCbCategoria().setSelectedItem(categorias.get(0).getNombre());
                    vista.getTxtExistencias().setText(rs.getString(5));//existencias
                }
            } catch (SQLException ex) {
                Logger.getLogger(cCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void llenarcate(JComboBox cb) {
        try {
            cb.removeAllItems();
            cb.addItem("Seleccione...");
            rs = modeloc.obtener_cate();
            while (rs.next()) {
                cb.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
        }
    }

    public void vaciarperfil() {

        vista.getTxtIdExtras().setText("Autoasignado");
        vista.getTxtNombre().setText("");
        vista.getTxtPrecio().setText("");
        vista.getTxtExistencias().setText("");
        vista.getCbCategoria().setSelectedIndex(0);

    }

    public void desckboton(boolean modo) {
        vista.getTxtNombre().setEditable(modo);
        vista.getTxtPrecio().setEditable(modo);
        vista.getTxtExistencias().setEditable(modo);
        vista.getCbCategoria().setEnabled(modo);
    }

    public boolean lleno() {
        boolean llen;
        if (vista.getTxtNombre().getText().isEmpty() || vista.getTxtPrecio().getText().isEmpty() || vista.getTxtExistencias().getText().isEmpty()
                || vista.getCbCategoria().getSelectedIndex() == 0) {
            llen = false;
            JOptionPane.showMessageDialog(null, "COMPLETE TODOS LOS CAMPOS");
        } else {

            llen = true;

        }
        return llen;
    }
    
        public void controlKey() {
        vista.getTxtNombre().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras_espacios(vista.getTxtNombre(), 50); 
            }
        });
        vista.getTxtExistencias().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.numero(vista.getTxtExistencias(), 3);
            }
        });
        vista.getTxtPrecio().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.dinero(vista.getTxtPrecio(), 7);
            }
        });
        vista.getTxtBuscar().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                FiltrarTabla.filtrar(vista.getJtExtras(), vista.getTxtBuscar(), vista.getCbColumnas());
            }
        });
    }

    public boolean valisala() {
        boolean f;
        try {
            Double salario = Double.valueOf(vista.getTxtPrecio().getText());
            f = true;
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Precio invalido");
            f = false;
        }
        return f;
    }
}
