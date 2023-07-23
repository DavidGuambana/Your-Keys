package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
                + "," + getId_alquiler()+ ")";
        return con.accion(sql);
    }

   
    public List<Devolucion> buscar(String txt, String campo) {
        List<Devolucion> devoluciones = new ArrayList<>();
        try {
            sql = "SELECT * FROM devolucion WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Devolucion devolucion = new Devolucion(rs.getInt(1),rs.getDate(2),rs.getInt(3));
                    devoluciones.add(devolucion);
                }
            }
            con.close();
            return devoluciones;
        } catch (SQLException ex) {
            return null;
        }
    }

}
