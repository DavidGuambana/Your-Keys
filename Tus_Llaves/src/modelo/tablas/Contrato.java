package modelo.tablas;

import java.util.Date;

public class Contrato {
    private int codigo;
    private Date fecha;
    private int id_conductor;
    private int horas;
    private double total;
    private int id_alquiler;

    public Contrato() {
    }
    
    public Contrato(int codigo, Date fecha, int id_conductor, int horas, double total, int id_alquiler) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.id_conductor = id_conductor;
        this.horas = horas;
        this.total = total;
        this.id_alquiler = id_alquiler;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId_alquiler() {
        return id_alquiler;
    }

    public void setId_alquiler(int id_alquiler) {
        this.id_alquiler = id_alquiler;
    }
}
