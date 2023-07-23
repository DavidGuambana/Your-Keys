package modelo.tablas;

public class Total {
    
    private int id;
    private double total_alquiler;
    private double total_detalle;
    private double total_contrato;
    private double subtotal;
    private double iva;
    private double total;
    private int id_alquiler;
   
    public Total() {
        
    }

    public Total(int id, double total_alquiler, double total_detalle, double total_contrato, double subtotal, double iva, double total, int id_alquiler) {
        this.id = id;
        this.total_alquiler = total_alquiler;
        this.total_detalle = total_detalle;
        this.total_contrato = total_contrato;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.id_alquiler = id_alquiler;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal_alquiler() {
        return total_alquiler;
    }

    public void setTotal_alquiler(double total_alquiler) {
        this.total_alquiler = total_alquiler;
    }

    public double getTotal_detalle() {
        return total_detalle;
    }

    public void setTotal_detalle(double total_detalle) {
        this.total_detalle = total_detalle;
    }

    public double getTotal_contrato() {
        return total_contrato;
    }

    public void setTotal_contrato(double total_contrato) {
        this.total_contrato = total_contrato;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
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
