package controlador;

import controlador.otros.FiltrarTabla;
import controlador.otros.RoundedLabel;
import controlador.otros.Validar;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.mConductor;
import modelo.tablas.Conductor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.mCargo;
import modelo.mEmpleado;
import modelo.mImagen;
import modelo.mPersona;
import modelo.tablas.Empleado;
import modelo.tablas.Imagen;
import modelo.tablas.Persona;
import vista.vConductor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.image.BufferedImage;
public final class cConductor {

    private final mConductor modelo;
    private final vConductor vista;
    List<Conductor> conductores = new ArrayList<>();
    List<Persona> persona = new ArrayList<>();
    List<Empleado> empleado = new ArrayList<>();
    mPersona mp = new mPersona();
    mEmpleado me = new mEmpleado();
    mCargo mc = new mCargo();
    double salario = 0.0, precio_hora = 0.0;
    DefaultTableModel dtm;
    String[] columnas = {"ID", "ID empleado", "Licencia", "Tipo de licencia", "Precio/Hora"};
    int id;
    ResultSet rs = null;

    mImagen mi = new mImagen();
    List<Imagen> imagenes = new ArrayList<>();
    String ruta = "";
    RoundedLabel rl = new RoundedLabel();
    public cConductor(mConductor modelo, vConductor vista) {
        this.modelo = modelo;
        this.vista = vista;
        iniciar();
        this.vista.setVisible(true);
    }

    public void iniciar() {
        validar();
        listar();
        modo("Registrar");
        seleccionar(vista.getJtConductores());
        vista.getJb_ModoNuevo().addActionListener(l -> {
            modo("Registrar");
        });
        vista.getJb_ModoEditar().addActionListener(l -> {
            modo("Actualizar");
        });
        vista.getJb_ModoVista().addActionListener(l -> {
            modo("Eliminar");
        });
        vista.getJbOK().addActionListener(l -> OK());
        vista.getBtnExaminar().addActionListener(l -> examinarImagen());
    }

    public void listar() {
        dtm = new DefaultTableModel(null, columnas);
        conductores = modelo.listar("");
        conductores.stream().forEach(c -> dtm.addRow(new Object[]{c.getId_con(), c.getId_empleado(), c.getLicencia(),
            c.getTipo_licencia(), c.getPrecio_hora()}));

        vista.getJtConductores().setModel(dtm);
        vista.getJtConductores().setRowHeight(30);
    }

    public void llenar() {
        rs = modelo.join(id);
        if (rs != null) {
            try {
                vista.getTxtCedula().setText(rs.getString(1));
                vista.getTxtNombre1().setText(rs.getString(2));
                vista.getTxtNombre2().setText(rs.getString(3));
                vista.getTxtApellido1().setText(rs.getString(4));
                vista.getTxtApellido2().setText(rs.getString(5));
                vista.getJdcFechaNac().setDate(rs.getDate(6));
                vista.getTxtTelefono().setText(rs.getString(7));
                vista.getTxtDireccion().setText(rs.getString(8));
                vista.getTxtCorreo().setText(rs.getString(9));
                vista.getCbSexo().setSelectedItem(rs.getString(10));
                vista.getTxtSueldo().setText("" + rs.getDouble(11));
                vista.getTxtLicencia().setText(rs.getString(12));
                vista.getCbTipoLicencia().setSelectedItem(rs.getString(13));
                vista.getTxtPrecioHora().setText("" + rs.getDouble(14));
                mi.setId(rs.getInt(15));
                mi.setNombre(rs.getString(16));
                mi.setValor(rs.getBytes(17));
                getIcon();
            } catch (SQLException ex) {
            }
        }
    }

