package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.tablas.Modelo;

public class mModelo extends Modelo {
    
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
    public List<Modelo> listar(int id) {
        List<Modelo> modelos = new ArrayList<>();
        try {
            if (id ==0) {
//                sql = "SELECT id, nombre, id_marca FROM modelo";
            } else {
                sql = "SELECT id, nombre, id_marca FROM modelo WHERE id_marca=" + id + "";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Modelo modelo = new Modelo(rs.getInt(1), rs.getString(2), rs.getInt(3));
                    modelos.add(modelo);
                }
            }
            con.close();
            return modelos;
        } catch (SQLException ex) {
            return null;
        }
    }
      public boolean crear() {
        sql = "INSERT INTO modelo(nombre, id_marca)"
                + " VALUES ('" + getNombre()
                + "'," + getId_marca()+")";
          System.out.println(sql);
        return con.accion(sql);
    }
 
    public boolean eliminar(int id) {
        sql = "DELETE FROM modelo WHERE id=" + id + "";
        return con.accion(sql);
    }
    
    public boolean actualizar() {
        sql = "UPDATE modelo SET nombre='"
                +getNombre() + "', id_marca="
                +getId_marca()+" WHERE id='"+getId()+"'";
        return con.accion(sql);
    }
    
    public List<Modelo> buscar(String txt, String campo) {
        List<Modelo> modelos = new ArrayList<>();
        try {
            sql = "SELECT id, nombre, id_marca FROM modelo WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Modelo modelo = new Modelo(rs.getInt(1), rs.getString(2), rs.getInt(3));
                    modelos.add(modelo);
                }
            }
            con.close();
            return modelos;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean existemodelos(String id) {
        boolean exist = false;
        try {
            sql = "SELECT COUNT(ID)FROM MODELO WHERE ID=" + id + "";
            System.out.println(sql);
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
            Logger.getLogger(mModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist;
    }
    
    public int ultimoCodigo() {
        int id = 0;
        try {
            sql = "SELECT * FROM (SELECT ID FROM MODELO ORDER BY ID DESC) WHERE ROWNUM <= 1";
            rs = con.consulta(sql);
            rs.next();
            id = rs.getInt(1);
        } catch (SQLException ex) {
        }
        return id;
    }
    public int idmodelo(String nombre){
        int id = 0;
        try {
            sql = "SELECT id from modelo where nombre='"+nombre+"'";
            rs = con.consulta(sql);
            rs.next();
            id = rs.getInt(1);
        } catch (SQLException ex) {
        }

        return id;
    }
}
