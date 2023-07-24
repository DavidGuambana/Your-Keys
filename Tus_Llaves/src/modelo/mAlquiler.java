package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.tablas.Alquiler;

public class mAlquiler extends Alquiler {

    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

    public List<Alquiler> listar(int id) {
        List<Alquiler> Alquiler = new ArrayList<>();
        try {
            if ("".equals(id)) {
                sql = "SELECT id, fecha, dias, matricula_auto, id_cliente FROM alquiler";
            } else {
                sql = "SELECT id, fecha, dias, matricula_auto, id_cliente FROM alquiler WHERE id='" + id + "'";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Alquiler alquiler = new Alquiler(rs.getInt(1), rs.getDate(2), rs.getInt(3),
                            rs.getString(4), rs.getInt(5));
                    Alquiler.add(alquiler);
                }
            }
            con.close();
            return Alquiler;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean crear() {
        sql = "INSERT INTO alquiler(fecha, dias, matricula_auto, id_cliente)"
                + " VALUES (TO_DATE('" + getFecha()
                + "','YYYY-MM-DD')"
                + "," + getDias()
                + ",'" + getMatricula_auto()
               + "'," + getId_cliente()+ ")";
        return con.accion(sql);
    }

    public List<Alquiler> buscar(String txt, String campo) {
        List<Alquiler> Alquiler = new ArrayList<>();
        try {
            sql = "SELECT id, fecha, dias, matricula_auto, id_cliente FROM alquiler WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Alquiler alquiler = new Alquiler(rs.getInt(1), rs.getDate(2), rs.getInt(3),
                            rs.getString(4), rs.getInt(5));
                    Alquiler.add(alquiler);
                }
            }
            con.close();
            return Alquiler;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public int ultimoID() {
        int id = 0;
        try {
            sql = "SELECT * FROM (SELECT id FROM Alquiler ORDER BY id DESC) WHERE ROWNUM <= 1";
            rs = con.consulta(sql);
            rs.next();
            id = rs.getInt(1);
        } catch (SQLException ex) {
        }
        return id;
    }
    
    public ResultSet join_alq() {
        sql = "SELECT a.id, a.matricula_auto, c.cedula_per, a.dias, a.fecha, (a.fecha + a.dias)\n"
                + "FROM Alquiler a\n"
                + "JOIN Cliente c ON (a.id_cliente = c.id)\n"
                + "WHERE a.id NOT IN (SELECT id_alquiler FROM Devolucion)";
        rs = con.consulta(sql);
        return rs;
    }
}
