package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import modelo.tablas.Conductor;

public class mConductor extends Conductor {

    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

    public List<Conductor> listar(String licencia) {

        List<Conductor> conductores = new ArrayList<>();
        try {
            if (licencia.isEmpty()) {
                sql = "SELECT id, id_empleado, licencia, tipo_licencia, precio_hora FROM Conductor";
            } else {
                sql = "SELECT id, id_empleado, licencia, tipo_licencia, precio_hora FROM Conductor WHERE licencia='"+licencia+"'";
            }
            rs = con.consulta(sql);

            if (rs != null) {
                while (rs.next()) {
                    Conductor conductor = new Conductor(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
                    conductores.add(conductor);
                }
            }
            return conductores;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean crear() {
        sql = "INSERT INTO Conductor (id_empleado, licencia, tipo_licencia, precio_hora) "
                + "VALUES (" + getId_empleado() + ",'" + getLicencia() + "','" + getTipo_licencia() + "'," + getPrecio_hora() + ")";
        return con.accion(sql);
    }

    public boolean actualizar() {
        sql = "UPDATE Conductor SET tipo_licencia='" + getTipo_licencia() + "', precio_hora=" + getPrecio_hora() + " WHERE licencia='"+getLicencia()+"'";
        return con.accion(sql);
    }

    public boolean eliminar() {
        sql = "DELETE FROM Conductor WHERE id="+getId_con();
        return con.accion(sql);
    }

    public List<Conductor> buscar(String txt, String campo) {
        List<Conductor> conductores = new ArrayList<>();
        try {
            sql = "SELECT id, id_empleado, licencia, tipo_licencia, precio_hora FROM Conductor WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Conductor conductor = new Conductor(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
                    conductores.add(conductor);
                }
            }
            return conductores;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ResultSet join(int id) {
        try {
            sql = "SELECT p.cedula, p.nombre1, p.nombre2, p.apellido1, p.apellido2, p.fecha_nac, p.telefono, p.direccion, p.correo, \n"
                    + "p.sexo, e.salario , c.licencia, c.tipo_licencia, c.precio_hora, p.id_imagen, i.nombre, i.valor \n"
                    + "FROM conductor c JOIN empleado e ON(c.id_empleado = e.id)JOIN persona p ON(e.cedula_per = p.cedula) JOIN imagen i ON (p.id_imagen = i.id) WHERE c.id = " + id;
            rs = con.consulta(sql);
            if (rs != null) {
                rs.next();
            }
            return rs;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ResultSet join2() {
        sql = "SELECT c.id, c.licencia, p.nombre1, p.apellido1, c.precio_hora, i.valor FROM conductor c JOIN persona p ON(c.licencia = p.cedula)\n"
                + "JOIN imagen i ON (p.id_imagen = i.id)";
        rs = con.consulta(sql);
        return rs;
    }
}
