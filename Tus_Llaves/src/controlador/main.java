package controlador;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.vPrincipal;

public class main {

    public static void main(String[] args) throws IOException, SQLException {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
            setBordeButton();
            cPrincipal control = new cPrincipal(new vPrincipal());
            control.PrimerInicio();
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
