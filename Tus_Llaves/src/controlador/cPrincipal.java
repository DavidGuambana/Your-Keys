package controlador;

import controlador.otros.RoundedLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import modelo.mAlquiler;
import modelo.mAuto;
import modelo.mCliente;
import modelo.mConductor;
import modelo.mEmpleado;
import modelo.mExtra;
import modelo.mImagen;
import modelo.mPersona;
import reportes.Reporte;
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
    Reporte rep = new Reporte();
    
    public cPrincipal(vPrincipal vista) throws IOException, SQLException {
        this.vista = vista;
    }

    public void PrimerInicio(){
        vista.getJdLogin().setTitle("Iniciar Sesión");
        vista.getJdLogin().setSize(640, 535);
        vista.getJdLogin().setLocationRelativeTo(vista);
        vista.getJdLogin().setVisible(true);
        vista.getBtn_inicio_sesion().addActionListener(l -> {
            try {
                PrimerLogeo();
            } catch (SQLException ex) {
                Logger.getLogger(cPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(cPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
    public void iniciar() throws IOException {
        vista.getMI_prefil().addActionListener(l -> Perfil());
        vista.getJmSalir().addActionListener(l -> verJdLogin(true));
        vista.getMiCliente().addActionListener(l -> menuPersona());
        vista.getMiConductor().addActionListener(l -> menuConductor());
        vista.getMiAutomovil().addActionListener(l -> MenuAutos());
        vista.getMiExtras().addActionListener(l -> menuExtras());
        vista.getMiAlquiler().addActionListener(l-> menuAlquiler());
        vista.getMiEmpleado().addActionListener(l -> menuEmpelado());
        vista.getMiDevolución().addActionListener(l-> menuDevolucion());
        vista.getMenu_desplegable().addActionListener(l -> Desplegar());
        vista.getExitTxt().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Cerrar();
            }
        });
                dave = Drawer.newDrawer(this.vista).header(new cabecera(iconoPerfil(),nombre))
                .space(5)
                .separator(2, new Color(173,173,173))
                .background(new Color(135,206,250))
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
                .event(new EventDrawer(){
                @Override
                public void selected(int i, DrawerItem di) {
                    switch (i){
                        case 0:
                            menuPersona();
                            break;
                        case 1:
                            MenuAutos();
                            break;
                        case 2:
                            menuExtras();
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
                            break;
                        case 5:
                            
                            break;
                        case 6:
                            verJdLogin(true);
                            break;
                }
                }
                })
                .build();
                //controlar reportes:
                vista.getrClientes().addActionListener(l-> rep.print_cliente());
                vista.getrEmpleados().addActionListener(l-> rep.print_empleado());
                vista.getrConductores().addActionListener(l-> rep.print_conductor());
                vista.getrAutos().addActionListener(l-> rep.print_auto());
                vista.getJmresprestamos().addActionListener(l->rep.print_alquilerescli());
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
    
    public void verJdLogin(boolean ver) {
        vista.setVisible(false);
        vista.getJdLogin().setTitle("Iniciar Sesión");
        vista.getJdLogin().setSize(640, 535);
        vista.getJdLogin().setLocationRelativeTo(vista);
        vista.getJdLogin().setVisible(ver);
    }

    public void menuPersona() {

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
        System.exit(0);
    }

    public void Perfil() {
        vista.getPerfil().setVisible(true);
        vista.getPerfil().setSize(835, 426);
        vista.getPerfil().setLocationRelativeTo(null);
    }

    public void getIcon() {
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

    public void llenar() {
        vista.getLb_nombres().setText(Mpersona.getNombre1() + " " + Mpersona.getNombre2());
        vista.getLb_apellidos().setText(Mpersona.getApellido1() + " " + Mpersona.getApellido2());
        vista.getLb_correo().setText(Mpersona.getCorreo());
        vista.getLb_direccion().setText(Mpersona.getDireccion());
        vista.getLb_telefono().setText(Mpersona.getTelefono());
        vista.getLb_sexo().setText(Mpersona.getSexo());
        vista.getLb_edad().setText(String.valueOf(ObtenerEdad(Mpersona.getFecha_nac())));
    }

    public void Cargos(String cargo){
        switch(cargo){
            case "Administrador":
                ImageIcon icon = new ImageIcon("vista.img/administrador_salir.png");
                vista.getTitulo_texto().setText("ADMINISTRADOR");
                break;
            case "Comerciante":
                vista.getTitulo_texto().setText("COMERCIANTE");
                break;
            case "Conductor":
                vista.getTitulo_texto().setText("CONDUCTOR");
                break;
            case "":
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
    
    public ImageIcon iconoPerfil() throws IOException{
        byte[] valor = mi.getValor();
        InputStream inputStream = new ByteArrayInputStream(valor);
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        ImageIcon icon = new ImageIcon(bufferedImage);
        return icon;
    }
    
    public void PrimerLogeo() throws SQLException, IOException{
        char[] password = vista.getLg_contraseña().getPassword();
        String passwordString = new String(password);
        if(vista.getLg_cedula().getText().equals("") || passwordString.equals("")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR CEDULA Y CONTRASEÑA");
        }else{
            double salario = 0;
            ResultSet datos = modeloE.logeo(vista.getLg_cedula().getText(), passwordString);
            while(datos.next()){ 
                System.out.println(datos.getString(1));
                    mi.setValor(datos.getBytes(16));
                    mi.setNombre(datos.getString(15));
                    mi.setId(datos.getInt(14));
                    salario = datos.getDouble(13);
                    Mpersona.setNombre1(datos.getString(2));
                    Mpersona.setNombre2(datos.getString(3));
                    Mpersona.setApellido1(datos.getString(4));
                    Mpersona.setApellido2(datos.getString(5));
                    Mpersona.setTelefono(datos.getString(7));
                    Mpersona.setDireccion(datos.getString(8));
                    Mpersona.setCorreo(datos.getString(9));
                    Mpersona.setSexo(datos.getString(10));
                    cargo = datos.getString(12);
                    Mpersona.setFecha_nac(datos.getDate(6));
                    cedula = datos.getString(1);
                    nombre = datos.getString(2);
            }
            if(Mpersona.getNombre1() == null){
                JOptionPane.showMessageDialog(null, "NO ESTA REGISTRADO");
            }else{
                System.out.println(cargo);
                vista.getJdLogin().setVisible(false);
                llenar();
                Cargos(cargo);
                getIcon();
                vista.setVisible(true);
                this.iniciar();
            }
        }
    }
}
