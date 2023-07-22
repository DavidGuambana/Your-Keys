package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.tablas.Multa;

public class mMulta extends Multa {
    
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
    public List<Multa> listar(int id) {
        List<Multa> multas = new ArrayList<>();
        try {
            if ("".equals(id)) {
                sql = "SELECT id, id_devolucion, id_infraccion FROM multa";
            } else {
                sql = "SELECT id, id_devolucion, id_infraccion FROM multa WHERE id=" + id;
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Multa multa = new Multa(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                    multas.add(multa);
                }
            }
            con.close();
            return multas;
        } catch (SQLException ex) {
            return null;
        }
    }
      public boolean crear() {
        sql = "INSERT INTO multa(id_devolucion, id_infraccion)"
                + " VALUES (" + getId_devolucion()
                + "," + getId_infraccion()+")";
        return con.accion(sql);
    }
 
    public List<Multa> buscar(String txt, String campo) {
        List<Multa> multas = new ArrayList<>();
        try {
            sql = "SELECT id, id_devolucion, id_infraccion FROM multa WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Multa multa = new Multa(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                    multas.add(multa);
                }
            }
            con.close();
            return multas;
        } catch (SQLException ex) {
            return null;
        }
    }
}
