package modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import oracle.jdbc.pool.OracleDataSource;

public class Conexion {

    Connection con;
    Statement st;
    public static String user = "YOUR_KEYS";
    public static String password = "1234";
    public static String IP = "";

    public boolean conectar() {
        try {
            con = null;
            OracleDataSource ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@" + IP + ":1521:XE");
            ods.setUser(user);
            ods.setPassword(password);
            con = ods.getConnection();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡Error de conexión!", null, JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ResultSet consulta(String sql) {
        try {
            if (con == null) {
                conectar();
            }
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean accion(String sql) {
        try {
            if (con==null) {
                conectar();
            }
            st = con.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public Connection connection(){
        if (con==null) {
            conectar();
        }
        return con;
    }

}
