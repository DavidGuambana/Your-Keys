package controlador;

import controlador.otros.RenderTable2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.mAlquiler;
import modelo.mDevolucion;
import modelo.mMulta;
import vista.vDevolucion;

public final class cDevolucion implements Runnable{
    Thread hilo;
    private final vDevolucion vista;
    public cDevolucion(vDevolucion vista) {
        this.vista = vista;
        iniciar();
    }
    
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        while (current == hilo) {
            setTiempoRes();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    
    public void iniciar (){
        vista.setVisible(true);
        btnFinalizar = new JButton();
        btnFinalizar.setText("Finalizar");
        btnEnviar = new JButton();
        btnEnviar.setText("Enviar correo");
        verMultas();
        verAlquileres();
        verDevoluciones();
        hilo = new Thread(this);
        hilo.start();
        vista.getJtAlquileres().setDefaultRenderer(Object.class, new RenderTable2());
        ControlarTabla(vista.getJtAlquileres());
        vista.getJbFinalizar().addActionListener(l -> {
            if (vista.getJl_Infracciones().isSelectionEmpty()) {
                JOptionPane.showMessageDialog(null, "¡Seleccione un tipo de multa!", null, JOptionPane.ERROR_MESSAGE);
            } else {
                crearDevolucion(id_alq);
                crearMulta(m_dev.ultimoID());
                verAlquileres();
                verDevoluciones();
                verMultas();
                vista.getJdMulta().setVisible(false);
            }
        });
        vista.getJbRegresar().addActionListener(l-> vista.getJdMulta().setVisible(false));
    }
    int id_alq;
    ResultSet rs;
    DefaultTableModel dtm;
    JButton btnFinalizar, btnEnviar;
    ArrayList <Date> fechas = null;
    private final mMulta m_mul = new mMulta();
    private final mDevolucion m_dev = new mDevolucion();
    private final mAlquiler m_alq= new mAlquiler();
    
    String[] colAlquileres= {"ID alquiler", "Matrícula","Cédula", "Días", "Fecha inicio","Fecha fin","Tiempo restante" ,"Notificar","Finalizar"};
    String[] colDevoluciones= {"ID devolución","ID alquiler", "Matrícula","Cédula", "Fecha alquiler","Fecha devolución"};
    String[] colMultas= {"ID multa", "ID devolución","Cédula", "Causa de la multa"};
    
    public void verAlquileres() {
    try {
        fechas = new ArrayList<>();
        dtm = new DefaultTableModel(null, colAlquileres);
        rs = m_alq.join_alq();
        while (rs.next()) {
            dtm.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),rs.getDate(6), null,btnEnviar, btnFinalizar});
            fechas.add(rs.getDate(6));
        }
        vista.getJtAlquileres().setModel(dtm);
        vista.getJtAlquileres().setRowHeight(30);
    } catch (SQLException ex) {
    }
    }

    public void setTiempoRes() {
        for (int i = 0; i < fechas.size(); i++) {
            vista.getJtAlquileres().setValueAt(calcularTiempo(fechas.get(i)), i, 6);
        }
    }

    private String calcularTiempo(Date fechaFin) {
        Date fechaHoy = new Date();
        String tiempo_restante;
        long diffInMillies = fechaFin.getTime() - fechaHoy.getTime();
        if (diffInMillies <= 0) {
            tiempo_restante = "Finalizado";
        } else {
            long diffDays = diffInMillies / (24 * 60 * 60 * 1000);
            long diffHours = (diffInMillies / (60 * 60 * 1000)) % 24;
            long diffMinutes = (diffInMillies / (60 * 1000)) % 60;
            long diffSeconds = (diffInMillies / 1000) % 60;

            tiempo_restante = (diffDays + " Dias " + diffHours + ":" + diffMinutes + ":" + diffSeconds);
        }
        return tiempo_restante;
    }


    
    public void verDevoluciones(){
        try {
            dtm = new DefaultTableModel(null, colDevoluciones);
            rs = m_dev.join_dev();
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getDate(6)});
            }
            vista.getJtDevoluciones().setModel(dtm);
            vista.getJtDevoluciones().setRowHeight(30);
        } catch (SQLException ex) {
        }
    }
    
    public void verMultas(){
        try {
            dtm = new DefaultTableModel(null, colMultas);
            rs = m_mul.join_mul();
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4)});
            }
            vista.getJtMultas().setModel(dtm);
            vista.getJtMultas().setRowHeight(30);
        } catch (SQLException ex) {
        }
    }
    
    public void crearDevolucion(int id_alq) {
        Date hoy = new Date();
        Long d = hoy.getTime();
        java.sql.Date date = new java.sql.Date(d);
        m_dev.setFecha(date);
        m_dev.setId_alquiler(id_alq);
        m_dev.crear();
        JOptionPane.showMessageDialog(null, "¡Devolución finalizada correctamente!");
    }
    
    public void crearMulta(int id_dev){
        String id_inf = (String) vista.getJl_Infracciones().getSelectedValue().replaceAll("[^0-9]", "");
        m_mul.setId_devolucion(id_dev);
        m_mul.setId_infraccion(Integer.parseInt(id_inf));
        m_mul.crear();
        JOptionPane.showMessageDialog(null, "¡Multa registrada correctamente!");
    }
    
     public void ControlarTabla(JTable t) {
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    String id = t.getValueAt(t.getSelectedRow(), 0).toString();
                    String tiempo_restante = t.getValueAt(t.getSelectedRow(), 6).toString();
                    id_alq = Integer.parseInt(id);
                    int xcolum = t.getColumnModel().getColumnIndexAtX(me.getX());
                    int xrow = me.getY() / t.getRowHeight();
                    if (xcolum <= t.getColumnCount() && xcolum >= 0 && xrow <= t.getRowCount() && xrow >= 0) {
                        Object obj = t.getValueAt(xrow, xcolum);
                        if (obj instanceof JButton) {
                            if (((JButton) obj).getText().equals("Enviar correo")) {
                                if (tiempo_restante.equals("Finalizado")) {
                                    //enviar correo
                                } else {
                                    JOptionPane.showMessageDialog(null, "¡El plazo de este alquiler aún no vence!", null, JOptionPane.WARNING_MESSAGE);
                                }
                            } else if (((JButton) obj).getText().equals("Finalizar")) {

                                if (JOptionPane.showConfirmDialog(null, "¿Desea incluir una multa a este alquiler?",
                                        "Finalizar devolución", JOptionPane.YES_NO_OPTION,
                                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                                    abrirDialogo();
                                } else if (JOptionPane.showConfirmDialog(null, "¿Desea finalizar la devolución?",
                                        "Finalizar devolución", JOptionPane.YES_NO_OPTION,
                                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                                    crearDevolucion(id_alq);
                                    verAlquileres();
                                    verDevoluciones();
                                }
                            }
                        }
                    }
                }
            }
        });
    }
     
     
    public void abrirDialogo() {
        vista.getJdMulta().setTitle("Registrar multa");
        vista.getJdMulta().setLocationRelativeTo(vista);
        vista.getJdMulta().setSize(380, 320);
        vista.getJdMulta().setVisible(true);
    }
}
