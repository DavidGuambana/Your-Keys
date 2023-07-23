package vista;
import LIB.FSButtonMD;
import controlador.otros.Button;
import controlador.otros.PasswordField;
import controlador.otros.RoundedLabel;
import controlador.otros.TextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class vPrincipal extends javax.swing.JFrame {

    public vPrincipal() {
        initComponents();
    }

    public JButton getJbGuardarTema() {
        return jbGuardarTema;
    }

    public JDialog getJdTemas() {
        return jdTemas;
    }

    public JList<String> getJlTemas() {
        return jlTemas;
    }

    public JDialog getJdLogin() {
        return jdLogin;
    }

    public JMenuItem getJmSalir() {
        return jmSalir;
    }

    public JMenuItem getMiAlquiler() {
        return miAlquiler;
    }

    public JMenuItem getMiAutomovil() {
        return miAutomovil;
    }

    public JMenuItem getMiCliente() {
        return miCliente;
    }

    public JMenuItem getMiConductor() {
        return miConductor;
    }

    public JMenuItem getMiDevolución() {
        return miDevolución;
    }

    public JMenuItem getMiEmpleado() {
        return miEmpleado;
    }

    public JMenuItem getMiExtras() {
        return miExtras;
    }
    

    public JDesktopPane getJdPrincipal() {
        return jdPrincipal;
    }

    public JMenuItem getJmI_menu() {
        return JmI_menu;
    }

    public void setJmI_menu(JMenuItem JmI_menu) {
        this.JmI_menu = JmI_menu;
    }

    public FSButtonMD getMenu_desplegable() {
        return Menu_desplegable;
    }

    public void setMenu_desplegable(FSButtonMD Menu_desplegable) {
        this.Menu_desplegable = Menu_desplegable;
    }

    public JPanel getExitBtn() {
        return exitBtn;
    }

    public void setExitBtn(JPanel exitBtn) {
        this.exitBtn = exitBtn;
    }

    public JLabel getExitTxt() {
        return exitTxt;
    }

    public void setExitTxt(JLabel exitTxt) {
        this.exitTxt = exitTxt;
    }

    public JLabel getJL_foto() {
        return JL_foto;
    }

    public void setJL_foto(JLabel JL_foto) {
        this.JL_foto = JL_foto;
    }

    public Button getBtn_inicio_sesion() {
        return Btn_inicio_sesion;
    }

    public void setBtn_inicio_sesion(Button Btn_inicio_sesion) {
        this.Btn_inicio_sesion = Btn_inicio_sesion;
    }

    public JLabel getJbl_cargo() {
        return jbl_cargo;
    }

    public void setJbl_cargo(JLabel jbl_cargo) {
        this.jbl_cargo = jbl_cargo;
    }



    public TextField getLg_cedula() {
        return Lg_cedula;
    }

    public void setLg_cedula(TextField Lg_cedula) {
        this.Lg_cedula = Lg_cedula;
    }

    public PasswordField getLg_contraseña() {
        return lg_contraseña;
    }

    public void setLg_contraseña(PasswordField lg_contraseña) {
        this.lg_contraseña = lg_contraseña;
    }

    public JLabel getLb_apellidos() {
        return lb_apellidos;
    }

    public void setLb_apellidos(JLabel lb_apellidos) {
        this.lb_apellidos = lb_apellidos;
    }

    public JLabel getLb_correo() {
        return lb_correo;
    }

    public void setLb_correo(JLabel lb_correo) {
        this.lb_correo = lb_correo;
    }

    public JLabel getLb_direccion() {
        return lb_direccion;
    }

    public void setLb_direccion(JLabel lb_direccion) {
        this.lb_direccion = lb_direccion;
    }

    public JLabel getLb_edad() {
        return lb_edad;
    }

    public void setLb_edad(JLabel lb_edad) {
        this.lb_edad = lb_edad;
    }

    public JLabel getLb_nombres() {
        return lb_nombres;
    }

    public void setLb_nombres(JLabel lb_nombres) {
        this.lb_nombres = lb_nombres;
    }

    public JLabel getLb_sexo() {
        return lb_sexo;
    }

    public void setLb_sexo(JLabel lb_sexo) {
        this.lb_sexo = lb_sexo;
    }

    public JLabel getLb_telefono() {
        return lb_telefono;
    }

    public void setLb_telefono(JLabel lb_telefono) {
        this.lb_telefono = lb_telefono;
    }

    public JMenuItem getMI_prefil() {
        return MI_prefil;
    }

    public void setMI_prefil(JMenuItem MI_prefil) {
        this.MI_prefil = MI_prefil;
    }

    public JDialog getPerfil() {
        return Perfil;
    }

    public void setPerfil(JDialog Perfil) {
        this.Perfil = Perfil;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdTemas = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jlTemas = new javax.swing.JList<>();
        jbGuardarTema = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jdLogin = new javax.swing.JDialog();
        background1 = new controlador.otros.Background();
        Panel_fondo = new javax.swing.JPanel();
        Lg_cedula = new controlador.otros.TextField();
        lg_contraseña = new controlador.otros.PasswordField();
        Btn_inicio_sesion = new controlador.otros.Button();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        Perfil = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        JL_foto = new RoundedLabel("", 200, 0x333333, 0x333333, 1.0f);
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jbl_cargo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lb_nombres = new javax.swing.JLabel();
        lb_apellidos = new javax.swing.JLabel();
        lb_edad = new javax.swing.JLabel();
        lb_telefono = new javax.swing.JLabel();
        lb_sexo = new javax.swing.JLabel();
        lb_correo = new javax.swing.JLabel();
        lb_direccion = new javax.swing.JLabel();
        Menu_desplegable = new LIB.FSButtonMD();
        jdPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        MI_prefil = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        JmI_menu = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        miCliente = new javax.swing.JMenuItem();
        miEmpleado = new javax.swing.JMenuItem();
        miConductor = new javax.swing.JMenuItem();
        miAutomovil = new javax.swing.JMenuItem();
        miAlquiler = new javax.swing.JMenuItem();
        miDevolución = new javax.swing.JMenuItem();
        miExtras = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();

        jdTemas.setBackground(new java.awt.Color(0, 0, 0));
        jdTemas.setMinimumSize(new java.awt.Dimension(282, 319));
        jdTemas.setResizable(false);

        jPanel5.setPreferredSize(new java.awt.Dimension(282, 320));

        jlTemas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlTemas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1. NimbusLookAndFeel", "2. FlatArcDarkIJTheme", "3. FlatArcDarkOrangeIJTheme", "4. FlatArcOrangeIJTheme", "5. FlatDarkPurpleIJTheme", "6. FlatDarculaLaf", "7. FlatGitHubIJTheme", "8. FlatIntelliJLaf", "9. FlatLightLaf", "10. FlatMaterialDarkIJTheme", "11. FlatMaterialDeepOceanIJTheme", "12. FlatMaterialDesignDarkIJTheme", "13. FlatMaterialLighterIJTheme", "14. FlatMaterialOceanicIJTheme", "15. FlatMaterialPalenightIJTheme" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlTemas.setFixedCellHeight(30);
        jlTemas.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(jlTemas);

        jbGuardarTema.setBackground(new java.awt.Color(0, 0, 0));
        jbGuardarTema.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbGuardarTema.setForeground(new java.awt.Color(255, 255, 255));
        jbGuardarTema.setText("Guardar");
        jbGuardarTema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbGuardarTema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jbGuardarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jdTemasLayout = new javax.swing.GroupLayout(jdTemas.getContentPane());
        jdTemas.getContentPane().setLayout(jdTemasLayout);
        jdTemasLayout.setHorizontalGroup(
            jdTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );
        jdTemasLayout.setVerticalGroup(
            jdTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdTemasLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jdLogin.setBackground(new java.awt.Color(0, 0, 0));
        jdLogin.setMinimumSize(new java.awt.Dimension(282, 319));
        jdLogin.setUndecorated(true);

        background1.setBlur(Panel_fondo);

        Panel_fondo.setOpaque(false);

        Lg_cedula.setText("0107178527");
        Lg_cedula.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Lg_cedula.setHint("Cedula");

        lg_contraseña.setText("1234567890");
        lg_contraseña.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lg_contraseña.setHint("Contraseña");

        Btn_inicio_sesion.setForeground(new java.awt.Color(255, 255, 255));
        Btn_inicio_sesion.setText("INICIAR SESIÓN");
        Btn_inicio_sesion.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");

        javax.swing.GroupLayout Panel_fondoLayout = new javax.swing.GroupLayout(Panel_fondo);
        Panel_fondo.setLayout(Panel_fondoLayout);
        Panel_fondoLayout.setHorizontalGroup(
            Panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_fondoLayout.createSequentialGroup()
                .addGroup(Panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_fondoLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(Btn_inicio_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_fondoLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(Panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lg_cedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lg_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))
                    .addGroup(Panel_fondoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        Panel_fondoLayout.setVerticalGroup(
            Panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_fondoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(Lg_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lg_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(Btn_inicio_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Your  Keys");

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                        .addComponent(Panel_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(125, 125, 125));

        exitTxt.setBackground(new java.awt.Color(105, 105, 105));
        exitTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setOpaque(true);

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(598, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jdLoginLayout = new javax.swing.GroupLayout(jdLogin.getContentPane());
        jdLogin.getContentPane().setLayout(jdLoginLayout);
        jdLoginLayout.setHorizontalGroup(
            jdLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdLoginLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jdLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jdLoginLayout.setVerticalGroup(
            jdLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdLoginLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jdLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jdLoginLayout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 510, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        JL_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_foto.setMaximumSize(new java.awt.Dimension(160, 160));
        JL_foto.setMinimumSize(new java.awt.Dimension(160, 160));
        JL_foto.setPreferredSize(new java.awt.Dimension(160, 160));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CARGO");

        jbl_cargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_cargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/administrador_salir.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbl_cargo, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JL_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(JL_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jbl_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel3.setBackground(new java.awt.Color(239, 239, 239));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("NOMBRES:");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("APELLIDOS:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("EDAD:");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("TELÉFONO:");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("DIRECCIÓN:");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DATOS PERSONALES");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("CORREO:");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("SEXO:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lb_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(lb_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(lb_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(lb_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(lb_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(lb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lb_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PerfilLayout = new javax.swing.GroupLayout(Perfil.getContentPane());
        Perfil.getContentPane().setLayout(PerfilLayout);
        PerfilLayout.setHorizontalGroup(
            PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PerfilLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PerfilLayout.setVerticalGroup(
            PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        Menu_desplegable.setBackground(new java.awt.Color(204, 204, 204));
        Menu_desplegable.setText("|||");
        Menu_desplegable.setColorHover(new java.awt.Color(51, 51, 51));
        Menu_desplegable.setColorTextNormal(new java.awt.Color(0, 0, 0));
        Menu_desplegable.setColorTextPressed(new java.awt.Color(204, 204, 204));
        Menu_desplegable.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Menu_desplegable.setOpaque(false);

        jdPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jdPrincipal.setMinimumSize(new java.awt.Dimension(840, 480));
        jdPrincipal.setName(""); // NOI18N
        jdPrincipal.setOpaque(false);

        javax.swing.GroupLayout jdPrincipalLayout = new javax.swing.GroupLayout(jdPrincipal);
        jdPrincipal.setLayout(jdPrincipalLayout);
        jdPrincipalLayout.setHorizontalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jdPrincipalLayout.setVerticalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jMenu2.setText("Opciones");

        MI_prefil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/perfil.png"))); // NOI18N
        MI_prefil.setText("Perfil");
        MI_prefil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_prefilActionPerformed(evt);
            }
        });
        jMenu2.add(MI_prefil);

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/salida.png"))); // NOI18N
        jmSalir.setText("Salir");
        jMenu2.add(jmSalir);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Resumen");

        JmI_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/comunidad.png"))); // NOI18N
        JmI_menu.setText("Comunidad");
        jMenu4.add(JmI_menu);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/flecha-hacia-arriba.png"))); // NOI18N
        jMenuItem3.setText("Prestamos");
        jMenu4.add(jMenuItem3);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/flecha-hacia-abajo.png"))); // NOI18N
        jMenuItem5.setText("Devoluciones");
        jMenu4.add(jMenuItem5);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/multa.png"))); // NOI18N
        jMenuItem4.setText("Multas");
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Crear");

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/google-mas.png"))); // NOI18N
        jMenu6.setText("Registro");

        miCliente.setText("Cliente");
        jMenu6.add(miCliente);

        miEmpleado.setText("Empleado");
        jMenu6.add(miEmpleado);

        miConductor.setText("Conductor");
        jMenu6.add(miConductor);

        miAutomovil.setText("Automóvil");
        jMenu6.add(miAutomovil);

        miAlquiler.setText("Alquiler");
        jMenu6.add(miAlquiler);

        miDevolución.setText("Devolución");
        jMenu6.add(miDevolución);

        miExtras.setText("Extras");
        jMenu6.add(miExtras);

        jMenu3.add(jMenu6);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/impresora.png"))); // NOI18N
        jMenu5.setText("Reporte");

        jMenuItem10.setText("Cliente");
        jMenu5.add(jMenuItem10);

        jMenuItem11.setText("Empleado");
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Conductor");
        jMenu5.add(jMenuItem12);

        jMenuItem13.setText("Automóvil");
        jMenu5.add(jMenuItem13);

        jMenuItem17.setText("Alquiler");
        jMenu5.add(jMenuItem17);

        jMenuItem18.setText("Devolución");
        jMenu5.add(jMenuItem18);

        jMenu3.add(jMenu5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu_desplegable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Menu_desplegable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MI_prefilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_prefilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MI_prefilActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controlador.otros.Button Btn_inicio_sesion;
    private javax.swing.JLabel JL_foto;
    private javax.swing.JMenuItem JmI_menu;
    private controlador.otros.TextField Lg_cedula;
    private javax.swing.JMenuItem MI_prefil;
    private LIB.FSButtonMD Menu_desplegable;
    private javax.swing.JPanel Panel_fondo;
    private javax.swing.JDialog Perfil;
    private controlador.otros.Background background1;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbGuardarTema;
    private javax.swing.JLabel jbl_cargo;
    private javax.swing.JDialog jdLogin;
    private javax.swing.JDesktopPane jdPrincipal;
    private javax.swing.JDialog jdTemas;
    private javax.swing.JList<String> jlTemas;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JLabel lb_apellidos;
    private javax.swing.JLabel lb_correo;
    private javax.swing.JLabel lb_direccion;
    private javax.swing.JLabel lb_edad;
    private javax.swing.JLabel lb_nombres;
    private javax.swing.JLabel lb_sexo;
    private javax.swing.JLabel lb_telefono;
    private controlador.otros.PasswordField lg_contraseña;
    private javax.swing.JMenuItem miAlquiler;
    private javax.swing.JMenuItem miAutomovil;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miConductor;
    private javax.swing.JMenuItem miDevolución;
    private javax.swing.JMenuItem miEmpleado;
    private javax.swing.JMenuItem miExtras;
    // End of variables declaration//GEN-END:variables
}
