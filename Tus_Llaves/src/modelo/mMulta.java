package modelo;

import java.sql.ResultSet;
import modelo.tablas.Multa;

public class mMulta extends Multa {
    
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
      public boolean crear() {
        sql = "INSERT INTO multa(id_devolucion, id_infraccion)"
                + " VALUES (" + getId_devolucion()
                + "," + getId_infraccion() + ")";
        return con.accion(sql);
    }

    public ResultSet join_mul() {
        sql = "SELECT m.id, m.id_devolucion, c.cedula_per, i.nombre FROM Multa m JOIN Infraccion i ON (m.id_infraccion = i.id) \n"
                + "JOIN Devolucion d ON (m.id_devolucion = d.id) JOIN Alquiler a ON (a.id = d.id_alquiler) JOIN Cliente c ON (c.id = a.id_cliente)";
        rs = con.consulta(sql);
        return rs;
    }
}
