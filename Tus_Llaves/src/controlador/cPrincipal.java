package controlador;

import controlador.otros.RoundedLabel;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import modelo.mAlquiler;
import modelo.mAuto;
import modelo.mCliente;
import modelo.mConductor;
import modelo.mEmpleado;
import modelo.mExtra;
import modelo.mImagen;
import modelo.mPersona;
import modelo.tablas.Persona;
import reportes.Reporte;
import vista.Login;
import vista.cabecera;
import vista.vAlquiler;
import vista.vAuto;
import vista.vCliente;
import vista.vConductor;
import vista.vDevolucion;
import vista.vEmpleado;
import vista.vExtras;
import vista.vPrincipal;

public final class cPrincipal {
    DefaultListModel<String> modList;
    private String nombre = "";
    private String cedula = "";
    vPrincipal vista;
    vCliente vcliente;
    vConductor vconductor;
    vEmpleado vempleado;
    vAuto vauto;
    vExtras vextras;
    vAlquiler valquiler;
    vDevolucion vdevolucion;
    mPersona Mpersona = new mPersona();
    mEmpleado modeloE = new mEmpleado();
    private DrawerController dave;
    mImagen mi = new mImagen();
    RoundedLabel rl = new RoundedLabel();
    String cargo = "";
    List<Persona> personas = new ArrayList<>();
    Reporte r = new Reporte();
    cabecera foto;
    public cPrincipal(vPrincipal vista) throws IOException, SQLException {
        this.vista = vista;
    }
    
