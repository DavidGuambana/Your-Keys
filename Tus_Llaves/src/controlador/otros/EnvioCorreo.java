package controlador.otros;
import java.util.Properties;
import javax.mail.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class EnvioCorreo {

    public boolean envcorreoarch(String correo, String archivo) {

        return false;

    }

    public void envcorrtext(String correo) {
            try {
         //Get system properties
        Properties props = System.getProperties();
         //Setup mail server
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.starttls.enable", "true");
                // AUTENTICACION DE CONTRASEÑA DE GOOGLE
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("edisonariel007@gmail.com", "wjdgsbseyfmcftvf");
            }
        };     
         //Get session
        Session session = Session.getDefaultInstance(props, auth);
        // Define message
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(correo));
        message.setSubject("YOUR KEYS-AVISO");
        message.addRecipient(Message.RecipientType.TO,new InternetAddress(correo));
        message.setText("Buenas estimado cliete de 'YOUR KEYS' por este medio se le avisa que el tiempo de devolucion del vehiculo "
                + "ha sobrepasado lo acordado por lo cual se ha hecho acreedor a la multa correspondiete, por favor devolver el vehiculo "
                + " y cancelar los valores pendientes los mas pronto");
        Transport.send(message);
        JOptionPane.showMessageDialog(null, "Enviado correctamente");
        
    } catch (Throwable e) {
        System.out.println("Fallo sendEmail al enviar Correo: "+e.getMessage());
        e.printStackTrace();
    }
   

    }

}
