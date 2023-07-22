package modelo.tablas;

import java.util.Date;

public class Devolucion {
    
    private int id;
    private Date fecha;
    private int id_alquiler;
    
    public Devolucion(){
    }

    public Devolucion(int id, Date fecha, int id_alquiler) {
        this.id = id;
        this.fecha = fecha;
        this.id_alquiler = id_alquiler;
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

    public int getId_alquiler() {
        return id_alquiler;
    }

    public void setId_alquiler(int id_alquiler) {
        this.id_alquiler = id_alquiler;
    }
}
