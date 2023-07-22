package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.tablas.Contrato;

public class mContrato extends Contrato {

    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

    public List<Contrato> listar(int codigo) {
        List<Contrato> contratos = new ArrayList<>();
        try {
            if ("".equals(codigo)) {
                sql = "SELECT codigo, fecha, id_conductor, horas, total, id_alquiler FROM contrato";
            } else {
                sql = "SELECT codigo, fecha, id_conductor, horas, total, id_alquiler FROM contrato WHERE codigo=" + codigo + "";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Contrato contrato = new Contrato(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getInt(4), rs.getDouble(5), rs.getInt(6));
                    contratos.add(contrato);
                }
            }
            con.close();
            return contratos;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean crear() {
        sql = "INSERT INTO contrato(fecha, id_conductor, horas, total, id_alquiler)"
                + " VALUES (TO_DATE('" + getFecha()
                + "','YYYY-MM-DD')"
                + "," + getId_conductor()
                + "," + getHoras()
                + "," + getTotal()
                + "," + getId_alquiler() + ")";
        return con.accion(sql);
    }

    public List<Contrato> buscar(String txt, String campo) {
        List<Contrato> contratos = new ArrayList<>();
        try {
            sql = "SELECT codigo, fecha, id_conductor, horas, total, id_alquiler FROM contrato WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Contrato contrato = new Contrato(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getInt(4), rs.getDouble(5), rs.getInt(6));
                    contratos.add(contrato);
                }
            }
            con.close();
            return contratos;
        } catch (SQLException ex) {
            return null;
        }
    }
}
