package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.tablas.Total;

public class mTotal extends Total{
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
    public List<Total> listar(String id) {
        List<Total> Total = new ArrayList<>();
        try {
            if ("".equals(id)) {
                sql = "SELECT id, subtotal, total, id_alquiler FROM total";
            } else {
                sql = "SELECT id, subtotal, total, id_alquiler FROM total WHERE id='"+id+"'";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Total total = new Total(rs.getInt(1),rs.getDouble(2), rs.getDouble(3), rs.getInt(4));
                  Total.add(total);
                }
            }
            con.close();
            return Total;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public boolean crear() {
        sql = "INSERT INTO total(subtotal, total)"
                + " VALUES ('" + getSubtotal()
                + "'," + getTotal()+")";
        return con.accion(sql);
    }
    
    public List<Total> buscar(String txt, String campo) {
        List<Total> Total = new ArrayList<>();
        try {
            sql = "SELECT id, subtotal, total, id_alquiler FROM total WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Total total = new Total(rs.getInt(1),rs.getDouble(2), rs.getDouble(3), rs.getInt(4));
                    Total.add(total);
                }
            }
            con.close();
            return Total;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean existetotal(String id) {
        boolean exist = false;
        try {
            sql = "SELECT COUNT(id)FROM total WHERE id=" + id + "";
            rs = con.consulta(sql);
            if (rs != null) {
                rs.next();
                if (rs.getInt(1) == 0) {
                    exist = false;
                } else {
                    exist = true;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(mTotal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist;
    }
}
