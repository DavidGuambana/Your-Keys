package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import modelo.tablas.Devolucion;

public class mDevolucion extends Devolucion {

    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

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

    public ResultSet join_dev() {
        sql = "SELECT d.id, a.matricula_auto, c.cedula_per, a.fecha, d.fecha FROM Devolucion d JOIN Alquiler a ON(d.id_alquiler = a.id)\n"
                + "JOIN Cliente c ON (a.id_cliente = c.id)";
        rs = con.consulta(sql);
        return rs;
    }
}
