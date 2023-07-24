package controlador.otros;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;

public class cTiempo extends Thread{
 private JTable tabla;
    private List<Date> fechasInicio;
    private List<Date> fechasFin;

    public cTiempo(JTable tabla, List<Date> fechasInicio, List<Date> fechasFin) {
        this.tabla = tabla;
        this.fechasInicio = fechasInicio;
        this.fechasFin = fechasFin;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < fechasInicio.size(); i++) {
                Date fechaInicio = fechasInicio.get(i);
                Date fechaFin = fechasFin.get(i);
                String tiempoRestante = calcularDiferencia(fechaInicio, fechaFin);
                tabla.setValueAt(tiempoRestante, i, 2);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private String calcularDiferencia(Date fechaInicio, Date fechaFin) {
        LocalDateTime inicio = LocalDateTime.ofInstant(fechaInicio.toInstant(), ZoneId.systemDefault());
        LocalDateTime fin = LocalDateTime.ofInstant(fechaFin.toInstant(), ZoneId.systemDefault());
        Duration duracion = Duration.between(inicio, fin);
        long dias = duracion.toDays();
        long horas = duracion.toHours() % 24;
        long minutos = duracion.toMinutes() % 60;
        long segundos = duracion.getSeconds() % 60;
        return dias + " días " + horas + ":" + minutos + ":" + segundos;
    }
}
