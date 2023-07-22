package modelo.tablas;

public class Imagen {
    private int id;
    private String nombre;
    private byte [] valor;

    public Imagen() {
    }

    public Imagen(int id, String nombre, byte[] valor) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getValor() {
        return valor;
    }

    public void setValor(byte[] valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Imagen{" + "id=" + id + ", nombre=" + nombre + ", valor=" + valor + '}';
    }
}