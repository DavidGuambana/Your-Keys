package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.tablas.Detalle;

public class mDetalle extends Detalle{
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

    public List<Detalle> listar(int id) {
        List<Detalle> Detalle = new ArrayList<>();
        try {
            if ("".equals(id)) {
                sql = "SELECT id, codigo_extra, nombre, cantidad, subtotal, id_alquiler FROM detalle";
            } else {
                sql = "SELECT id, codigo_extra, nombre, cantidad, subtotal, id_alquiler FROM detalle WHERE id='" + id + "'";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Detalle detalle = new Detalle(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                            rs.getDouble(5), rs.getInt(6));
                    Detalle.add(detalle);
                }
            }
            return Detalle;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean crear() {
        sql = "INSERT INTO detalle(codigo_extra, nombre, cantidad, subtotal,id_alquiler)"
                + " VALUES (" + getCodigo_extra()
                + ",'" + getNombre()
                + "'," + getCantidad()
                + "," + getSubtotal()
                + "," + getId_alquiler()+ ")";
        return con.accion(sql);
    }

    public boolean actualizar() {
        sql = "UPDATE alquiler SET nombre='"
                + getNombre() + "', cantidad="
                + getCantidad() + "', subtotal="
                + getSubtotal() + " WHERE id='" + getId() + "'";
        return con.accion(sql);
    }

    public List<Detalle> buscar(String txt, String campo) {
        List<Detalle> Detalle = new ArrayList<>();
        try {
            sql = "SELECT id, codigo_extra, nombre, cantidad, subtotal, id_alquiler FROM detalle WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Detalle detalle = new Detalle(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                            rs.getDouble(5), rs.getInt(6));
                    Detalle.add(detalle);
                }
            }
            return Detalle;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean existedetalle(String id) {
        boolean exist = false;
        try {
            sql = "SELECT COUNT(id)FROM detalle WHERE id=" + id + "";
            rs = con.consulta(sql);
            if (rs != null) {
                rs.next();
                if (rs.getInt(1) == 0) {
                    exist = true;
                } else {
                    exist = false;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(mDetalle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist;
    }
}
