package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
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

    public ResultSet join_dev() {
        sql = "SELECT d.id, d.id_alquiler, a.matricula_auto, c.cedula_per, a.fecha, d.fecha FROM Devolucion d JOIN Alquiler a ON(d.id_alquiler = a.id)\n"
                + "JOIN Cliente c ON (a.id_cliente = c.id)";
        rs = con.consulta(sql);
        return rs;
    }
     public int ultimoID() {
        int id = 0;
        try {
            sql = "SELECT * FROM (SELECT ID FROM DEVOLUCION ORDER BY ID DESC) WHERE ROWNUM <= 1";
            rs = con.consulta(sql);
            rs.next();
            id = rs.getInt(1);
        } catch (SQLException ex) {
        }
        return id;
    }
    
}
