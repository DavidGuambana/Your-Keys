package modelo.tablas;

public class Detalle {
    
    private int id;
    private int codigo_extra;
    private String nombre;
    private int cantidad;
    private double subtotal;
    private int id_alquiler;

    public Detalle() {
    }

    public Detalle(int id, int codigo_extra, String nombre, int cantidad, double subtotal, int id_alquiler) {
        this.id = id;
        this.codigo_extra = codigo_extra;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.id_alquiler = id_alquiler;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo_extra() {
        return codigo_extra;
    }

    public void setCodigo_extra(int codigo_extra) {
        this.codigo_extra = codigo_extra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getId_alquiler() {
        return id_alquiler;
    }

    public void setId_alquiler(int id_alquiler) {
        this.id_alquiler = id_alquiler;
    }
}
