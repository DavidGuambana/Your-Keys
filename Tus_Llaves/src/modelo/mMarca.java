package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import modelo.tablas.Marca;

public class mMarca extends Marca {

    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

    public List<Marca> listar(int id) {
        List<Marca> marcas = new ArrayList<>();
        try {
            if (id ==0) {
                sql = "SELECT id, nombre FROM marca";
            } else {
                sql = "SELECT id, nombre FROM marca WHERE id=" + id + "";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Marca marca = new Marca(rs.getInt(1), rs.getString(2));
                    marcas.add(marca);
                }
            }
            return marcas;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean crear() {
        sql = "INSERT INTO marca(nombre)"
                + " VALUES ('" + getNombre() + "')";
        System.out.println(sql);
        return con.accion(sql);
    }

    public boolean eliminar(int id) {
        sql = "DELETE FROM marca WHERE id=" + id + "";
        return con.accion(sql);
    }

    public boolean actualizar() {
        sql = "UPDATE marca SET nombre='"
                + getNombre() + " WHERE id='" + getId() + "'";
        return con.accion(sql);
    }

    public List<Marca> buscar(String txt, String campo) {
        List<Marca> marcas = new ArrayList<>();
        try {
            sql = "SELECT id, nombre FROM marca WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Marca marca = new Marca(rs.getInt(1), rs.getString(2));
                    marcas.add(marca);
                }
            }
            return marcas;
        } catch (SQLException ex) {
            return null;
        }
    }

    public int ultimoCodigo() {
        int id = 0;
        try {
            sql = "SELECT * FROM (SELECT ID FROM MARCA ORDER BY ID DESC) WHERE ROWNUM <= 1";
            rs = con.consulta(sql);
            rs.next();
            id = rs.getInt(1);
        } catch (SQLException ex) {
        }
        return id;
    }
      public void llenarComboBox(JComboBox cb) {
        try {
            cb.removeAllItems();
            cb.addItem("Seleccione...");
            sql = "SELECT nombre FROM MARCA";
            rs = con.consulta(sql);
            while (rs.next()) {
                cb.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
        }
    }
}
