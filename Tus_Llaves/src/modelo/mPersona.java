package modelo;
import modelo.tablas.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mPersona extends Persona {
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
    public boolean crear() {
        sql = "INSERT INTO Persona (cedula, nombre1, nombre2, apellido1, apellido2, fecha_nac, telefono, direccion, correo, sexo, id_imagen)"
                + " VALUES ('" + getCedula() + "','" + getNombre1() + "', '" + getNombre2() + "', '" + getApellido1() + "', '" + getApellido2() + "',to_date('" + getFecha_nac() + "', 'YYYY-MM-DD'), '" + getTelefono() + "', '" + getDireccion() + "', '" + getCorreo() + "', '" + getSexo() + "',"+getId_imagen()+")";
        return con.accion(sql);
    }
  
    public boolean actualizar() {
       
        sql = "UPDATE Persona SET nombre1='" + getNombre1() + "'"
                + ", nombre2='" + getNombre2() + "'"
                + ", apellido1='" + getApellido1() + "'"
                + ", apellido2='" + getApellido2() + "'"
                 + ", fecha_nac= to_date('" + getFecha_nac() + "', 'YYYY-MM-DD')"
                + ", telefono='" + getTelefono() + "'"
                + ", direccion='" + getDireccion() + "'"
                + ", correo='" + getCorreo() + "'"
                + ", sexo='" + getSexo() + "'"
                + ", id_imagen='" +getId_imagen()+ "' "
                + "WHERE cedula='" + getCedula() + "'";
        
        return con.accion(sql);
    }
    public boolean eliminar(String cedula) {
        sql = "DELETE FROM Persona WHERE cedula='"+getCedula()+"'";
        return con.accion(sql);
    }
    
    public List<Persona> buscar(String txt, String campo) {
        List<Persona> personas = new ArrayList<>();
        try {
            sql = "SELECT cedula, nombre1, nombre2, apellido1, apellido2, fecha_nac, telefono, direccion, correo, sexo, id_imagen FROM Persona WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Persona persona = new Persona(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(11));
                    personas.add(persona);
                }
            }
            return personas;
        } catch (SQLException ex) {
            return null;
        }
    }
       public int existeper(String cedula) {
        int cont = 0;
        sql = "SELECT COUNT(CEDULA) FROM persona WHERE cedula = '" + cedula + "'";
        rs = con.consulta(sql);
        try {
            rs.next();
            cont = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(mCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cont;
    }
}
