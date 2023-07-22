package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.tablas.Alquiler;
import modelo.tablas.Devolucion;

public class mDevolucion extends Devolucion {

    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

    public List<Devolucion> listar(int id) {
        List<Devolucion> Devoluciones = new ArrayList<>();
        try {
            if ("".equals(id)) {
                sql = "SELECT id, fecha, id_alquiler FROM devolucion";
            } else {
                sql = "SELECT id, fecha, id_alquiler FROM devolucion WHERE id="+id;
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Devolucion devolucion = new Devolucion(rs.getInt(1),rs.getDate(2),rs.getInt(3));
                    Devoluciones.add(devolucion);
                }
            }
            con.close();
            return Devoluciones;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean crear() {
        sql = "INSERT INTO Devolucion (fecha, id_alquiler)"
                + " VALUES (TO_DATE('" + getFecha() + "','YYYY-MM-DD')"
                + "'," + getId_alquiler()+ "')";
        return con.accion(sql);
    }

   
    public List<Alquiler> buscar(String txt, String campo) {
        List<Alquiler> Alquiler = new ArrayList<>();
        try {
            sql = "SELECT id, fecha, dias, total, matricula_auto, id_cliente FROM alquiler WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Alquiler alquiler = new Alquiler(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getDouble(4),
                            rs.getString(5), rs.getInt(6));
                    Alquiler.add(alquiler);
                }
            }
            con.close();
            return Alquiler;
        } catch (SQLException ex) {
            return null;
        }
    }

}
