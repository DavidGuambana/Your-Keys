package vista;

import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class vDevolucion extends javax.swing.JInternalFrame {

    public vDevolucion() {
        initComponents();
    }

    public JComboBox<String> getCbColumnas1() {
        return cbColumnas1;
    }

    public JComboBox<String> getCbColumnas2() {
        return cbColumnas2;
    }

    public JComboBox<String> getCbColumnas3() {
        return cbColumnas3;
    }

    public JTable getJtAlquileres() {
        return jtAlquileres;
    }

    public JTable getJtDevoluciones() {
        return jtDevoluciones;
    }

    public JTable getJtMultas() {
        return jtMultas;
    }

    public JTextField getTxtBuscar1() {
        return txtBuscar1;
    }

    public JTextField getTxtBuscar2() {
        return txtBuscar2;
    }

    public JTextField getTxtBuscar3() {
        return txtBuscar3;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tpDevoluciones = new javax.swing.JTabbedPane();
        jpDevolucionesPendientes = new javax.swing.JPanel();
        txtBuscar1 = new javax.swing.JTextField();
        cbColumnas1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlquileres = new javax.swing.JTable();
        jpDevolucionesFinalizadas = new javax.swing.JPanel();
        txtBuscar2 = new javax.swing.JTextField();
        cbColumnas2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDevoluciones = new javax.swing.JTable();
        jpMultas = new javax.swing.JPanel();
        txtBuscar3 = new javax.swing.JTextField();
        cbColumnas3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtMultas = new javax.swing.JTable();

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

        jLabel3.setBackground(new java.awt.Color(0, 102, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("En esta sección puedes finalizar las devolciones pendientes. Además, ver las devoluciones finalizadas y multas. ");
        jLabel3.setOpaque(true);

        tpDevoluciones.setBackground(new java.awt.Color(255, 255, 255));
        tpDevoluciones.setOpaque(true);

        jpDevolucionesPendientes.setBackground(new java.awt.Color(255, 255, 255));

        txtBuscar1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBuscar1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtBuscar1.setPreferredSize(new java.awt.Dimension(64, 17));
        txtBuscar1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtBuscar1.setSelectionColor(new java.awt.Color(204, 204, 204));

        cbColumnas1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbColumnas1.setForeground(new java.awt.Color(51, 51, 51));
        cbColumnas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID de alquiler", "Automóvil", "Cliente", "Total", "Fecha de alquiler", "Fecha de devolución", "Días de restantes", " ", " " }));

        jLabel2.setBackground(new java.awt.Color(255, 102, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de devoluciones pendientes");
        jLabel2.setOpaque(true);

        jtAlquileres = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtAlquileres.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtAlquileres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtAlquileres.setSelectionBackground(new java.awt.Color(255, 102, 0));
        jtAlquileres.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jtAlquileres.getTableHeader().setResizingAllowed(false);
        jtAlquileres.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtAlquileres);

        javax.swing.GroupLayout jpDevolucionesPendientesLayout = new javax.swing.GroupLayout(jpDevolucionesPendientes);
        jpDevolucionesPendientes.setLayout(jpDevolucionesPendientesLayout);
        jpDevolucionesPendientesLayout.setHorizontalGroup(
            jpDevolucionesPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDevolucionesPendientesLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jpDevolucionesPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpDevolucionesPendientesLayout.createSequentialGroup()
                        .addComponent(cbColumnas1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(55, 55, 55))
        );
        jpDevolucionesPendientesLayout.setVerticalGroup(
            jpDevolucionesPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDevolucionesPendientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpDevolucionesPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbColumnas1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        tpDevoluciones.addTab("Devoluciones pendientes", jpDevolucionesPendientes);

        jpDevolucionesFinalizadas.setBackground(new java.awt.Color(255, 255, 255));

        txtBuscar2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBuscar2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtBuscar2.setPreferredSize(new java.awt.Dimension(64, 17));
        txtBuscar2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtBuscar2.setSelectionColor(new java.awt.Color(204, 204, 204));

        cbColumnas2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbColumnas2.setForeground(new java.awt.Color(51, 51, 51));
        cbColumnas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID de alquiler", "Automóvil", "Cliente", "Total", "Fecha de alquiler", "Fecha de devolución", "Días de restantes", " ", " " }));

        jLabel4.setBackground(new java.awt.Color(0, 204, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lista de devoluciones finalizadas");
        jLabel4.setOpaque(true);

        jtDevoluciones = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtDevoluciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtDevoluciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtDevoluciones.setSelectionBackground(new java.awt.Color(0, 204, 51));
        jtDevoluciones.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jtDevoluciones);

        javax.swing.GroupLayout jpDevolucionesFinalizadasLayout = new javax.swing.GroupLayout(jpDevolucionesFinalizadas);
        jpDevolucionesFinalizadas.setLayout(jpDevolucionesFinalizadasLayout);
        jpDevolucionesFinalizadasLayout.setHorizontalGroup(
            jpDevolucionesFinalizadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDevolucionesFinalizadasLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jpDevolucionesFinalizadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpDevolucionesFinalizadasLayout.createSequentialGroup()
                        .addComponent(cbColumnas2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(55, 55, 55))
        );
        jpDevolucionesFinalizadasLayout.setVerticalGroup(
            jpDevolucionesFinalizadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDevolucionesFinalizadasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpDevolucionesFinalizadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbColumnas2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        tpDevoluciones.addTab("Devoluciones finalizadas", jpDevolucionesFinalizadas);

        jpMultas.setBackground(new java.awt.Color(255, 255, 255));

        txtBuscar3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBuscar3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtBuscar3.setPreferredSize(new java.awt.Dimension(64, 17));
        txtBuscar3.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtBuscar3.setSelectionColor(new java.awt.Color(204, 204, 204));

        cbColumnas3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbColumnas3.setForeground(new java.awt.Color(51, 51, 51));
        cbColumnas3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID de alquiler", "Automóvil", "Cliente", "Total", "Fecha de alquiler", "Fecha de devolución", "Días de restantes", " ", " " }));

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lista de multas");
        jLabel5.setOpaque(true);

        jtMultas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtMultas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtMultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtMultas.setSelectionBackground(new java.awt.Color(255, 0, 0));
        jtMultas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jtMultas);

        javax.swing.GroupLayout jpMultasLayout = new javax.swing.GroupLayout(jpMultas);
        jpMultas.setLayout(jpMultasLayout);
        jpMultasLayout.setHorizontalGroup(
            jpMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMultasLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jpMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpMultasLayout.createSequentialGroup()
                        .addComponent(cbColumnas3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(55, 55, 55))
        );
        jpMultasLayout.setVerticalGroup(
            jpMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMultasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbColumnas3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(31, 31, 31))
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
                .addComponent(tpDevoluciones)
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbColumnas1;
    private javax.swing.JComboBox<String> cbColumnas2;
    private javax.swing.JComboBox<String> cbColumnas3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar;
    private javax.swing.JPanel jpDevolucionesFinalizadas;
    private javax.swing.JPanel jpDevolucionesPendientes;
    private javax.swing.JPanel jpMultas;
    private javax.swing.JTable jtAlquileres;
    private javax.swing.JTable jtDevoluciones;
    private javax.swing.JTable jtMultas;
    private javax.swing.JTabbedPane tpDevoluciones;
    private javax.swing.JTextField txtBuscar1;
    private javax.swing.JTextField txtBuscar2;
    private javax.swing.JTextField txtBuscar3;
    // End of variables declaration//GEN-END:variables
}
