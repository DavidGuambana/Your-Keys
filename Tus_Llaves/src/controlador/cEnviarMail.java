package controlador;

import controlador.otros.notificacion;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import vista.vDevolucion;


public final class cEnviarMail {
    
    vDevolucion vista;
    private final String autor = "yourkeys777@gmail.com";
    private final String autor_password = "mmojugaljtpduxxg";
    private String destinatario;
    private String asunto;
    private String mensaje;
    private final String destinatario_name;
    DefaultListModel<String> modelo;

    public cEnviarMail(vDevolucion vista, String destinatario, String destinatario_name) {
        this.vista = vista;
        this.destinatario = destinatario;
        this.destinatario_name = destinatario_name;
        iniciar();
        abrirDialogo();
        Properties = new Properties();
    }
    
    public void iniciar() {
        limpiar();
        vista.getTxtDestinatario().setText(destinatario);
        vista.getTxtMensaje().setText("Estimad@ " + destinatario_name + ",\n"
                + "\n"
                + "Por este medio, me permito informarle que el tiempo de devolución del vehículo que usted adquirio ha sobrepasado el tiempo acordado, por lo cual se ha hecho acreedor a la multa correspondiente. Le agradecería mucho si pudiera devolver el vehículo lo más pronto posible.\n"
                + "\n"
                + "Agradezco su atención y quedo a sus órdenes.\n"
                + "\n"
                + "Atentamente, YOUR-KEYS");

        vista.getBtnExaminar().addActionListener(l -> agregar_file());
        vista.getBtnEliminar().addActionListener(l-> eliminar_file());
        vista.getJl_Archivos().addListSelectionListener(l-> vista.getBtnEliminar().setVisible(true));
        vista.getJbEnviar().addActionListener(l-> {
            crearMail();
        });
        vista.getJbRegresar2().addActionListener(l-> vista.getJdEnviarMail().setVisible(false));
    }

    private File[] archivos_adjuntos;

    private final Properties Properties;
    private Session Session;
    private MimeMessage Correo;
    
    public void crearMail() {
        destinatario = vista.getTxtDestinatario().getText();
        asunto = vista.getTxtAsunto().getText();
        mensaje = vista.getTxtMensaje().getText();
        if (destinatario.isEmpty() || asunto.isEmpty() || mensaje.isEmpty()) {
            notificacion.warning("Mensaje de envio","¡Aún hay campos por completar!");
        } else {
            try {
                Properties.put("mail.smtp.host", "smtp.gmail.com");
                Properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
                Properties.setProperty("mail.smtp.starttls.enable", "true");
                Properties.setProperty("mail.smtp.port", "587");
                Properties.setProperty("mail.smtp.user", autor);
                Properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
                Properties.setProperty("mail.smtp.auth", "true");

                Session = Session.getDefaultInstance(Properties);

                MimeMultipart mElementosCorreo = new MimeMultipart();
                // Contenido del correo
                MimeBodyPart mContenido = new MimeBodyPart();
                mContenido.setContent(mensaje, "text/html; charset=utf-8");
                mElementosCorreo.addBodyPart(mContenido);

                //Incluir archivos adjuntos.
                MimeBodyPart mAdjuntos = null;
                try {
                    if (!vista.getLblCountFiles().getText().equals("Archivos adjuntos: 0")) {
                        for (int i = 0; i < archivos_adjuntos.length; i++) {
                            mAdjuntos = new MimeBodyPart();
                            mAdjuntos.setDataHandler(new DataHandler(new FileDataSource(archivos_adjuntos[i].getAbsolutePath())));
                            mAdjuntos.setFileName(archivos_adjuntos[i].getName());
                            mElementosCorreo.addBodyPart(mAdjuntos);
                        }
                    }
                } catch (MessagingException e) {
                    mAdjuntos = null;
                }
                Correo = new MimeMessage(Session);
                Correo.setFrom(new InternetAddress(autor));
                Correo.setRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
                Correo.setSubject(asunto);
                Correo.setContent(mElementosCorreo);
                enviarMail();
            } catch (AddressException ex) {
            } catch (MessagingException ex) {
            }
        }
    }

    public void enviarMail() {
        try {
            
            Transport mTransport = Session.getTransport("smtp");
            mTransport.connect(autor, autor_password);
            mTransport.sendMessage(Correo, Correo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
            notificacion.success("Mensaje de envio","¡E-mail enviado correctamente!");
            limpiar();
            vista.getJdEnviarMail().setVisible(false);
        } catch (NoSuchProviderException ex) {
            notificacion.error("Mensaje de envio","¡No se pudo enviar!");
        } catch (MessagingException ex) {
            notificacion.error("Mensaje de envio","¡Archivo muy pesado!");
        }
    }
    
    public void abrirDialogo() {
        vista.getJdEnviarMail().setTitle("Enviar e-mail");
        vista.getJdEnviarMail().setLocation(vista.getLocation());
        vista.getJdEnviarMail().setSize(385, 610);
        vista.getJdEnviarMail().setLocationRelativeTo(null);
        vista.getJdEnviarMail().setVisible(true);
        
    }
    
    public void limpiar(){
        vista.getTxtAsunto().setText("");
        vista.getLblCountFiles().setText("Archivos adjuntos: 0");
        modelo = new DefaultListModel<>();
        vista.getJl_Archivos().setModel(modelo);
        archivos_adjuntos = null;
        vista.getBtnEliminar().setVisible(false);
    }

    public void eliminar_file() {
        ArrayList<File> archivos = new ArrayList<>(Arrays.asList(this.archivos_adjuntos));
        int[] selectedIndices = vista.getJl_Archivos().getSelectedIndices();
        for (int i = selectedIndices.length - 1; i >= 0; i--) {
            int selectedIndex = selectedIndices[i];
            archivos.remove(selectedIndex);
            this.archivos_adjuntos = archivos.toArray(new File[0]);
            modelo.remove(selectedIndex);
        }
        vista.getLblCountFiles().setText("Archivos adjuntos: "+(archivos_adjuntos.length));
        if (archivos.isEmpty()) {
            vista.getBtnEliminar().setVisible(false);
        }
    }


    public void agregar_file() {
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        if (chooser.showOpenDialog(vista) != JFileChooser.CANCEL_OPTION) {
            archivos_adjuntos = chooser.getSelectedFiles();
            System.out.println(archivos_adjuntos[0].getName());
            modelo = new DefaultListModel<>();
            for (File archivo : archivos_adjuntos) {
                modelo.addElement(archivo.getName());
            }
            vista.getJl_Archivos().setModel(modelo);
            vista.getLblCountFiles().setText("Archivos adjuntos: "+archivos_adjuntos.length);
        }
    }
}