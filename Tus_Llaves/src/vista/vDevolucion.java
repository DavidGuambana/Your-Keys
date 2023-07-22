package vista;


public class vDevolucion extends javax.swing.JInternalFrame {

    public vDevolucion() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tpDevoluciones = new javax.swing.JTabbedPane();
        jpDevolucionesPendientes = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t_detalles = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        btnBuscar1 = new javax.swing.JButton();
        txtBuscar1 = new javax.swing.JTextField();
        cbColumnas1 = new javax.swing.JComboBox<>();
        jpDevolucionesFinalizadas = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        t_detalles1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        btnBuscar2 = new javax.swing.JButton();
        txtBuscar2 = new javax.swing.JTextField();
        cbColumnas2 = new javax.swing.JComboBox<>();
        jpMultas = new javax.swing.JPanel();
        jSeparator15 = new javax.swing.JSeparator();
        btnBuscar3 = new javax.swing.JButton();
        txtBuscar3 = new javax.swing.JTextField();
        cbColumnas3 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        t_detalles2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator20 = new javax.swing.JToolBar.Separator();
        jLabel19 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JToolBar.Separator();
        jb_ModoEditar1 = new javax.swing.JButton();
        jSeparator22 = new javax.swing.JToolBar.Separator();
        jb_ModoNuevo1 = new javax.swing.JButton();
        jSeparator23 = new javax.swing.JToolBar.Separator();
        jb_ModoVista1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jbOK1 = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jb_ModoEditar2 = new javax.swing.JButton();

