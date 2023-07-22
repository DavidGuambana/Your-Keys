package modelo.tablas;

public class Conductor  {
    private int id_con;
    private int id_empleado;
    private String licencia;
    private String tipo_licencia;
    private double precio_hora;

    public Conductor() {
    }

    public Conductor(int id_con, int id_empleado, String licencia, String tipo_licencia, double precio_hora) {
        this.id_con = id_con;
        this.id_empleado = id_empleado;
        this.licencia = licencia;
        this.tipo_licencia = tipo_licencia;
        this.precio_hora = precio_hora;
    }

    public int getId_con() {
        return id_con;
    }

    public void setId_con(int id_con) {
        this.id_con = id_con;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getTipo_licencia() {
        return tipo_licencia;
    }

    public void setTipo_licencia(String tipo_licencia) {
        this.tipo_licencia = tipo_licencia;
    }

    public double getPrecio_hora() {
        return precio_hora;
    }

    public void setPrecio_hora(double precio_hora) {
        this.precio_hora = precio_hora;
    }

    @Override
    public String toString() {
        return "Conductor{" + "id_con=" + id_con + ", id_empleado=" + id_empleado + ", licencia=" + licencia + ", tipo_licencia=" + tipo_licencia + ", precio_hora=" + precio_hora + '}';
    }
}
