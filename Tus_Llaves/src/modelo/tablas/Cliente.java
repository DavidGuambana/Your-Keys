package modelo.tablas;

import java.util.Date;

public class Cliente  {
    private int id;
    private String cedula_per;
    private String contraseña;

    public Cliente() {
    }

    public Cliente(int id, String cedula_per, String contraseña) {
        this.id = id;
        this.cedula_per = cedula_per;
        this.contraseña = contraseña;
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
}
