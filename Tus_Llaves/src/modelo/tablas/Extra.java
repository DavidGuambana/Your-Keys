package modelo.tablas;

public class Extra {
    
    private int codigo;
    private String nombre;
    private double precio;
    private int id_categoria;
    private int existencias;

    public Extra() {
    }

    public Extra(int codigo, String nombre, double precio, int id_categoria, int existencias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.id_categoria = id_categoria;
        this.existencias = existencias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

}