        jToolBar.setRollover(true);

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(840, 480));
        setMinimumSize(new java.awt.Dimension(840, 480));
        setPreferredSize(new java.awt.Dimension(840, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        jPanel1.setMaximumSize(new java.awt.Dimension(805, 440));
        jPanel1.setMinimumSize(new java.awt.Dimension(805, 440));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("En esta sección puedes finalizar las devolciones pendientes y ver las finalizadas. Además, controlar las multas. ");

        tpDevoluciones.setBackground(new java.awt.Color(255, 255, 255));
        tpDevoluciones.setOpaque(true);

        jpDevolucionesPendientes.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMaximumSize(new java.awt.Dimension(350, 32767));

        jLabel33.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));

        t_detalles = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        t_detalles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        t_detalles.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        t_detalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        t_detalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t_detalles.setOpaque(false);
        t_detalles.setSelectionBackground(new java.awt.Color(0, 102, 204));
        t_detalles.setSelectionForeground(new java.awt.Color(255, 255, 255));
        t_detalles.getTableHeader().setResizingAllowed(false);
        t_detalles.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(t_detalles);

        jLabel2.setBackground(new java.awt.Color(0, 102, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de devoluciones pendientes");
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                        .addGap(108, 108, 108))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addContainerGap())
        );

        jSeparator13.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator13.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator13.setOpaque(true);
        jSeparator13.setPreferredSize(new java.awt.Dimension(50, 1));

        btnBuscar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/buscar.png"))); // NOI18N
        btnBuscar1.setToolTipText("Buscar...");
        btnBuscar1.setBorder(null);
        btnBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtBuscar1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBuscar1.setBorder(null);
        txtBuscar1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtBuscar1.setPreferredSize(new java.awt.Dimension(64, 17));
        txtBuscar1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtBuscar1.setSelectionColor(new java.awt.Color(204, 204, 204));

        cbColumnas1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbColumnas1.setForeground(new java.awt.Color(51, 51, 51));
        cbColumnas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID de alquiler", "Automóvil", "Cliente", "Total", "Fecha de alquiler", "Fecha de devolución", "Días de restantes", " ", " " }));
        cbColumnas1.setBorder(null);

        javax.swing.GroupLayout jpDevolucionesPendientesLayout = new javax.swing.GroupLayout(jpDevolucionesPendientes);
        jpDevolucionesPendientes.setLayout(jpDevolucionesPendientesLayout);
        jpDevolucionesPendientesLayout.setHorizontalGroup(
            jpDevolucionesPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDevolucionesPendientesLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jpDevolucionesPendientesLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(cbColumnas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jpDevolucionesPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDevolucionesPendientesLayout.setVerticalGroup(
            jpDevolucionesPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDevolucionesPendientesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpDevolucionesPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbColumnas1)
                    .addGroup(jpDevolucionesPendientesLayout.createSequentialGroup()
                        .addGroup(jpDevolucionesPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpDevoluciones.addTab("Devoluciones pendientes", jpDevolucionesPendientes);

        jpDevolucionesFinalizadas.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setMaximumSize(new java.awt.Dimension(350, 32767));

        jLabel34.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));

        t_detalles = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        t_detalles1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        t_detalles1.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        t_detalles1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        t_detalles1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t_detalles1.setOpaque(false);
        t_detalles1.setSelectionBackground(new java.awt.Color(0, 102, 204));
        t_detalles1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        t_detalles1.getTableHeader().setResizingAllowed(false);
        t_detalles1.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(t_detalles1);

        jLabel4.setBackground(new java.awt.Color(0, 102, 153));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lista de devoluciones finalizadas");
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                        .addGap(108, 108, 108))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addContainerGap())
        );

        jSeparator14.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator14.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator14.setOpaque(true);
        jSeparator14.setPreferredSize(new java.awt.Dimension(50, 1));

        btnBuscar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/buscar.png"))); // NOI18N
        btnBuscar2.setToolTipText("Buscar...");
        btnBuscar2.setBorder(null);
        btnBuscar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtBuscar2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBuscar2.setBorder(null);
        txtBuscar2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtBuscar2.setPreferredSize(new java.awt.Dimension(64, 17));
        txtBuscar2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtBuscar2.setSelectionColor(new java.awt.Color(204, 204, 204));

        cbColumnas2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbColumnas2.setForeground(new java.awt.Color(51, 51, 51));
        cbColumnas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID de alquiler", "Automóvil", "Cliente", "Total", "Fecha de alquiler", "Fecha de devolución", "Días de restantes", " ", " " }));
        cbColumnas2.setBorder(null);

        javax.swing.GroupLayout jpDevolucionesFinalizadasLayout = new javax.swing.GroupLayout(jpDevolucionesFinalizadas);
        jpDevolucionesFinalizadas.setLayout(jpDevolucionesFinalizadasLayout);
        jpDevolucionesFinalizadasLayout.setHorizontalGroup(
            jpDevolucionesFinalizadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDevolucionesFinalizadasLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jpDevolucionesFinalizadasLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(cbColumnas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jpDevolucionesFinalizadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDevolucionesFinalizadasLayout.setVerticalGroup(
            jpDevolucionesFinalizadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDevolucionesFinalizadasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpDevolucionesFinalizadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbColumnas2)
                    .addGroup(jpDevolucionesFinalizadasLayout.createSequentialGroup()
                        .addGroup(jpDevolucionesFinalizadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpDevoluciones.addTab("Devoluciones finalizadas", jpDevolucionesFinalizadas);

        jpMultas.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator15.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator15.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator15.setOpaque(true);
        jSeparator15.setPreferredSize(new java.awt.Dimension(50, 1));

        btnBuscar3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/buscar.png"))); // NOI18N
        btnBuscar3.setToolTipText("Buscar...");
        btnBuscar3.setBorder(null);
        btnBuscar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtBuscar3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBuscar3.setBorder(null);
        txtBuscar3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtBuscar3.setPreferredSize(new java.awt.Dimension(64, 17));
        txtBuscar3.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtBuscar3.setSelectionColor(new java.awt.Color(204, 204, 204));

        cbColumnas3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbColumnas3.setForeground(new java.awt.Color(51, 51, 51));
        cbColumnas3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID de alquiler", "Automóvil", "Cliente", "Total", "Fecha de alquiler", "Fecha de devolución", "Días de restantes", " ", " " }));
        cbColumnas3.setBorder(null);

        t_detalles = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        t_detalles2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        t_detalles2.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        t_detalles2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        t_detalles2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t_detalles2.setOpaque(false);
        t_detalles2.setSelectionBackground(new java.awt.Color(0, 102, 204));
        t_detalles2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        t_detalles2.getTableHeader().setResizingAllowed(false);
        t_detalles2.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(t_detalles2);

        jLabel5.setBackground(new java.awt.Color(0, 102, 153));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lista de multas");
        jLabel5.setOpaque(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jToolBar.setFloatable(false);
        jToolBar1.setBackground(new java.awt.Color(0, 102, 153));
        jToolBar1.setBorder(null);

        jSeparator20.setSeparatorSize(new java.awt.Dimension(20, 0));
        jToolBar1.add(jSeparator20);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cambiar de modo:");
        jToolBar1.add(jLabel19);

        jSeparator21.setPreferredSize(new java.awt.Dimension(25, 0));
        jSeparator21.setSeparatorSize(new java.awt.Dimension(25, 0));
        jToolBar1.add(jSeparator21);

        jb_ModoEditar1.setText("Editar");
        jb_ModoEditar1.setFocusable(false);
        jb_ModoEditar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_ModoEditar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jb_ModoEditar1);

        jSeparator22.setPreferredSize(new java.awt.Dimension(25, 0));
        jSeparator22.setSeparatorSize(new java.awt.Dimension(25, 0));
        jToolBar1.add(jSeparator22);

        jb_ModoNuevo1.setText("Nuevo");
        jb_ModoNuevo1.setFocusable(false);
        jb_ModoNuevo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_ModoNuevo1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jb_ModoNuevo1);

        jSeparator23.setPreferredSize(new java.awt.Dimension(25, 0));
        jSeparator23.setSeparatorSize(new java.awt.Dimension(25, 0));
        jToolBar1.add(jSeparator23);

        jb_ModoVista1.setText("Vista");
        jb_ModoVista1.setFocusable(false);
        jb_ModoVista1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_ModoVista1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jb_ModoVista1);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 153));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("(Modo) Infracción");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jbOK1.setBackground(new java.awt.Color(0, 102, 153));
        jbOK1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbOK1.setForeground(new java.awt.Color(255, 255, 255));
        jbOK1.setText("OK");
        jbOK1.setBorder(null);
        jbOK1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(350, 32767));

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Nombre:");

        txt_matricula.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        txt_matricula.setBorder(null);
        txt_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matriculaActionPerformed(evt);
            }
        });

        jSeparator24.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator24.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator24.setOpaque(true);
        jSeparator24.setPreferredSize(new java.awt.Dimension(50, 1));

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Descripción:");

        jScrollPane6.setBorder(null);

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14))); // NOI18N
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(txtDescripcion);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txt_matricula)
                                .addGap(3, 3, 3)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_matricula))
                .addGap(2, 2, 2)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jScrollPane.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbOK1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jbOK1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane.getVerticalScrollBar().setUnitIncrement(16);

        jb_ModoEditar2.setText("Visualizar listado de infracciones existentes");
        jb_ModoEditar2.setFocusable(false);
        jb_ModoEditar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_ModoEditar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpMultasLayout = new javax.swing.GroupLayout(jpMultas);
        jpMultas.setLayout(jpMultasLayout);
        jpMultasLayout.setHorizontalGroup(
            jpMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMultasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpMultasLayout.createSequentialGroup()
                        .addComponent(cbColumnas3, 0, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscar3, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar3))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_ModoEditar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jpMultasLayout.setVerticalGroup(
            jpMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMultasLayout.createSequentialGroup()
                .addGroup(jpMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMultasLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jpMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbColumnas3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addGroup(jpMultasLayout.createSequentialGroup()
                                .addComponent(txtBuscar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3)
                                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMultasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMultasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_ModoEditar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpMultasLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        tpDevoluciones.addTab("Multas", jpMultas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpDevoluciones, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tpDevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_matriculaActionPerformed

    private void txtDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnBuscar3;
    private javax.swing.JComboBox<String> cbColumnas1;
    private javax.swing.JComboBox<String> cbColumnas2;
    private javax.swing.JComboBox<String> cbColumnas3;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator20;
    private javax.swing.JToolBar.Separator jSeparator21;
    private javax.swing.JToolBar.Separator jSeparator22;
    private javax.swing.JToolBar.Separator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JToolBar jToolBar;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbOK1;
    private javax.swing.JButton jb_ModoEditar1;
    private javax.swing.JButton jb_ModoEditar2;
    private javax.swing.JButton jb_ModoNuevo1;
    private javax.swing.JButton jb_ModoVista1;
    private javax.swing.JPanel jpDevolucionesFinalizadas;
    private javax.swing.JPanel jpDevolucionesPendientes;
    private javax.swing.JPanel jpMultas;
    private javax.swing.JTable t_detalles;
    private javax.swing.JTable t_detalles1;
    private javax.swing.JTable t_detalles2;
    private javax.swing.JTabbedPane tpDevoluciones;
    private javax.swing.JTextField txtBuscar1;
    private javax.swing.JTextField txtBuscar2;
    private javax.swing.JTextField txtBuscar3;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txt_matricula;
    // End of variables declaration//GEN-END:variables
}