    public void seleccionar(JTable t) {
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    id = Integer.parseInt(t.getValueAt(t.getSelectedRow(), 0).toString());
                    modo("Actualizar");
                }
            }
        });
    }

    public void OK() {
        Date fecha;
        try {
            fecha = vista.getJdcFechaNac().getDate();
        } catch (Exception e) {
            fecha = null;
        }
        if (vista.getTxtCedula().getText().isEmpty() || vista.getTxtNombre1().getText().isEmpty() || vista.getTxtNombre2().getText().isEmpty() || vista.getTxtApellido1().getText().isEmpty() || vista.getTxtApellido2().getText().isEmpty()
                || fecha == null || vista.getTxtTelefono().getText().isEmpty() || vista.getTxtDireccion().getText().isEmpty() || vista.getTxtCorreo().getText().isEmpty() || vista.getCbSexo().getSelectedIndex() == 0
                || vista.getTxtSueldo().getText().isEmpty() || vista.getTxtLicencia().getText().isEmpty() || vista.getCbTipoLicencia().getSelectedIndex() == 0 || vista.getTxtPrecioHora().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Aún tienes campos por completar!");
        } else {
            try {
                salario = Double.parseDouble(vista.getTxtSueldo().getText());
                try {
                    precio_hora = Double.parseDouble(vista.getTxtPrecioHora().getText());
                    boolean cedula_bien = Validar.cedula(vista.getTxtCedula().getText());
                    boolean edad_bien = Validar.edad(fecha);
                    boolean email_bien = Validar.correo(vista.getTxtCorreo());
                    if (cedula_bien && edad_bien && email_bien) {
                        if (!vista.getTxtCedula().getText().equals(vista.getTxtLicencia().getText())) {
                            JOptionPane.showMessageDialog(null, "¡La licencia no coincide con el número de cédula!", "Campo inválido", JOptionPane.WARNING_MESSAGE);
                        } else {
                            if (vista.getJbOK().getText().equals("Registrar")) {
                                registrar();
                                listar();
                            }
                            if (vista.getJbOK().getText().equals("Actualizar")) {
                                modelo.setId_con(id);
                                actualizar();
                                listar();
                            }
                            if (vista.getJbOK().getText().equals("Eliminar")) {
                                modelo.setId_con(id);
                                if (modelo.eliminar()) {
                                    JOptionPane.showMessageDialog(null, "¡Eliminación exitosa!", null, JOptionPane.INFORMATION_MESSAGE);
                                    modo("Registrar");
                                    listar();
                                } else {
                                    JOptionPane.showMessageDialog(null, "¡Este conductor está registrado en un contrato'!", "Eliminación restringida", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }

                    } else {
                        if (!cedula_bien) {
                            JOptionPane.showMessageDialog(null, "¡Número de cedula inválido!", "Campo inválido", JOptionPane.WARNING_MESSAGE);
                        }
                        if (!edad_bien) {
                            JOptionPane.showMessageDialog(null, "¡Edad no permitida!", "Campo inválido", JOptionPane.WARNING_MESSAGE);
                        }
                        if (!email_bien) {
                            JOptionPane.showMessageDialog(null, "¡Correo electrónico inválido!", "Campo inválido", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "¡Precio por hora inválido!", "Campo inválido", JOptionPane.WARNING_MESSAGE);
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "¡Salario inválido!", "Campo inválido", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void registrar() {
        conductores = modelo.buscar(vista.getTxtLicencia().getText(), "licencia");
        persona = mp.buscar(vista.getTxtCedula().getText(), "cedula");
        empleado = me.buscar(vista.getTxtCedula().getText(), "cedula_per");
        if (conductores.isEmpty()) {
            if (persona.isEmpty() && empleado.isEmpty()) {
                mi.crear();
                mp.setId_imagen(mi.ultimoID());
                setearPersona();
                mp.crear();
                setearEmpleado();
                me.crear();
                modelo.setId_empleado(me.ultimoID());
            }
            if (!persona.isEmpty() && empleado.isEmpty()) {
                setearEmpleado();
                me.crear();
                modelo.setId_empleado(me.ultimoID());
            }
            if (!persona.isEmpty() && !empleado.isEmpty()) {
                modelo.setId_empleado(empleado.get(0).getId());
            }
            setearConductor();
            modelo.crear();
            JOptionPane.showMessageDialog(null, "¡Registro exitoso!", null, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "¡Este conductor ya existe!", null, JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizar() {
        mi.actualizar();
        mp.setId_imagen(mi.getId());
        setearPersona();
        mp.actualizar();
        setearEmpleado();
        me.setCedula_per(vista.getTxtCedula().getText());
        me.actualizar();
        setearConductor();
        modelo.setLicencia(vista.getTxtLicencia().getText());
        modelo.actualizar();
        JOptionPane.showMessageDialog(null, "¡Actualización exitosa!", null, JOptionPane.INFORMATION_MESSAGE);
    }

    public void setearPersona() {
        mp.setCedula(vista.getTxtCedula().getText());
        mp.setNombre1(vista.getTxtNombre1().getText());
        mp.setNombre2(vista.getTxtNombre2().getText());
        mp.setApellido1(vista.getTxtApellido1().getText());
        mp.setApellido2(vista.getTxtApellido2().getText());
        Date fecha = vista.getJdcFechaNac().getDate();
        Long d = fecha.getTime();
        java.sql.Date nac = new java.sql.Date(d);
        mp.setFecha_nac(nac);
        mp.setTelefono(vista.getTxtTelefono().getText());
        mp.setDireccion(vista.getTxtDireccion().getText());
        mp.setCorreo(vista.getTxtCorreo().getText());
        mp.setSexo(vista.getCbSexo().getSelectedItem().toString());
    }

    public void setearEmpleado() {
        me.setCedula_per(vista.getTxtCedula().getText());
        me.setContraseña(null);
        me.setId_cargo(mc.obtenerID("Conductor"));
        me.setSalario(salario);
    }

    public void setearConductor() {
        modelo.setLicencia(vista.getTxtLicencia().getText());
        modelo.setTipo_licencia(vista.getCbTipoLicencia().getSelectedItem().toString());
        modelo.setPrecio_hora(salario);
        modelo.setPrecio_hora(precio_hora);
    }

    public void modo(String modo) {
        boolean editable = true;
        if (modo.equals("Registrar")) {
            vista.getTxtCedula().setEditable(true);
            vista.getTxtLicencia().setEditable(true);
            vista.getBtnExaminar().setEnabled(true);
            vista.getCbTipoLicencia().setEnabled(true);
            vista.getCbSexo().setEnabled(true);
            vista.getJdcFechaNac().setEnabled(true);
            vista.getTxtCedula().setText("");
            vista.getTxtNombre1().setText("");
            vista.getTxtNombre2().setText("");
            vista.getTxtApellido1().setText("");
            vista.getTxtApellido2().setText("");
            vista.getJdcFechaNac().setDate(null);
            vista.getTxtTelefono().setText("");
            vista.getTxtDireccion().setText("");
            vista.getTxtCorreo().setText("");
            vista.getCbSexo().setSelectedIndex(0);
            vista.getTxtLicencia().setText("");
            vista.getCbTipoLicencia().setSelectedIndex(0);
            vista.getTxtPrecioHora().setText("");
            vista.getTxtSueldo().setText("");
            vista.getLbFoto().setIcon(null);
            mi = new mImagen();
            vista.getLbModo().setText("Registrar conductor");
            vista.getJbOK().setText("Registrar");
        } else {
            llenar();
            vista.getTxtCedula().setEditable(false);
            vista.getTxtLicencia().setEditable(false);
            if (modo.equals("Eliminar")) {
                editable = false;
                vista.getLbModo().setText("Eliminar conductor");
                vista.getJbOK().setText("Eliminar");
            } else {
                vista.getLbModo().setText("Actualizar conductor");
                vista.getJbOK().setText("Actualizar");
            }
        }
        vista.getTxtNombre1().setEditable(editable);
        vista.getTxtNombre2().setEditable(editable);
        vista.getTxtApellido1().setEditable(editable);
        vista.getTxtApellido2().setEditable(editable);
        vista.getJdcFechaNac().setEnabled(editable);
        vista.getTxtTelefono().setEditable(editable);
        vista.getTxtDireccion().setEditable(editable);
        vista.getTxtCorreo().setEditable(editable);
        vista.getCbSexo().setEnabled(editable);
        vista.getCbTipoLicencia().setEnabled(editable);
        vista.getTxtPrecioHora().setEditable(editable);
        vista.getTxtSueldo().setEditable(editable);
        vista.getBtnExaminar().setEnabled(editable);
    }

    //setear iconos en la tabla por completar...
    public void setIconos(int id) {
        try {
            imagenes = mi.listar(id);
            byte[] valor = imagenes.get(0).getValor();
            InputStream inputStream = new ByteArrayInputStream(valor);
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            ImageIcon icon = new ImageIcon(bufferedImage.getScaledInstance(60, 60, id));
            vista.getLbFoto().setIcon(icon);
        } catch (IOException e) {
            vista.getLbFoto().setIcon(null);
        }
    }

    public void examinarImagen() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Seleccione una imagen JPG, PNG & GIF", "jpg", "png", "gif");
        fileChooser.setFileFilter(extensionFilter);
        if (fileChooser.showOpenDialog(vista) == JFileChooser.APPROVE_OPTION) {
            ruta = fileChooser.getSelectedFile().getAbsolutePath();
            Image image = new ImageIcon(ruta).getImage();
            ImageIcon icon = new ImageIcon(image.getScaledInstance(vista.getLbFoto().getWidth(), vista.getLbFoto().getHeight(), 0));
            vista.getLbFoto().setIcon(icon);
            mi.setNombre(fileChooser.getSelectedFile().getName());
            mi.setValor(getByte(ruta));
            getIcon();
        }
    }

    public byte[] getByte(String ruta) {
        File imagen = new File(ruta);
        try {
            byte[] icono = new byte[(int) imagen.length()];
            InputStream input = new FileInputStream(imagen);
            input.read(icono);
            return icono;
        } catch (IOException e) {
            return null;
        }
    }

    public void getIcon() {
    if (mi.getValor() == null) {
        vista.getLbFoto().setIcon(null);
    } else {
        try {
            byte[] valor = mi.getValor();
            InputStream inputStream = new ByteArrayInputStream(valor);
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            // Llama al método setRoundedImage
            rl.setRoundedImage2(bufferedImage, vista.getLbFoto());
        } catch (IOException ex) {
            vista.getLbFoto().setIcon(null);
        }
    }
}

    public void validar() {
        vista.getTxtCedula().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.numero(vista.getTxtCedula(), 10);
            }
        });
        vista.getTxtNombre1().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras(vista.getTxtNombre1(), 50);
            }
        });
        vista.getTxtNombre2().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras(vista.getTxtNombre2(), 50);
            }
        });
        vista.getTxtApellido1().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras(vista.getTxtApellido1(), 50);
            }
        });
        vista.getTxtApellido2().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras(vista.getTxtApellido2(), 50);
            }
        });
        vista.getTxtTelefono().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.numero(vista.getTxtTelefono(), 10);
            }
        });
        vista.getTxtDireccion().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.nombre_compuesto(vista.getTxtDireccion(), 250);
            }
        });

        vista.getTxtSueldo().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.dinero(vista.getTxtSueldo(), 7);
            }
        });

        vista.getTxtLicencia().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.numero(vista.getTxtLicencia(), 10);
            }
        });
        
        vista.getTxtPrecioHora().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.dinero(vista.getTxtPrecioHora(), 7);
            }
        });

        vista.getTxtBuscar().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                FiltrarTabla.filtrar(vista.getJtConductores(), vista.getTxtBuscar(), vista.getCbColumnas());
            }
        });
    }
    
}
