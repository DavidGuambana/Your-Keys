package vista;
import LIB.FSButtonMD;
import com.toedter.calendar.JDateChooser;
import controlador.otros.RoundedLabel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import modelo.tablas.JDP_IMG;

public class vPrincipal extends javax.swing.JFrame {

    public vPrincipal() {
        initComponents();
    }

    public JLabel getX1() {
        return x1;
    }

    public JLabel getX2() {
        return x2;
    }

    public JLabel getXjlActividad() {
        return xjlActividad;
    }

    public JLabel getXjlActividadFiltrada() {
        return xjlActividadFiltrada;
    }

    public JScrollPane getXjScrollPane1() {
        return xjScrollPane1;
    }

    public JScrollPane getXjScrollPane2() {
        return xjScrollPane2;
    }

    public JMenu getjMenu4() {
        return jMenu4;
    }

    
    
    public JMenuItem getrAutos() {
        return rAutos;
    }

    public JMenuItem getrClientes() {
        return rClientes;
    }

    public JMenuItem getrConductores() {
        return rConductores;
    }

    public JMenuItem getrEmpleados() {
        return rEmpleados;
    }

    public JMenuItem getRmContratos() {
        return rmContratos;
    }

    public JMenuItem getRmDelovoluciones() {
        return rmDelovoluciones;
    }

    public JMenuItem getRmPrestamos() {
        return rmPrestamos;
    }

