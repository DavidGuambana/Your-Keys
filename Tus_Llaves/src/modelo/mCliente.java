package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.tablas.Cliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mCliente extends Cliente {

    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

    public List<Cliente> listar(int codigo) {

        List<Cliente> clientes = new ArrayList<>();
        try {
            if (codigo == 0) {
                sql = "SELECT id, cedula_per, contraseña FROM Cliente";

            } else {
                sql = "SELECT id, cedula_per, contraseña FROM Cliente WHERE id=" + codigo;
            }

            rs = con.consulta(sql);
            if (rs != null) {

                while (rs.next()) {
                    Cliente cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
                    clientes.add(cliente);
                }
            }
            return clientes;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean crear() {
        sql = "INSERT INTO Cliente (cedula_per, contraseña) VALUES ('" + getCedula_per() + "', '" + getContraseña() + "')";
        return con.accion(sql);
    }

    public boolean actualizar() {
        sql = "UPDATE Cliente SET contraseña = '" + getContraseña() + "' WHERE id ='" + getId() + "'";

        return con.accion(sql);
    }

    public boolean eliminar() {
        sql = "DELETE FROM Cliente WHERE id = '" + getId() + "'";
        return con.accion(sql);
    }

    public List<Cliente> buscar(String txt, String campo) {
        List<Cliente> clientes = new ArrayList<>();
        try {
            sql = "SELECT id, cedula_per, contraseña FROM Cliente WHERE" + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Cliente cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
                    clientes.add(cliente);
                }
            }
            return clientes;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ResultSet obtener_cliente(String cedula) {

        sql = "SELECT * FROM Cliente JOIN Persona ON Cliente.cedula_per = Persona.cedula JOIN IMAGEN ON persona.id_imagen=imagen.id WHERE Persona.cedula ='" + cedula + "'";
        rs = con.consulta(sql);
        return rs;

    }
     public ResultSet jointabla() {
        sql = "SELECT * FROM Cliente JOIN Persona ON Cliente.cedula_per = Persona.cedula JOIN IMAGEN ON persona.id_imagen=imagen.id";
        rs = con.consulta(sql);
        return rs;
    }

    public int existecliente(String cedula) {
        int cont = 0;
        sql = "SELECT COUNT(CEDULA_PER) FROM CLIENTE WHERE CEDULA_PER = '" + cedula + "'";
        rs = con.consulta(sql);
        try {
            rs.next();
            cont = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(mCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cont;
    }

    public ResultSet join2() {
        sql = "SELECT c.id, p.cedula, p.nombre1, p.apellido1, i.valor FROM cliente c JOIN persona p ON(c.cedula_per = p.cedula)\n"
                + "JOIN imagen i ON (p.id_imagen = i.id)";
        rs = con.consulta(sql);
        return rs;
    }
    
    public ArrayList login() throws SQLException{
        ArrayList <mCliente> coleccion = new ArrayList();
        String logeo = "SELECT cedula_per FROM CLIENTE WHERE CEDULA_PER ='"+super.getCedula_per()+"' AND CONTRASEÑA = '"+super.getContraseña()+"'";
        rs = con.consulta(logeo);
        if(rs != null){
            while (rs.next()){
                    mCliente cliente = new mCliente();
                    cliente.setCedula_per(rs.getString(1));
                    coleccion.add(cliente);
            }
        }else{
            
        }
        return coleccion;
    }

    public ResultSet top() {
        sql = "SELECT * FROM(SELECT PERSONA.NOMBRE1||' '||PERSONA.APELLIDO1 AS NOMBRES,CLIENTE.CEDULA_PER,COUNT(cliente.cedula_per)\n"
                + "FROM ALQUILER JOIN CLIENTE ON ALQUILER.ID_CLIENTE=CLIENTE.ID JOIN PERSONA ON \n"
                + "CLIENTE.CEDULA_PER =PERSONA.CEDULA GROUP BY(PERSONA.NOMBRE1||' '||PERSONA.APELLIDO1,CLIENTE.CEDULA_PER)\n"
                + "ORDER BY COUNT(cliente.cedula_per) DESC) WHERE ROWNUM <=5";
        return con.consulta(sql);
    }
}
