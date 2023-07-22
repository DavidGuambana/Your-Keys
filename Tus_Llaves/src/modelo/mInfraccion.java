package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.tablas.Categoria;
import modelo.tablas.Infraccion;

public class mInfraccion extends Infraccion{
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
    public List<Infraccion> listar(int id) {
        List<Infraccion> Infracciones = new ArrayList<>();
        try {
            if ("".equals(id)) {
                sql = "SELECT id, nombre, descripcion FROM infraccion";
            } else {
                sql = "SELECT id, nombre, descripcion FROM infraccion WHERE id="+id;
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Infraccion infraccion = new Infraccion(rs.getInt(1),rs.getString(2),rs.getString(3));
                    Infracciones.add(infraccion);
                }
            }
            con.close();
            return Infracciones;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public List<Categoria> buscar(String txt, String campo) {
        List<Categoria> Categoria = new ArrayList<>();
        try {
            sql = "SELECT id, nombre FROM categoria WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Categoria categoria = new Categoria(rs.getInt(1),rs.getString(2));
                    Categoria.add(categoria);
                }
            }
            con.close();
            return Categoria;
        } catch (SQLException ex) {
            return null;
        }
    }
}
