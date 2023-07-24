package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JList;
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

    public JDialog getJdMulta() {
        return jdMulta;
    }

    public JButton getJbFinalizar() {
        return jbFinalizar;
    }

    public JButton getJbRegresar() {
        return jbRegresar;
    }

    public JList<String> getJl_Infracciones() {
        return jl_Infracciones;
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdMulta = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl_Infracciones = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbFinalizar = new javax.swing.JButton();
        jbRegresar = new javax.swing.JButton();
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

        jdMulta.setBackground(new java.awt.Color(0, 0, 0));
        jdMulta.setMinimumSize(new java.awt.Dimension(282, 319));
        jdMulta.setResizable(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(282, 320));

        jl_Infracciones.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jl_Infracciones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1. Multa por pasarse de la fecha", "2. Multa por devolver el coche en mal estado", "3. Multa por perder el coche" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jl_Infracciones.setFixedCellHeight(30);
        jl_Infracciones.setSelectionBackground(new java.awt.Color(255, 0, 0));
        jScrollPane5.setViewportView(jl_Infracciones);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Seleccione una multa...");

        jbFinalizar.setBackground(new java.awt.Color(232, 232, 232));
        jbFinalizar.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 16)); // NOI18N
        jbFinalizar.setText("Finalizar");
        jbFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbRegresar.setBackground(new java.awt.Color(153, 153, 153));
        jbRegresar.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 16)); // NOI18N
        jbRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegresar.setText("Regresar");
        jbRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jbRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jdMultaLayout = new javax.swing.GroupLayout(jdMulta.getContentPane());
        jdMulta.getContentPane().setLayout(jdMultaLayout);
        jdMultaLayout.setHorizontalGroup(
            jdMultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );
        jdMultaLayout.setVerticalGroup(
            jdMultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdMultaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
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

        jLabel2.setBackground(new java.awt.Color(0, 102, 255));
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
        jtAlquileres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtAlquileres.setSelectionBackground(new java.awt.Color(0, 102, 255));
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jbFinalizar;
    private javax.swing.JButton jbRegresar;
    private javax.swing.JDialog jdMulta;
    private javax.swing.JList<String> jl_Infracciones;
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