    public JTextField getTitulo_texto() {
        return titulo_texto;
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

    public FSButtonMD getMenu_desplegable() {
        return Menu_desplegable;
    }

    public void setMenu_desplegable(FSButtonMD Menu_desplegable) {
        this.Menu_desplegable = Menu_desplegable;
    }

    public JLabel getJL_foto() {
        return JL_foto;
    }

    public void setJL_foto(JLabel JL_foto) {
        this.JL_foto = JL_foto;
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

    public JMenuItem getMI_automovil() {
        return rAutos;
    }

    public void setMI_automovil(JMenuItem MI_automovil) {
        this.rAutos = MI_automovil;
    }

    public JMenu getjMenu3() {
        return jMenu3;
    }

    public JLabel getT1_A1() {
        return T1_A1;
    }

    public JLabel getT1_A2() {
        return T1_A2;
    }

    public JLabel getT1_A3() {
        return T1_A3;
    }

    public JLabel getT1_A4() {
        return T1_A4;
    }

    public JLabel getT1_A5() {
        return T1_A5;
    }

    public JLabel getT1_B1() {
        return T1_B1;
    }

    public JLabel getT1_B2() {
        return T1_B2;
    }

    public JLabel getT1_B3() {
        return T1_B3;
    }

    public JLabel getT1_B4() {
        return T1_B4;
    }

    public JLabel getT1_B5() {
        return T1_B5;
    }

    public JLabel getT2_A1() {
        return T2_A1;
    }

    public JLabel getT2_A2() {
        return T2_A2;
    }

    public JLabel getT2_A3() {
        return T2_A3;
    }

    public JLabel getT2_A4() {
        return T2_A4;
    }

    public JLabel getT2_A5() {
        return T2_A5;
    }

    public JLabel getT2_B1() {
        return T2_B1;
    }

    public JLabel getT2_B2() {
        return T2_B2;
    }

    public JLabel getT2_B3() {
        return T2_B3;
    }

    public JLabel getT2_B4() {
        return T2_B4;
    }

    public JLabel getT2_B5() {
        return T2_B5;
    }

    public JLabel getT3_A1() {
        return T3_A1;
    }

    public JLabel getT3_A2() {
        return T3_A2;
    }

    public JLabel getT3_A3() {
        return T3_A3;
    }

    public JLabel getT3_A4() {
        return T3_A4;
    }

    public JLabel getT3_A5() {
        return T3_A5;
    }

    public JLabel getT3_B1() {
        return T3_B1;
    }

    public JLabel getT3_B2() {
        return T3_B2;
    }

    public JLabel getT3_B3() {
        return T3_B3;
    }

    public JLabel getT3_B4() {
        return T3_B4;
    }

    public JLabel getT3_B5() {
        return T3_B5;
    }

    public JLabel getT4_A1() {
        return T4_A1;
    }

    public JLabel getT4_A2() {
        return T4_A2;
    }

    public JLabel getT4_A3() {
        return T4_A3;
    }

    public JLabel getT4_A4() {
        return T4_A4;
    }

    public JLabel getT4_A5() {
        return T4_A5;
    }

    public JLabel getT4_B1() {
        return T4_B1;
    }

    public JLabel getT4_B2() {
        return T4_B2;
    }

    public JLabel getT4_B3() {
        return T4_B3;
    }

    public JLabel getT4_B4() {
        return T4_B4;
    }

    public JLabel getT4_B5() {
        return T4_B5;
    }

    public JList<String> getJlActividad() {
        return jlActividad;
    }

    public JTabbedPane getJtpPrincipal() {
        return jtpPrincipal;
    }

    public JButton getBtnActividadFiltro() {
        return btnActividadFiltro;
    }

    public JDateChooser getJdcFechaFin() {
        return jdcFechaFin;
    }

    public JDateChooser getJdcFechaIni() {
        return jdcFechaIni;
    }

    public JList<String> getJlActividadFiltrada() {
        return jlActividadFiltrada;
    }

    public JLabel getLblFechas() {
        return xjlActividadFiltrada;
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
        Perfil = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        JL_foto = new RoundedLabel("", 200, 0x333333, 0x333333, 1.0f);
        jSeparator1 = new javax.swing.JSeparator();
        titulo_texto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        jtpPrincipal = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jdPrincipal = new JDP_IMG();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        xjScrollPane1 = new javax.swing.JScrollPane();
        jlActividad = new javax.swing.JList<>();
        xjlActividad = new javax.swing.JLabel();
        t1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        T1_B1 = new javax.swing.JLabel();
        T1_A1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        T1_B2 = new javax.swing.JLabel();
        T1_A2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        T1_B3 = new javax.swing.JLabel();
        T1_A3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        T1_A4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        T1_B4 = new javax.swing.JLabel();
        T1_B5 = new javax.swing.JLabel();
        T1_A5 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        t2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        T2_B1 = new javax.swing.JLabel();
        T2_A1 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        T2_B2 = new javax.swing.JLabel();
        T2_A2 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        T2_B3 = new javax.swing.JLabel();
        T2_A3 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        T2_A4 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        T2_B4 = new javax.swing.JLabel();
        T2_B5 = new javax.swing.JLabel();
        T2_A5 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        t3 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        T3_B1 = new javax.swing.JLabel();
        T3_A1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        T3_B2 = new javax.swing.JLabel();
        T3_A2 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        T3_B3 = new javax.swing.JLabel();
        T3_A3 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        T3_A4 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        T3_B4 = new javax.swing.JLabel();
        T3_B5 = new javax.swing.JLabel();
        T3_A5 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        t4 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        T4_B1 = new javax.swing.JLabel();
        T4_A1 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        T4_B2 = new javax.swing.JLabel();
        T4_A2 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        T4_B3 = new javax.swing.JLabel();
        T4_A3 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        T4_A4 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        T4_B4 = new javax.swing.JLabel();
        T4_B5 = new javax.swing.JLabel();
        T4_A5 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        xjScrollPane2 = new javax.swing.JScrollPane();
        jlActividadFiltrada = new javax.swing.JList<>();
        xjlActividadFiltrada = new javax.swing.JLabel();
        jdcFechaIni = new com.toedter.calendar.JDateChooser();
        x1 = new javax.swing.JLabel();
        btnActividadFiltro = new javax.swing.JButton();
        jdcFechaFin = new com.toedter.calendar.JDateChooser();
        x2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        MI_prefil = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        rmPrestamos = new javax.swing.JMenuItem();
        rmDelovoluciones = new javax.swing.JMenuItem();
        rmContratos = new javax.swing.JMenuItem();
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
        rClientes = new javax.swing.JMenuItem();
        rEmpleados = new javax.swing.JMenuItem();
        rConductores = new javax.swing.JMenuItem();
        rAutos = new javax.swing.JMenuItem();

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

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        JL_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_foto.setMaximumSize(new java.awt.Dimension(160, 160));
        JL_foto.setMinimumSize(new java.awt.Dimension(160, 160));
        JL_foto.setPreferredSize(new java.awt.Dimension(160, 160));

        titulo_texto.setEditable(false);
        titulo_texto.setBackground(new java.awt.Color(51, 51, 51));
        titulo_texto.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        titulo_texto.setForeground(new java.awt.Color(255, 255, 255));
        titulo_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(JL_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(titulo_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(JL_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(titulo_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        jPanel3.setBackground(new java.awt.Color(239, 239, 239));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("NOMBRES:");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("APELLIDOS:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("EDAD:");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("TELÉFONO:");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("DIRECCIÓN:");

        jLabel10.setBackground(new java.awt.Color(0, 153, 255));
        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PERFIL DE USUARIO");
        jLabel10.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("CORREO:");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("SEXO:");

        lb_nombres.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        lb_apellidos.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        lb_edad.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        lb_telefono.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        lb_sexo.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        lb_correo.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        lb_direccion.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

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
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_nombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lb_edad, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_correo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_direccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_nombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_edad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_sexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lb_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
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

        Menu_desplegable.setBackground(new java.awt.Color(204, 204, 204));
        Menu_desplegable.setText("|||");
        Menu_desplegable.setColorHover(new java.awt.Color(51, 51, 51));
        Menu_desplegable.setColorTextNormal(new java.awt.Color(0, 0, 0));
        Menu_desplegable.setColorTextPressed(new java.awt.Color(204, 204, 204));
        Menu_desplegable.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Menu_desplegable.setOpaque(false);
        Menu_desplegable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_desplegableActionPerformed(evt);
            }
        });

        jtpPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        jtpPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jtpPrincipal.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        jtpPrincipal.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jtpPrincipal.setInheritsPopupMenu(true);
        jtpPrincipal.setMaximumSize(new java.awt.Dimension(890, 480));
        jtpPrincipal.setMinimumSize(new java.awt.Dimension(890, 480));
        jtpPrincipal.setOpaque(true);
        jtpPrincipal.setPreferredSize(new java.awt.Dimension(890, 480));

        jdPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        jdPrincipal.setMinimumSize(new java.awt.Dimension(840, 480));
        jdPrincipal.setName(""); // NOI18N

        javax.swing.GroupLayout jdPrincipalLayout = new javax.swing.GroupLayout(jdPrincipal);
        jdPrincipal.setLayout(jdPrincipalLayout);
        jdPrincipalLayout.setHorizontalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jdPrincipalLayout.setVerticalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jtpPrincipal.addTab("Sistema", jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("");

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jlActividad.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        jlActividad.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "01-01-2002 15h00:00 - Auto creado!", "01-01-2002 15h00:00 - Auto actualizado!", "01-01-2002 15h00:00 - Cliente creado!", "01-01-2002 15h00:00 - Empleado actualizado!", "01-01-2002 15h00:00 - Conductor actualizado!!", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlActividad.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jlActividad.setSelectionForeground(new java.awt.Color(0, 204, 0));
        xjScrollPane1.setViewportView(jlActividad);

        xjlActividad.setBackground(new java.awt.Color(0, 204, 0));
        xjlActividad.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        xjlActividad.setForeground(new java.awt.Color(255, 255, 255));
        xjlActividad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xjlActividad.setText("Actividad de hoy");
        xjlActividad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        xjlActividad.setOpaque(true);

        t1.setBackground(new java.awt.Color(255, 255, 255));
        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel4.setBackground(new java.awt.Color(51, 0, 102));
        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Top 5 clientes con más alquileres");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jLabel4.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Rockwell Condensed", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("POSICIÓN");

        jLabel13.setFont(new java.awt.Font("Rockwell Condensed", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("NOMBRE & APELLIDO");

        jLabel14.setFont(new java.awt.Font("Rockwell Condensed", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("N°. ALQUILERES");

        T1_B1.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T1_B1.setForeground(new java.awt.Color(51, 51, 51));
        T1_B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T1_B1.setText("- - -");

        T1_A1.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T1_A1.setForeground(new java.awt.Color(51, 51, 51));
        T1_A1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T1_A1.setText("- - -");

        jLabel17.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("1");

        T1_B2.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T1_B2.setForeground(new java.awt.Color(51, 51, 51));
        T1_B2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T1_B2.setText("- - -");

        T1_A2.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T1_A2.setForeground(new java.awt.Color(51, 51, 51));
        T1_A2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T1_A2.setText("- - -");

        jLabel20.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("2");

        T1_B3.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T1_B3.setForeground(new java.awt.Color(51, 51, 51));
        T1_B3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T1_B3.setText("- - -");

        T1_A3.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T1_A3.setForeground(new java.awt.Color(51, 51, 51));
        T1_A3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T1_A3.setText("- - -");

        jLabel23.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("3");

        T1_A4.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T1_A4.setForeground(new java.awt.Color(51, 51, 51));
        T1_A4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T1_A4.setText("- - -");

        jLabel25.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("4");

        T1_B4.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T1_B4.setForeground(new java.awt.Color(51, 51, 51));
        T1_B4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T1_B4.setText("- - -");

        T1_B5.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T1_B5.setForeground(new java.awt.Color(51, 51, 51));
        T1_B5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T1_B5.setText("- - -");

        T1_A5.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T1_A5.setForeground(new java.awt.Color(51, 51, 51));
        T1_A5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T1_A5.setText("- - -");

        jLabel29.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("5");

        javax.swing.GroupLayout t1Layout = new javax.swing.GroupLayout(t1);
        t1.setLayout(t1Layout);
        t1Layout.setHorizontalGroup(
            t1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t1Layout.createSequentialGroup()
                .addGroup(t1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(t1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, t1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, t1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T1_A1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T1_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T1_A2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T1_B2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T1_A3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T1_B3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T1_A4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T1_B4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T1_A5, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T1_B5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        t1Layout.setVerticalGroup(
            t1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(t1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(t1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T1_A1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T1_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T1_A2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T1_B2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T1_A3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T1_B3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T1_A4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T1_B4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T1_A5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T1_B5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        t2.setBackground(new java.awt.Color(255, 255, 255));
        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel27.setBackground(new java.awt.Color(0, 51, 102));
        jLabel27.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Top 5 conductores más solicitados");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jLabel27.setOpaque(true);

        jLabel28.setFont(new java.awt.Font("Rockwell Condensed", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 153, 153));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("POSICIÓN");

        jLabel50.setFont(new java.awt.Font("Rockwell Condensed", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(153, 153, 153));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("NOMBRE & APELLIDO");

        jLabel51.setFont(new java.awt.Font("Rockwell Condensed", 0, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(153, 153, 153));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("N°. CONTRATOS");

        T2_B1.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T2_B1.setForeground(new java.awt.Color(51, 51, 51));
        T2_B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T2_B1.setText("- - -");

        T2_A1.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T2_A1.setForeground(new java.awt.Color(51, 51, 51));
        T2_A1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T2_A1.setText("- - -");

        jLabel52.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("1");

        T2_B2.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T2_B2.setForeground(new java.awt.Color(51, 51, 51));
        T2_B2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T2_B2.setText("- - -");

        T2_A2.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T2_A2.setForeground(new java.awt.Color(51, 51, 51));
        T2_A2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T2_A2.setText("- - -");

        jLabel53.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("2");

        T2_B3.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T2_B3.setForeground(new java.awt.Color(51, 51, 51));
        T2_B3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T2_B3.setText("- - -");

        T2_A3.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T2_A3.setForeground(new java.awt.Color(51, 51, 51));
        T2_A3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T2_A3.setText("- - -");

        jLabel54.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("3");

        T2_A4.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T2_A4.setForeground(new java.awt.Color(51, 51, 51));
        T2_A4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T2_A4.setText("- - -");

        jLabel55.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("4");

        T2_B4.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T2_B4.setForeground(new java.awt.Color(51, 51, 51));
        T2_B4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T2_B4.setText("- - -");

        T2_B5.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T2_B5.setForeground(new java.awt.Color(51, 51, 51));
        T2_B5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T2_B5.setText("- - -");

        T2_A5.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T2_A5.setForeground(new java.awt.Color(51, 51, 51));
        T2_A5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T2_A5.setText("- - -");

        jLabel56.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("5");

        javax.swing.GroupLayout t2Layout = new javax.swing.GroupLayout(t2);
        t2.setLayout(t2Layout);
        t2Layout.setHorizontalGroup(
            t2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t2Layout.createSequentialGroup()
                .addGroup(t2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(t2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, t2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, t2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T2_A1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T2_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T2_A2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T2_B2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T2_A3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T2_B3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T2_A4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T2_B4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T2_A5, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T2_B5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        t2Layout.setVerticalGroup(
            t2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t2Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(t2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(t2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T2_A1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T2_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T2_A2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T2_B2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T2_A3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T2_B3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T2_A4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T2_B4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T2_A5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T2_B5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        t3.setBackground(new java.awt.Color(255, 255, 255));
        t3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel30.setBackground(new java.awt.Color(0, 102, 51));
        jLabel30.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Top 5 autos más solicitados");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jLabel30.setOpaque(true);

        jLabel31.setFont(new java.awt.Font("Rockwell Condensed", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 153, 153));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("POSICIÓN");

        jLabel32.setFont(new java.awt.Font("Rockwell Condensed", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 153, 153));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("MATRÍCULA - MARCA & MODELO");

        jLabel33.setFont(new java.awt.Font("Rockwell Condensed", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 153, 153));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("N°. ALQUILADOS");

        T3_B1.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T3_B1.setForeground(new java.awt.Color(51, 51, 51));
        T3_B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T3_B1.setText("- - -");

        T3_A1.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T3_A1.setForeground(new java.awt.Color(51, 51, 51));
        T3_A1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T3_A1.setText("- - -");

        jLabel34.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("1");

        T3_B2.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T3_B2.setForeground(new java.awt.Color(51, 51, 51));
        T3_B2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T3_B2.setText("- - -");

        T3_A2.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T3_A2.setForeground(new java.awt.Color(51, 51, 51));
        T3_A2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T3_A2.setText("- - -");

        jLabel35.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("2");

        T3_B3.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T3_B3.setForeground(new java.awt.Color(51, 51, 51));
        T3_B3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T3_B3.setText("- - -");

        T3_A3.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T3_A3.setForeground(new java.awt.Color(51, 51, 51));
        T3_A3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T3_A3.setText("- - -");

        jLabel36.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("3");

        T3_A4.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T3_A4.setForeground(new java.awt.Color(51, 51, 51));
        T3_A4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T3_A4.setText("- - -");

        jLabel37.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("4");

        T3_B4.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T3_B4.setForeground(new java.awt.Color(51, 51, 51));
        T3_B4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T3_B4.setText("- - -");

        T3_B5.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T3_B5.setForeground(new java.awt.Color(51, 51, 51));
        T3_B5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T3_B5.setText("- - -");

        T3_A5.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T3_A5.setForeground(new java.awt.Color(51, 51, 51));
        T3_A5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T3_A5.setText("- - -");

        jLabel38.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("5");

        javax.swing.GroupLayout t3Layout = new javax.swing.GroupLayout(t3);
        t3.setLayout(t3Layout);
        t3Layout.setHorizontalGroup(
            t3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t3Layout.createSequentialGroup()
                .addGroup(t3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(t3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, t3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, t3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T3_A1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T3_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T3_A2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T3_B2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T3_A3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T3_B3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T3_A4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T3_B4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T3_A5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T3_B5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        t3Layout.setVerticalGroup(
            t3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t3Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(t3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(t3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T3_A1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T3_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T3_A2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T3_B2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T3_A3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T3_B3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T3_A4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T3_B4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T3_A5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T3_B5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        t4.setBackground(new java.awt.Color(255, 255, 255));
        t4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel39.setBackground(new java.awt.Color(102, 51, 0));
        jLabel39.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Top 5 extras más solicitados");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jLabel39.setOpaque(true);

        jLabel40.setFont(new java.awt.Font("Rockwell Condensed", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(153, 153, 153));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("POSICIÓN");

        jLabel57.setFont(new java.awt.Font("Rockwell Condensed", 0, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(153, 153, 153));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("NOMBRE");

        jLabel58.setFont(new java.awt.Font("Rockwell Condensed", 0, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(153, 153, 153));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("N°. ALQUILADOS");

        T4_B1.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T4_B1.setForeground(new java.awt.Color(51, 51, 51));
        T4_B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T4_B1.setText("- - -");

        T4_A1.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T4_A1.setForeground(new java.awt.Color(51, 51, 51));
        T4_A1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T4_A1.setText("- - -");

        jLabel59.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 51, 51));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("1");

        T4_B2.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T4_B2.setForeground(new java.awt.Color(51, 51, 51));
        T4_B2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T4_B2.setText("- - -");

        T4_A2.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T4_A2.setForeground(new java.awt.Color(51, 51, 51));
        T4_A2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T4_A2.setText("- - -");

        jLabel60.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 51, 51));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("2");

        T4_B3.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T4_B3.setForeground(new java.awt.Color(51, 51, 51));
        T4_B3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T4_B3.setText("- - -");

        T4_A3.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T4_A3.setForeground(new java.awt.Color(51, 51, 51));
        T4_A3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T4_A3.setText("- - -");

        jLabel61.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(51, 51, 51));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("3");

        T4_A4.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T4_A4.setForeground(new java.awt.Color(51, 51, 51));
        T4_A4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T4_A4.setText("- - -");

        jLabel62.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(51, 51, 51));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("4");

        T4_B4.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T4_B4.setForeground(new java.awt.Color(51, 51, 51));
        T4_B4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T4_B4.setText("- - -");

        T4_B5.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T4_B5.setForeground(new java.awt.Color(51, 51, 51));
        T4_B5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T4_B5.setText("- - -");

        T4_A5.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        T4_A5.setForeground(new java.awt.Color(51, 51, 51));
        T4_A5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T4_A5.setText("- - -");

        jLabel63.setFont(new java.awt.Font("Rockwell Condensed", 0, 13)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 51, 51));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("5");

        javax.swing.GroupLayout t4Layout = new javax.swing.GroupLayout(t4);
        t4.setLayout(t4Layout);
        t4Layout.setHorizontalGroup(
            t4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t4Layout.createSequentialGroup()
                .addGroup(t4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(t4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator7))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, t4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, t4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T4_A1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T4_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T4_A2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T4_B2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T4_A3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T4_B3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T4_A4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T4_B4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(t4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T4_A5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T4_B5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        t4Layout.setVerticalGroup(
            t4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t4Layout.createSequentialGroup()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(t4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(t4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T4_A1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T4_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T4_A2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T4_B2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T4_A3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T4_B3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T4_A4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T4_B4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(t4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T4_A5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T4_B5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jlActividadFiltrada.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        jlActividadFiltrada.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlActividadFiltrada.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jlActividadFiltrada.setSelectionForeground(new java.awt.Color(0, 153, 255));
        xjScrollPane2.setViewportView(jlActividadFiltrada);

        xjlActividadFiltrada.setBackground(new java.awt.Color(0, 153, 255));
        xjlActividadFiltrada.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        xjlActividadFiltrada.setForeground(new java.awt.Color(255, 255, 255));
        xjlActividadFiltrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xjlActividadFiltrada.setText("Actividad entre (fecha1 y fecha2)");
        xjlActividadFiltrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        xjlActividadFiltrada.setOpaque(true);

        jdcFechaIni.setDateFormatString("yyyy-MM-dd");
        jdcFechaIni.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        jdcFechaIni.setPreferredSize(new java.awt.Dimension(103, 26));

        x1.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        x1.setForeground(new java.awt.Color(255, 255, 255));
        x1.setText("Fecha de inicio");

        btnActividadFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/bien.png"))); // NOI18N
        btnActividadFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jdcFechaFin.setDateFormatString("yyyy-MM-dd");
        jdcFechaFin.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        jdcFechaFin.setPreferredSize(new java.awt.Dimension(103, 26));

        x2.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        x2.setForeground(new java.awt.Color(255, 255, 255));
        x2.setText("Fecha de fin");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xjScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(xjlActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xjScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(xjlActividadFiltrada, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdcFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActividadFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(xjlActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(xjScrollPane1))
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActividadFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25)
                        .addComponent(xjlActividadFiltrada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(xjScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1108, 1108, 1108))
        );

        jScrollPane1.setViewportView(jPanel6);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESUMEN");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);

        jtpPrincipal.addTab("Resumen", jPanel4);

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jMenuBar1.setOpaque(true);

        jMenu2.setText("Opciones");
        jMenu2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N

        MI_prefil.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        MI_prefil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/perfil.png"))); // NOI18N
        MI_prefil.setText("Perfil");
        MI_prefil.setOpaque(true);
        MI_prefil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_prefilActionPerformed(evt);
            }
        });
        jMenu2.add(MI_prefil);

        jmSalir.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/salida.png"))); // NOI18N
        jmSalir.setText("Salir");
        jmSalir.setOpaque(true);
        jMenu2.add(jmSalir);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Actividad");
        jMenu4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N

        rmPrestamos.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        rmPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/flecha-hacia-arriba.png"))); // NOI18N
        rmPrestamos.setText("Mis prestamos");
        jMenu4.add(rmPrestamos);

        rmDelovoluciones.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        rmDelovoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/flecha-hacia-abajo.png"))); // NOI18N
        rmDelovoluciones.setText("Mis devoluciones");
        jMenu4.add(rmDelovoluciones);

        rmContratos.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        rmContratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/contrato.png"))); // NOI18N
        rmContratos.setText("Mis contratos");
        jMenu4.add(rmContratos);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Crear");
        jMenu3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/google-mas.png"))); // NOI18N
        jMenu6.setText("Registro");
        jMenu6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N

        miCliente.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        miCliente.setText("Cliente");
        jMenu6.add(miCliente);

        miEmpleado.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        miEmpleado.setText("Empleado");
        jMenu6.add(miEmpleado);

        miConductor.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        miConductor.setText("Conductor");
        jMenu6.add(miConductor);

        miAutomovil.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        miAutomovil.setText("Automóvil");
        jMenu6.add(miAutomovil);

        miAlquiler.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        miAlquiler.setText("Alquiler");
        jMenu6.add(miAlquiler);

        miDevolución.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        miDevolución.setText("Devolución");
        jMenu6.add(miDevolución);

        miExtras.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        miExtras.setText("Extras");
        jMenu6.add(miExtras);

        jMenu3.add(jMenu6);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/impresora.png"))); // NOI18N
        jMenu5.setText("Reporte");
        jMenu5.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N

        rClientes.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        rClientes.setText("Cliente");
        jMenu5.add(rClientes);

        rEmpleados.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        rEmpleados.setText("Empleado");
        jMenu5.add(rEmpleados);

        rConductores.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        rConductores.setText("Conductor");
        jMenu5.add(rConductores);

        rAutos.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        rAutos.setText("Autos");
        jMenu5.add(rAutos);

        jMenu3.add(jMenu5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu_desplegable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jtpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu_desplegable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jtpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MI_prefilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_prefilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MI_prefilActionPerformed

    private void Menu_desplegableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_desplegableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_desplegableActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_foto;
    private javax.swing.JMenuItem MI_prefil;
    private LIB.FSButtonMD Menu_desplegable;
    private javax.swing.JDialog Perfil;
    private javax.swing.JLabel T1_A1;
    private javax.swing.JLabel T1_A2;
    private javax.swing.JLabel T1_A3;
    private javax.swing.JLabel T1_A4;
    private javax.swing.JLabel T1_A5;
    private javax.swing.JLabel T1_B1;
    private javax.swing.JLabel T1_B2;
    private javax.swing.JLabel T1_B3;
    private javax.swing.JLabel T1_B4;
    private javax.swing.JLabel T1_B5;
    private javax.swing.JLabel T2_A1;
    private javax.swing.JLabel T2_A2;
    private javax.swing.JLabel T2_A3;
    private javax.swing.JLabel T2_A4;
    private javax.swing.JLabel T2_A5;
    private javax.swing.JLabel T2_B1;
    private javax.swing.JLabel T2_B2;
    private javax.swing.JLabel T2_B3;
    private javax.swing.JLabel T2_B4;
    private javax.swing.JLabel T2_B5;
    private javax.swing.JLabel T3_A1;
    private javax.swing.JLabel T3_A2;
    private javax.swing.JLabel T3_A3;
    private javax.swing.JLabel T3_A4;
    private javax.swing.JLabel T3_A5;
    private javax.swing.JLabel T3_B1;
    private javax.swing.JLabel T3_B2;
    private javax.swing.JLabel T3_B3;
    private javax.swing.JLabel T3_B4;
    private javax.swing.JLabel T3_B5;
    private javax.swing.JLabel T4_A1;
    private javax.swing.JLabel T4_A2;
    private javax.swing.JLabel T4_A3;
    private javax.swing.JLabel T4_A4;
    private javax.swing.JLabel T4_A5;
    private javax.swing.JLabel T4_B1;
    private javax.swing.JLabel T4_B2;
    private javax.swing.JLabel T4_B3;
    private javax.swing.JLabel T4_B4;
    private javax.swing.JLabel T4_B5;
    private javax.swing.JButton btnActividadFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton jbGuardarTema;
    private javax.swing.JDesktopPane jdPrincipal;
    private javax.swing.JDialog jdTemas;
    private com.toedter.calendar.JDateChooser jdcFechaFin;
    private com.toedter.calendar.JDateChooser jdcFechaIni;
    private javax.swing.JList<String> jlActividad;
    private javax.swing.JList<String> jlActividadFiltrada;
    private javax.swing.JList<String> jlTemas;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JTabbedPane jtpPrincipal;
    private javax.swing.JLabel lb_apellidos;
    private javax.swing.JLabel lb_correo;
    private javax.swing.JLabel lb_direccion;
    private javax.swing.JLabel lb_edad;
    private javax.swing.JLabel lb_nombres;
    private javax.swing.JLabel lb_sexo;
    private javax.swing.JLabel lb_telefono;
    private javax.swing.JMenuItem miAlquiler;
    private javax.swing.JMenuItem miAutomovil;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miConductor;
    private javax.swing.JMenuItem miDevolución;
    private javax.swing.JMenuItem miEmpleado;
    private javax.swing.JMenuItem miExtras;
    private javax.swing.JMenuItem rAutos;
    private javax.swing.JMenuItem rClientes;
    private javax.swing.JMenuItem rConductores;
    private javax.swing.JMenuItem rEmpleados;
    private javax.swing.JMenuItem rmContratos;
    private javax.swing.JMenuItem rmDelovoluciones;
    private javax.swing.JMenuItem rmPrestamos;
    private javax.swing.JPanel t1;
    private javax.swing.JPanel t2;
    private javax.swing.JPanel t3;
    private javax.swing.JPanel t4;
    private javax.swing.JTextField titulo_texto;
    private javax.swing.JLabel x1;
    private javax.swing.JLabel x2;
    private javax.swing.JScrollPane xjScrollPane1;
    private javax.swing.JScrollPane xjScrollPane2;
    private javax.swing.JLabel xjlActividad;
    private javax.swing.JLabel xjlActividadFiltrada;
    // End of variables declaration//GEN-END:variables
}
