package modelo.tablas;

public class Multa {
    
    private int id;
    private int id_devolucion;
    private int id_infraccion;
    
    public Multa(){
    }

    public Multa(int id, int id_devolucion, int id_infraccion) {
        this.id = id;
        this.id_devolucion = id_devolucion;
        this.id_infraccion = id_infraccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_devolucion() {
        return id_devolucion;
    }

    public void setId_devolucion(int id_devolucion) {
        this.id_devolucion = id_devolucion;
    }

    public int getId_infraccion() {
        return id_infraccion;
    }

    public void setId_infraccion(int id_infraccion) {
        this.id_infraccion = id_infraccion;
    }
}
