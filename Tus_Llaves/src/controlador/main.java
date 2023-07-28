package controlador;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.mCliente;
import modelo.tablas.Cliente;
import vista.Login;
import vista.vPrincipal;

public class main {

    public static void main(String[] args) throws IOException, SQLException {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
            setBordeButton();
            Login vista = new Login();
            mCliente cliente = new mCliente();
            clogin inicio = new clogin(vista,cliente);
            inicio.Iniciar();
//            cPrincipal control = new cPrincipal(new vPrincipal());
//            control.PrimerInicio();
        } catch (UnsupportedLookAndFeelException ex) {
        }
    }
    
    public static void setBordeButton() {
        UIManager.put("Button.arc", 100);
        UIManager.put("Component.arc", 100);
        UIManager.put("ProgressBar.arc", 100);
        UIManager.put("TextComponent.arc", 100);
    }
}
