package controlador;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.mCliente;
import modelo.mEmpleado;
import modelo.mPersona;
import modelo.tablas.Persona;
import vista.Login;
import vista.vPrincipal;

/**
 *
 * @author LENOVO
 */
public class clogin {
    private Login vista = new Login();
    private mCliente cliente = new mCliente();
    ArrayList <mPersona> coleccionPersonas = new ArrayList();
    ArrayList <mCliente> clientesArray = new ArrayList();
    static String cedulaCliente = "";
    static Persona empleado = new Persona();
    
    private ResultSet datos ;
    private mEmpleado modeloE = new mEmpleado();

    public clogin(Login vista, mCliente cliente) {
        this.vista = vista;
        this.cliente = cliente;
    }
    
    public void Iniciar(){
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.getBtn_inicio_sesion().addActionListener(l->{
            try {
                Logeo();
            } catch (SQLException ex) {
                Logger.getLogger(clogin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(clogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        vista.getExitTxt1().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salir();
            }
        });
    }
    
    public void Logeo() throws SQLException, IOException{
        char[] password = vista.getLg_contraseña().getPassword();
        String passwordString = new String(password);
        if(vista.getLg_cedula().getText().equals("") || passwordString.equals("")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR CEDULA Y CONTRASEÑA");
        }else{
            cliente.setCedula_per(vista.getLg_cedula().getText());
            cliente.setContraseña(passwordString);
            clientesArray = cliente.login();
            coleccionPersonas = modeloE.logeoReal(vista.getLg_cedula().getText(), passwordString);
            if(coleccionPersonas.isEmpty() && clientesArray.isEmpty()){
                JOptionPane.showMessageDialog(null,"USTED NO ESTA REGISTRADO EN EL SISTEMA");
            }else{
                if (!coleccionPersonas.isEmpty() && !clientesArray.isEmpty()) {
                    String[] options = {"CLIENTE", "EMPLEADO"};
                    int response = JOptionPane.showOptionDialog(null, "¿CON QUE ROL DESEA INGRESAR EN LA PLATAFORMA?", "Elegir Rol", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                    if (response == 0) {
                        //SE INICIA COMO CLIENTE
                        vPrincipal vista = new vPrincipal();
                        cPrincipal controlador = new cPrincipal(vista);
                        cedulaCliente = clientesArray.get(0).getCedula_per();
                        controlador.iniciar(0);
                        CerrarLogin();
                    } else if (response == 1) {
                       //SE INICIA COMO ADMINISTRADOR
                       vPrincipal vista = new vPrincipal();
                       cPrincipal controlador = new cPrincipal(vista);
                       empleado = coleccionPersonas.get(0);
                       cedulaCliente = coleccionPersonas.get(0).getCedula();
                       controlador.iniciar(1);
                       CerrarLogin();
                    }
                }else{
                    if(clientesArray.isEmpty()){
                        vPrincipal vista = new vPrincipal();
                       cPrincipal controlador = new cPrincipal(vista);
                       empleado = coleccionPersonas.get(0);
                       cedulaCliente = coleccionPersonas.get(0).getCedula();
                       controlador.iniciar(1);
                       CerrarLogin();
                    }else{
                        if(modeloE.Cargo(cedulaCliente).equals("Conductor")){
                            JOptionPane.showMessageDialog(null,"LOS CONDUCTORES NO TIENEN ACCESO AL SISTEMA");
                        }else{
                            modeloE.Cargo(cedulaCliente);
                        vPrincipal vista = new vPrincipal();
                        cPrincipal controlador = new cPrincipal(vista);
                        cedulaCliente = clientesArray.get(0).getCedula_per();
                        controlador.iniciar(0);
                        CerrarLogin();
                        }
                        
                   }
                }
                
            }
        }
        
    }
    
    public void salir(){
        System.exit(0);
    }
    
    public void CerrarLogin(){
        vista.dispose();
    }
    }
