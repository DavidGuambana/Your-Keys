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
        conectar();
        try {
            System.out.println(sql);
            st = con.createStatement();
            st.executeQuery(sql);
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean accion(String sql) {
        conectar();
        if (con != null) {
            try {
                System.out.println(sql);
                st = con.createStatement();
                if (st.executeUpdate(sql) == 1) {
                    st.close();
                    return true;
                } else {
                    return false;
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } else {
            return false;
        }

    }

    public void close() {
        try {
            con.close();
        } catch (SQLException ex) {
        }
    }
    
    public Connection connection(){
        conectar();
        return con;
    }
}
