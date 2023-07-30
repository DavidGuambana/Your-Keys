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
                sql = "SELECT * FROM total";
            } else {
                sql = "SELECT * FROM total WHERE id="+id;
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Total total = new Total(rs.getInt(1),rs.getDouble(2),rs.getDouble(3),
                            rs.getDouble(4),rs.getDouble(5), rs.getDouble(6),rs.getDouble(7),rs.getInt(8));
                  Total.add(total);
                }
            }
            return Total;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public boolean crear() {
        sql = "INSERT INTO total(total_alquiler, total_detalle, total_contrato, subtotal, iva, total, id_alquiler)"
                + " VALUES ("+getTotal_alquiler()+","+getTotal_detalle()+","+getTotal_contrato()
                +","+getSubtotal()+","+getIva()+","+getTotal()+","+getId_alquiler()+")";
        return con.accion(sql);
    }
    
    public List<Total> buscar(String txt, String campo) {
        List<Total> Total = new ArrayList<>();
        try {
            sql = "SELECT * FROM total WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Total total = new Total(rs.getInt(1),rs.getDouble(2),rs.getDouble(3),
                            rs.getDouble(4),rs.getDouble(5), rs.getDouble(6),rs.getDouble(7),rs.getInt(8));
                    Total.add(total);
                }
            }
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
