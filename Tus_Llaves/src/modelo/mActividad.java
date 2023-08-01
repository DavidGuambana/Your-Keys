package modelo;

import java.sql.ResultSet;
import java.util.Date;
import modelo.tablas.Cliente;

public class mActividad extends Cliente {

    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

    public ResultSet actividad_hoy() {
        sql = "SELECT TO_CHAR(fecha, 'YYYY-MM-DD HH24:MI:SS') AS fecha_hora, tabla, evento, usuario\n"
                + "FROM Actividad\n"
                + "WHERE TRUNC(fecha) = TRUNC(SYSDATE)";
        return con.consulta(sql);
    }

    public ResultSet actividad_filtrada(Date fecha_ini, Date fecha_fin) {
        sql = "SELECT TO_CHAR(fecha, 'YYYY-MM-DD HH24:MI:SS') AS fecha_hora, tabla, evento, usuario\n"
                + "FROM Actividad\n"
                + "WHERE fecha >= DATE '" + fecha_ini + "' AND fecha < DATE '" + fecha_fin + "'";
        return con.consulta(sql);
    }
}
