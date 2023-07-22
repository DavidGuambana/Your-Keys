package modelo;
import java.sql.ResultSet;
import modelo.tablas.Empleado;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

public class mEmpleado extends Empleado{
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

    public List<Empleado> listar(String cedula) {

        List<Empleado> empleados = new ArrayList<>();
        try {
            if (cedula.isEmpty()) {
                sql = "SELECT id, cedula_per, contraseña, id_cargo, salario FROM Empleado";
            } else {
                sql = "SELECT id, cedula_per, contraseña, id_cargo, salario FROM Empleado WHERE cedula_per='" + cedula+"'";
            }
            rs = con.consulta(sql);

            if (rs != null) {
                while (rs.next()) {
                    Empleado empleado = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5));
                    empleados.add(empleado);
                }
            }
            con.close();
            return empleados;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean crear() {
        sql = "INSERT INTO Empleado (cedula_per, contraseña, id_cargo, salario) "
                + "VALUES ('" + getCedula_per() + "','" + getContraseña() + "'," + getId_cargo()+ "," + getSalario() + ")";
        return con.accion(sql);
    }

    public boolean actualizar() {
        sql = "UPDATE Empleado SET contraseña='" + getContraseña()+ "', id_cargo=" + getId_cargo() +", salario="+getSalario()+" WHERE cedula_per='" + getCedula_per()+"'";
        return con.accion(sql);
    }

    public boolean eliminar() {
        sql = "DELETE FROM Empleado WHERE cedula_per='" + getCedula_per()+"'";
        return con.accion(sql);
    }

    public List<Empleado> buscar(String txt, String campo) {
        List<Empleado> empleados = new ArrayList<>();
        try {
            sql = "SELECT id, cedula_per, contraseña, id_cargo, salario FROM Empleado WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Empleado empleado = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5));
                    empleados.add(empleado);
                }
            }
            con.close();
            return empleados;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public int ultimoID() {
        int id = 0;
        try {
            sql = "SELECT * FROM (SELECT id FROM Empleado ORDER BY id DESC) WHERE ROWNUM <= 1";
            rs = con.consulta(sql);
            rs.next();
            id = rs.getInt(1);
        } catch (SQLException ex) {
        }
        return id;
    }

    public ResultSet join(int id) {
        try {
            sql = "SELECT p.cedula, p.nombre1, p.nombre2, p.apellido1, p.apellido2, p.fecha_nac, p.telefono, p.direccion, p.correo, p.sexo, e.contraseña, c.nombre, \n"
                    + "e.salario, p.id_imagen, i.nombre, i.valor FROM empleado e JOIN persona p ON(e.cedula_per = p.cedula) JOIN Cargo c ON (e.id_cargo = c.id) JOIN imagen i ON (p.id_imagen = i.id) WHERE e.id =" + id;
            rs = con.consulta(sql);
            rs.next();
            return rs;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public ResultSet logeo(String  cedula, String contraseña) {
        sql = "SELECT p.cedula, p.nombre1, p.nombre2, p.apellido1, p.apellido2, p.fecha_nac, p.telefono, p.direccion, p.correo, p.sexo, e.contraseña, c.nombre, \n"
                + "e.salario, p.id_imagen, i.nombre, i.valor FROM empleado e JOIN persona p ON(e.cedula_per = p.cedula) JOIN Cargo c ON (e.id_cargo = c.id) JOIN imagen i ON (p.id_imagen = i.id) WHERE e.cedula_per = '"+cedula+"' AND e.contraseña = '"+contraseña+"'";
        rs = con.consulta(sql);
        //            rs.next();
        return rs;
    }
}
