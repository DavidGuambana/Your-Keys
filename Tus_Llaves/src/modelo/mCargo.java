package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import modelo.tablas.Cargo;

public class mCargo extends Cargo {
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
    public void llenarComboBox(JComboBox cb) {
        try {
            cb.removeAllItems();
            cb.addItem("Seleccione...");
            sql = "SELECT nombre FROM Cargo";
            rs = con.consulta(sql);
            while (rs.next()) {
                cb.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
        }
    }

    public int obtenerID(String nombre) {
        int id = 0;
        sql = "SELECT id FROM Cargo WHERE nombre='" + nombre + "'";
        try {
            rs = con.consulta(sql);
            rs.next();
            id = rs.getInt(1);
        } catch (SQLException ex) {
        }
        con.close();
        return id;
    }
}
