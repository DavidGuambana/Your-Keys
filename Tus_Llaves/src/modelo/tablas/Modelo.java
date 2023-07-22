package modelo.tablas;

/**
 *
 * @author hp
 */
public class Modelo {
    
    private int id;
    private String nombre;
    private int id_marca;

    public Modelo() {
    }

    public Modelo(int id, String nombre, int id_marca) {
        this.id = id;
        this.nombre = nombre;
        this.id_marca = id_marca;
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

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }
}
