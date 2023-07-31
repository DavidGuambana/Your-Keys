package modelo.tablas;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

public class JDP_IMG extends JDesktopPane{
    
    private BufferedImage img,img2;

    public JDP_IMG() {
        try {
            img = ImageIO.read(getClass().getResourceAsStream("/vista/img/fondo_login.JPEG"));
            img2 = ImageIO.read(getClass().getResourceAsStream("/vista/img/logo_name.png"));
        } catch (IOException ex) {
            Logger.getLogger(JDP_IMG.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(img, 10, 10,1147, 555, null);
            g.drawImage(img2, 10, 30,1147, 70, null);
    }
}
