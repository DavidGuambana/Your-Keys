package modelo.tablas;

public class Total {
    
    private int id;
    private double subtotal;
    private double total;
    private int id_alquiler;

    public Total() {
        
    }

    public Total(int id, double subtotal, double total, int id_alquiler) {
        this.id = id;
        this.subtotal = subtotal;
        this.total = total;
        this.id_alquiler = id_alquiler;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
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