    public void iniciar(int a) throws IOException, SQLException {
        vista.setVisible(true);
        vista.getMI_prefil();
        llenar(a);
        
        foto = new cabecera(iconoPerfil(clogin.cedulaCliente),nombre);
        foto.getImageAvatar1().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Perfil();
            }
        });
        vista.getJtpPrincipal().addChangeListener(l-> menuResumen());
        vista.getBtnActividadFiltro().addActionListener(l-> setActividadFiltrada());
        vista.getMI_prefil().addActionListener(l -> Perfil());
        vista.getJmSalir().addActionListener(l -> Cerrar());
        funciones();
    }

    public void setBordeButton() {
        UIManager.put("Button.arc", 100);
        UIManager.put("Component.arc", 100);
        UIManager.put("ProgressBar.arc", 100);
        UIManager.put("TextComponent.arc", 100);
    }
   

    public void verJdTemas(boolean ver) {
        vista.getJdTemas().setTitle("Listado de temas");
        vista.getJdTemas().setSize(300, 358);
        vista.getJdTemas().setLocationRelativeTo(vista);
        vista.getJdTemas().setVisible(ver);
    }
    
    public void menuCliente() {

        mCliente modper = new mCliente();
        try {
            vista.getJdPrincipal().add(vcliente);
        } catch (Exception e) {
            vcliente = new vCliente();
            vista.getJdPrincipal().add(vcliente);
        }

        cCliente controlador = new cCliente(modper, vcliente);
    }

    public void menuConductor() {

        mConductor m_conductor = new mConductor();
        try {
            vista.getJdPrincipal().add(vconductor);
        } catch (Exception e) {
            vconductor = new vConductor();
            vista.getJdPrincipal().add(vconductor);
        }

        cConductor c_conductor = new cConductor(m_conductor, vconductor);
    }

    public void menuEmpelado() {

        mEmpleado m_empleado = new mEmpleado();
        try {
            vista.getJdPrincipal().add(vempleado);
        } catch (Exception e) {
            vempleado = new vEmpleado();
            vista.getJdPrincipal().add(vempleado);
        }

        cEmpleado c_empleado = new cEmpleado(m_empleado, vempleado);
    }

    public void MenuAutos() {
        mAuto modeloAutos = new mAuto();
        try {
            vista.getJdPrincipal().add(vauto);
        } catch (Exception e) {
            vauto = new vAuto();
            vista.getJdPrincipal().add(vauto);
        }
        cAuto contolAutomovil = new cAuto(modeloAutos, vauto);
        contolAutomovil.iniciarCtrlBtn();
    }

    public void menuExtras() {
        mExtra modextra = new mExtra();
        try {
            vista.getJdPrincipal().add(vextras);
        } catch (Exception e) {
            vextras = new vExtras();
            vista.getJdPrincipal().add(vextras);
        }
        cExtra controlador = new cExtra(modextra, vextras);
    }
    
     public void menuAlquiler() {

        mAlquiler moalquiler = new mAlquiler();
        try {
            vista.getJdPrincipal().add(valquiler);
        } catch (Exception e) {
            valquiler = new vAlquiler();
            vista.getJdPrincipal().add(valquiler);
        }
        cAlquiler controlador = new cAlquiler(valquiler,moalquiler);
    }
     
     public void menuDevolucion() {
        try {
            vista.getJdPrincipal().add(vdevolucion);
        } catch (Exception e) {
            vdevolucion = new vDevolucion();
            vista.getJdPrincipal().add(vdevolucion);
        }
        cDevolucion controlador = new cDevolucion(vdevolucion);
    }

    public void Desplegar(){
        if(dave.isShow()){
            dave.hide();
        }else{
            dave.show();
        }
    }

    public void Cerrar() {
        vista.dispose(); 
        Login vista = new Login();
        mCliente cliente = new mCliente();
        clogin inicio = new clogin(vista,cliente);
        inicio.Iniciar();
    }

    public void Perfil() {
        vista.getPerfil().setVisible(true);
        vista.getPerfil().setSize(835, 426);
        vista.getPerfil().setLocationRelativeTo(null);
    }

    public void getIcon() throws SQLException{
        mi = mi.BuscarImagen(clogin.cedulaCliente);
        if (mi.getValor() == null) {
            vista.getJL_foto().setIcon(null);
        } else {
            try {
                byte[] valor = mi.getValor();
                InputStream inputStream = new ByteArrayInputStream(valor);
                BufferedImage bufferedImage = ImageIO.read(inputStream);
                //Llama al método setRoundedImage
                rl.setRoundedImage2(bufferedImage, vista.getJL_foto());
            } catch (IOException ex) {
                vista.getJL_foto().setIcon(null);
            }
        }
    }

    public void llenar(int a) throws SQLException {
        if(a == 0){           
            personas = Mpersona.buscar(clogin.cedulaCliente, "CEDULA");
            Persona cliente = new Persona();
            cliente = personas.get(0);
            vista.getLb_nombres().setText(cliente.getNombre1() + " " + cliente.getNombre2());
            vista.getLb_apellidos().setText(cliente.getApellido1() + " " + cliente.getApellido2());
            vista.getLb_correo().setText(cliente.getCorreo());
            vista.getLb_direccion().setText(cliente.getDireccion());
            vista.getLb_telefono().setText(cliente.getTelefono());
            cedula = cliente.getCedula();
            vista.getLb_sexo().setText(cliente.getSexo());
            vista.getLb_edad().setText(String.valueOf(ObtenerEdad(cliente.getFecha_nac())));
            getIcon();
            nombre = cliente.getNombre1();
            vista.getTitulo_texto().setText("CLIENTE");
        }else{
            vista.getLb_nombres().setText(clogin.empleado.getNombre1() + " " + clogin.empleado.getNombre2());
            vista.getLb_apellidos().setText(clogin.empleado.getApellido1() + " " + clogin.empleado.getApellido2());
            vista.getLb_correo().setText(clogin.empleado.getCorreo());
            vista.getLb_direccion().setText(clogin.empleado.getDireccion());
            vista.getLb_telefono().setText(clogin.empleado.getTelefono());
            vista.getLb_sexo().setText(clogin.empleado.getSexo());
            vista.getLb_edad().setText(String.valueOf(ObtenerEdad(clogin.empleado.getFecha_nac())));
            nombre = clogin.empleado.getNombre1();
            getIcon();
            Cargos(modeloE.Cargo(clogin.empleado.getCedula()));
        }
    }

    public void Cargos(String cargo){
        switch(cargo){
            case "Administrador":
                ImageIcon icon = new ImageIcon("vista.img/administrador_salir.png");
                vista.getTitulo_texto().setText("ADMINISTRADOR");
                break;
            case "Comerciante":
                vista.getTitulo_texto().setText("COMERCIANTE");
                vista.getMiCliente().setVisible(false);
                vista.getMiEmpleado().setVisible(false);
                vista.getMiConductor().setVisible(false);
                
                break;
            case "Conductor":
                vista.getTitulo_texto().setText("CONDUCTOR");
                break;
            case "Cliente":
                vista.getTitulo_texto().setText("CLIENTE");
                
                break;
        }
    }

    public long ObtenerEdad(Date fechaNacimiento) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaNacimiento);
        LocalDate selectedDate = LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));
        long años;
        LocalDate birthday = LocalDate.now();
        años = ChronoUnit.DAYS.between(selectedDate, birthday);
        años = años / 365;
        return años;
    }
    
    public ImageIcon iconoPerfil(String cedula) throws IOException, SQLException{
        mi = mi.BuscarImagen(cedula);
        byte[] valor = mi.getValor();
        InputStream inputStream = new ByteArrayInputStream(valor);
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        ImageIcon icon = new ImageIcon(bufferedImage);
        return icon;
    }
     public void funciones() {
        if (vista.getTitulo_texto().getText().equals("CLIENTE") || vista.getTitulo_texto().getText().equals("Cliente")) {
            vista.getX1().setVisible(false);
            vista.getX2().setVisible(false);
            vista.getXjlActividad().setVisible(false);
            vista.getXjlActividadFiltrada().setVisible(false);
            vista.getBtnActividadFiltro().setVisible(false);
            vista.getJdcFechaFin().setVisible(false);
            vista.getJdcFechaIni().setVisible(false);
            vista.getXjScrollPane2().setVisible(false);
            vista.getXjScrollPane1().setVisible(false);
            //mis reportes
            vista.getRmContratos().addActionListener(l -> r.print_contratoscli(cedula));
            vista.getRmDelovoluciones().addActionListener(l -> r.print_devolucionescli(cedula));
            vista.getRmPrestamos().addActionListener(l -> r.print_alquilerescli(cedula));

            vista.getjMenu3().setVisible(false);
            vista.getRmPrestamos().setText("Mis prestamos");
            vista.getRmDelovoluciones().setText("Mis devoluciones");
            vista.getRmContratos().setText("Mis contratos");
            vista.getMenu_desplegable().addActionListener(l -> Desplegar());
            dave = Drawer.newDrawer(this.vista).header(foto)
                    .space(5)
                    .separator(2, new Color(173, 173, 173))
                    .background(new Color(135, 206, 250))
                    .backgroundTransparent(0.3f)
                    .duration(300)
                    .enableScroll(true)
                    .addChild(new DrawerItem("Mis préstamos").icon(new ImageIcon(getClass().getResource("/vista/img/menu/user.png"))).build())
                    .addChild(new DrawerItem("Mis devoluciones").icon(new ImageIcon(getClass().getResource("/vista/img/menu/data.png"))).build())
                    .addChild(new DrawerItem("Mis contratos").icon(new ImageIcon(getClass().getResource("/vista/img/menu/income.png"))).build())
                    .addFooter(new DrawerItem("SALIR ").icon(new ImageIcon(getClass().getResource("/vista/img/menu/exit.png"))).build())
                    .event(new EventDrawer() {
                        @Override
                        public void selected(int i, DrawerItem di) {
                            System.out.println(i);
                            switch (i) {
                                 case 0:
                                    r.print_alquilerescli(cedula);
                                    break;
                                case 1:
                                    r.print_devolucionescli(cedula);
                                    break;
                                case 2:
                                    r.print_contratoscli(cedula);
                                    break;
                                case 3:
                                    Cerrar();
                                    break;
                            }
                        }
                    })
                    .build();
        }
        if (vista.getTitulo_texto().getText().equals("COMERCIANTE") || vista.getTitulo_texto().getText().equals("Comerciante")) {
            vista.getX1().setVisible(false);
            vista.getX2().setVisible(false);
            vista.getXjlActividad().setVisible(false);
            vista.getXjlActividadFiltrada().setVisible(false);
            vista.getBtnActividadFiltro().setVisible(false);
            vista.getJdcFechaFin().setVisible(false);
            vista.getJdcFechaIni().setVisible(false);
            vista.getXjScrollPane2().setVisible(false);
            vista.getXjScrollPane1().setVisible(false);
            vista.getjMenu3().setVisible(true);
            //mis acciones
            vista.getjMenu4().setVisible(false);
            vista.getMiExtras().setVisible(false);
            vista.getMiAutomovil().setVisible(false);
            vista.getMiCliente().setVisible(true);
            vista.getMiCliente().addActionListener(l -> menuCliente());
            vista.getMiAlquiler().addActionListener(l -> menuAlquiler());
            vista.getMiDevolución().addActionListener(l -> menuDevolucion());
            
            
            
            vista.getRmPrestamos().setText("Mis alquileres");
            vista.getRmPrestamos().setText("Mis devoluciones");
            vista.getRmPrestamos().setText("Mis multas");
            vista.getMenu_desplegable().addActionListener(l -> Desplegar());
            dave = Drawer.newDrawer(this.vista).header(foto)
                    .space(5)
                    .separator(2, new Color(173, 173, 173))
                    .background(new Color(135, 206, 250))
                    .backgroundTransparent(0.3f)
                    .duration(300)
                    .enableScroll(true)
                    .addChild(new DrawerItem("Clientes").icon(new ImageIcon(getClass().getResource("/vista/img/menu/user.png"))).build())
                    .addChild(new DrawerItem("Alquileres").icon(new ImageIcon(getClass().getResource("/vista/img/menu/data.png"))).build())
                    .addChild(new DrawerItem("Devoluciones").icon(new ImageIcon(getClass().getResource("/vista/img/menu/income.png"))).build())
                    .addFooter(new DrawerItem("SALIR ").icon(new ImageIcon(getClass().getResource("/vista/img/menu/exit.png"))).build())
                    .event(new EventDrawer() {
                        @Override
                        public void selected(int i, DrawerItem di) {
                            System.out.println(i);
                            switch (i) {
                                 case 0:
                                    menuCliente();
                                    break;
                                case 1:
                                    menuAlquiler();
                                    break;
                                case 2:
                                    menuDevolucion();
                                    break;
                                case 3:
                                    Cerrar();
                                    break;
                            }
                        }
                    })
                    .build();
        }
        if (vista.getTitulo_texto().getText().equals("ADMINISTRADOR") || vista.getTitulo_texto().getText().equals("Administrador")) {
            vista.getX1().setVisible(true);
            vista.getX2().setVisible(true);
            vista.getXjlActividad().setVisible(true);
            vista.getXjlActividadFiltrada().setVisible(true);
            vista.getBtnActividadFiltro().setVisible(true);
            vista.getJdcFechaFin().setVisible(true);
            vista.getJdcFechaIni().setVisible(true);
            vista.getXjScrollPane2().setVisible(true);
            vista.getXjScrollPane1().setVisible(true);
            vista.getjMenu3().setVisible(true);
            vista.getMI_prefil().addActionListener(l -> Perfil());
            vista.getJmSalir().addActionListener(l -> Cerrar());
            vista.getMiCliente().addActionListener(l -> menuCliente());
            vista.getMiConductor().addActionListener(l -> menuConductor());
            vista.getMiAutomovil().addActionListener(l -> MenuAutos());
            vista.getMiExtras().addActionListener(l -> menuExtras());
            vista.getMiAlquiler().addActionListener(l -> menuAlquiler());
            vista.getMiEmpleado().addActionListener(l -> menuEmpelado());
            vista.getMiDevolución().addActionListener(l -> menuDevolucion());
            vista.getMenu_desplegable().addActionListener(l -> Desplegar());
            dave = Drawer.newDrawer(this.vista).header(foto)
                    .space(5)
                    .separator(2, new Color(173, 173, 173))
                    .background(new Color(135, 206, 250))
                    .backgroundTransparent(0.3f)
                    .duration(300)
                    .enableScroll(true)
                    .addChild(new DrawerItem("Cliente").icon(new ImageIcon(getClass().getResource("/vista/img/menu/user.png"))).build())
                    .addChild(new DrawerItem("Empleado").icon(new ImageIcon(getClass().getResource("/vista/img/menu/data.png"))).build())
                    .addChild(new DrawerItem("Conductor").icon(new ImageIcon(getClass().getResource("/vista/img/menu/income.png"))).build())
                    .addChild(new DrawerItem("Automóvil").icon(new ImageIcon(getClass().getResource("/vista/img/menu/expense.png"))).build())
                    .addChild(new DrawerItem("Alquiler").icon(new ImageIcon(getClass().getResource("/vista/img/menu/report.png"))).build())
                    .addChild(new DrawerItem("Devolución").icon(new ImageIcon(getClass().getResource("/vista/img/menu/data.png"))).build())
                    .addFooter(new DrawerItem("SALIR ").icon(new ImageIcon(getClass().getResource("/vista/img/menu/exit.png"))).build())
                    .event(new EventDrawer() {
                        @Override
                        public void selected(int i, DrawerItem di) {
                            System.out.println(i);
                            switch (i) {
                                case 0:
                                    menuCliente();
                                    break;
                                case 1:
                                    menuEmpelado();
                                    break;
                                case 2:
                                    menuConductor();
                                    break;
                                case 3:
                                    MenuAutos();
                                    break;
                                case 4:
                                    menuAlquiler();
                                    break;
                                case 5:
                                    menuDevolucion();
                                    break;
                                case 6:
                                    Cerrar();
                                    break;
                            }
                        }
                    })
                    .build();
            //controlar reportes:
            vista.getrClientes().addActionListener(l -> r.print_cliente());
            vista.getrEmpleados().addActionListener(l -> r.print_empleado());
            vista.getrConductores().addActionListener(l -> r.print_conductor());
            vista.getrAutos().addActionListener(l -> r.print_auto());
            vista.getRmPrestamos().addActionListener(l -> r.print_alquilerescli(cedula));
            vista.getRmDelovoluciones().addActionListener(l -> r.print_devolucionescli(cedula));
            vista.getRmContratos().addActionListener(l -> r.print_contratoscli(cedula));
        }

    }

    public void menuResumen() {
        int index = vista.getJtpPrincipal().getSelectedIndex();
        if (index == 1) {
            cResumen resumen = new cResumen(vista);
            resumen.setTOPS();
            resumen.setActividadHoy();
        }
    }
    
    public void setActividadFiltrada() {
        cResumen resumen = new cResumen(vista);
        resumen.setActividadFiltrada();
    }
}
