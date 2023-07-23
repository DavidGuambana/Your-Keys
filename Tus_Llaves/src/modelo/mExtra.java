package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.tablas.Extra;

public class mExtra extends Extra {

    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

    public List<Extra> listar(int codigo) {
        List<Extra> extras = new ArrayList<>();
        try {
            if (codigo == 0) {
                sql = "SELECT codigo, nombre, precio, id_categoria, existencias FROM extra";
            } else {
                sql = "SELECT codigo, nombre, precio, id_categoria, existencias FROM extra WHERE codigo=" + codigo + "";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Extra extra = new Extra(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4),rs.getInt(5));
                    extras.add(extra);
                }
            }
            con.close();
            return extras;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean crear() {
        sql = "INSERT INTO extra(nombre, precio, existencias, id_categoria)"
                + " VALUES ('" + getNombre()
                + "'," + getPrecio()
                + ",'" + getExistencias()
                + "','" + getId_categoria() + "')";
        System.out.println(sql);
        return con.accion(sql);
    }

    public boolean eliminar(int codigo) {
        sql = "DELETE FROM extra WHERE codigo=" + codigo + "";
        return con.accion(sql);
    }

    public boolean actualizar() {
        sql = "UPDATE extra SET nombre='"
                + getNombre() + "', precio="
                + getPrecio() + ", existencias="
                + getExistencias() + ", id_categoria="
                + getId_categoria() + " WHERE codigo=" + getCodigo() + "";
        return con.accion(sql);
    }

    public List<Extra> buscar(String txt, String campo) {
        List<Extra> extras = new ArrayList<>();
        try {
            sql = "SELECT codigo, nombre, precio, id_categoria, existencias FROM extra WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Extra extra = new Extra(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getInt(5));
                    extras.add(extra);
                }
            }
            con.close();
            return extras;
        } catch (SQLException ex) {
            return null;
        }
    }

     
     public boolean updateExtraStock() {
        sql = "UPDATE extra SET existencias="
                + getExistencias()+ " WHERE codigo=" + getCodigo();
        return con.accion(sql);
    }
   
     public ResultSet obtener_extra(int ID) {
        sql = "SELECT * FROM EXTRA WHERE codigo="+ID+""; 
         System.out.println(sql);
        rs = con.consulta(sql);
        return rs;
     }
     
      public ResultSet join2() {
        sql = "SELECT e.codigo, e.nombre, e.precio, e.existencias, c.nombre FROM Extra e JOIN Categoria c ON(e.id_categoria = c.id)";
        rs = con.consulta(sql);
        return rs;
    }
}
