package modelo.tablas;

import java.util.Date;

public class Persona {
    private String cedula;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private Date fecha_nac;
    private String telefono;
    private String direccion;
    private String correo;
    private String sexo;
    private int id_imagen;
    
    public Persona() {
    }

    public Persona(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fecha_nac, String telefono, String direccion, String correo, String sexo, int id_imagen) {
        this.cedula = cedula;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.sexo = sexo;
        this.id_imagen = id_imagen;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getId_imagen() {
        return id_imagen;
    }

    public void setId_imagen(int id_imagen) {
        this.id_imagen = id_imagen;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", fecha_nac=" + fecha_nac + ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + ", sexo=" + sexo + ", id_imagen=" + id_imagen + '}';
    }
}
