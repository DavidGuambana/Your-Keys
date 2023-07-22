package modelo.tablas;

public class Empleado {
    private int id;
    private String cedula_per;
    private String contraseña;
    private int id_cargo;
    private double salario;

    public Empleado() {
    }

    public Empleado(int id, String cedula_per, String contraseña, int id_cargo, double salario) {
        this.id = id;
        this.cedula_per = cedula_per;
        this.contraseña = contraseña;
        this.id_cargo = id_cargo;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula_per() {
        return cedula_per;
    }

    public void setCedula_per(String cedula_per) {
        this.cedula_per = cedula_per;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", cedula_per=" + cedula_per + ", contrase\u00f1a=" + contraseña + ", id_cargo=" + id_cargo + ", salario=" + salario + '}';
    }
}
