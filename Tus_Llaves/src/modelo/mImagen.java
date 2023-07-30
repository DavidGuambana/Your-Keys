package modelo;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.tablas.Imagen;

public class mImagen extends Imagen {

    private final Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

    public List<Imagen> listar(int id) {
        List<Imagen> imagenes = new ArrayList<>();
        try {
            if (id == 0) {
                sql = "SELECT id, nombre, valor FROM imagen";
            } else {
                sql = "SELECT id, nombre, valor  FROM imagen WHERE id=" + id;
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Imagen imagens = new Imagen(rs.getInt(1), rs.getString(2), rs.getBytes(3));
                    imagenes.add(imagens);
                }
            }
            return imagenes;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean crear() {
        try {
            Connection c =(Connection) con.connection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO Imagen(nombre,valor) VALUES(?,?)");
            ps.setString(1, getNombre());
            ps.setBytes(2, getValor());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean actualizar() {
        try {
            Connection c =(Connection) con.connection();
            PreparedStatement ps = c.prepareStatement("UPDATE Imagen SET nombre=?,valor=? WHERE id=?");
            ps.setString(1, getNombre());
            ps.setBytes(2, getValor());
            ps.setInt(3, getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }



    public int ultimoID() {
        int id = 0;
        try {
            sql = "SELECT * FROM (SELECT ID FROM IMAGEN ORDER BY ID DESC) WHERE ROWNUM <= 1";
            rs = con.consulta(sql);
            rs.next();
            id = rs.getInt(1);
        } catch (SQLException ex) {
        }
        return id;
    }
    
    public mImagen BuscarImagen(String cedula) throws SQLException{
        mImagen retorno = new mImagen();
        String sql = "SELECT i.id,i.nombre,i.valor FROM IMAGEN i INNER JOIN PERSONA p ON (i.id = p.id_imagen)\n" +
        "WHERE p.cedula = '"+cedula+"'";
        rs = con.consulta(sql);
        while(rs.next()){
            retorno.setId(rs.getInt(1));
            retorno.setNombre(rs.getString(2));
            retorno.setValor(rs.getBytes(3));
        }
        return retorno;
    }
}
