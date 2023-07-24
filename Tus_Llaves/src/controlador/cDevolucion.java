package controlador;

import controlador.otros.RenderTable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
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
    
     public void run() {
        Thread current = Thread.currentThread();
        while (current == hilo) {
            setTiempoRes();
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
        vista.getJtAlquileres().setDefaultRenderer(Object.class, new RenderTable());
    }
    ResultSet rs;
    DefaultTableModel dtm;
    JButton btnFinalizar, btnEnviar;
    ArrayList <Date> fechas = null;
    private final mMulta m_mul = new mMulta();
    private final mDevolucion m_dev = new mDevolucion();
    private final mAlquiler m_alq= new mAlquiler();
    
    String[] colAlquileres= {"ID alquiler", "Matrícula","Cédula", "Días", "Fecha inicio","Fecha fin","Tiempo restante" ,"Notificar","Finalizar"};
    String[] colDevoluciones= {"ID devolución", "Matrícula","Cédula", "Días", "Fecha alquiler","Fecha devolución"};
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
    public void setTiempoRes(){
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
                dtm.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getDate(5)});
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
    
    public void crearMulta(int id_dev, int id_inf){
        m_mul.setId_devolucion(id_dev);
        m_mul.setId_infraccion(id_inf);
        m_mul.crear();
        JOptionPane.showMessageDialog(null, "¡Multa registrada correctamente!");
    }
    
}
