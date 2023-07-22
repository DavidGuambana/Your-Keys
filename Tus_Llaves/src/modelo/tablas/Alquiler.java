package modelo.tablas;

import java.util.Date;

public class Alquiler {
    private int id;
    private Date fecha;
    private int dias;
    private double total;
    private String matricula_auto;
    private int id_cliente;

    public Alquiler() {
    }

    public Alquiler(int id, Date fecha, int dias, double total, String matricula_auto, int id_cliente) {
        this.id = id;
        this.fecha = fecha;
        this.dias = dias;
        this.total = total;
        this.matricula_auto = matricula_auto;
        this.id_cliente = id_cliente;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getMatricula_auto() {
        return matricula_auto;
    }

    public void setMatricula_auto(String matricula_auto) {
        this.matricula_auto = matricula_auto;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
}
