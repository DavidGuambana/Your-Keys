package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import modelo.tablas.Estado;

public class mEstado extends Estado{
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
        public List<Estado> listar(int codigo) {
        List<Estado> estados = new ArrayList<>();
        try {
            if (codigo == 0) {
                sql = "SELECT * FROM ESTADO";
            } else {
                sql = "SELECT * FROM ESTADO WHERE ID=" + codigo + "";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Estado estado = new Estado (rs.getInt(1), rs.getString(2));
                    estados.add(estado);
                }
            }
            return estados;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    
    public void llenarComboBox(JComboBox cb) {
        try {
            cb.removeAllItems();
            cb.addItem("Seleccione...");
            sql = "SELECT nombre FROM Estado";
            rs = con.consulta(sql);
            while (rs.next()) {
                cb.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
        }
    }

    public int obtenerID(String nombre) {
        int id = 0;
        sql = "SELECT id FROM Estado WHERE nombre='" + nombre + "'";
        try {
            rs = con.consulta(sql);
            rs.next();
            id = rs.getInt(1);
        } catch (SQLException ex) {
        }
        return id;
    }
    
}
