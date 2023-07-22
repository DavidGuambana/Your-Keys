package modelo.tablas;

public class Auto {
    private String matricula;
    private int id_categoria;
    private int id_modelo;
    private String color;
    private double precio_diario;
    private int id_estado;
    private int capacidad;
    private int potencia;
    private int id_imagen;

    public Auto() {
    }

    public Auto(String matricula, int id_categoria, int id_modelo, String color, double precio_diario, int id_estado, int capacidad, int potencia, int id_imagen) {
        this.matricula = matricula;
        this.id_categoria = id_categoria;
        this.id_modelo = id_modelo;
        this.color = color;
        this.precio_diario = precio_diario;
        this.id_estado = id_estado;
        this.capacidad = capacidad;
        this.potencia = potencia;
        this.id_imagen = id_imagen;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio_diario() {
        return precio_diario;
    }

    public void setPrecio_diario(double precio_diario) {
        this.precio_diario = precio_diario;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getId_imagen() {
        return id_imagen;
    }

    public void setId_imagen(int id_imagen) {
        this.id_imagen = id_imagen;
    }
}
