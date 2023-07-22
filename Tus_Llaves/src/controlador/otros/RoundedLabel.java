package controlador.otros;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.RenderingHints;


public class RoundedLabel extends JLabel {
    private final int radius;
    private final Color fillColor;
    private final Color borderColor;
    private float borderWidth;

    public RoundedLabel(String text, int radius, int fillColorRGB, int borderColorRGB, float borderWidth) {
        super(text);
        this.radius = radius;
        this.fillColor = new Color(fillColorRGB);
        this.borderColor = new Color(borderColorRGB);
        this.borderWidth = borderWidth;
    }

    public RoundedLabel() {
        this.radius = 0;
        this.fillColor = null;
        this.borderColor = null;
        this.borderWidth = 0.0f;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        g2.setColor(fillColor);
        g2.fillRoundRect(0, 0, w - 1, h - 1, radius, radius);

        // Establece el color del borde aquí
        g2.setColor(borderColor);

        float[] dashPattern = {borderWidth};
        g2.setStroke(new BasicStroke(borderWidth, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND, 10.0f, dashPattern, 0.0f));

        g2.drawRoundRect(0, 0, w - 1, h - 1, radius, radius);

        super.paintComponent(g);
        g2.dispose();
    }
    
    public void setRoundedImage(BufferedImage originalImage, JLabel l) {
    // Obtengo el tamaño preferido del label
    Dimension size = l.getPreferredSize();
    // Asigno el ancho y el alto del nuevo BufferedImage al tamaño del label
    int new_width = size.width;
    int new_height = size.height;
    // Creo un nuevo BufferedImage del tamaño del label
    BufferedImage resizedImage = new BufferedImage(new_width, new_height, BufferedImage.TYPE_INT_ARGB);
    // Pinto la imagen original escalada en el nuevo BufferedImage
    Graphics2D g = resizedImage.createGraphics();
    g.drawImage(originalImage, 0, 0, new_width, new_height, null);
    g.dispose();
    // Reemplazo la imagen original por la escalada
    originalImage = resizedImage;
    // Creo un nuevo BufferedImage con forma de círculo
    int diameter = Math.min(new_width, new_height);
    BufferedImage mask = new BufferedImage(new_width, new_height, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2d = mask.createGraphics();
    // applyQualityRenderingHints(g2d); // Comento o borro esta línea
    g2d.fillOval(0, 0, diameter - 1, diameter - 1);
    g2d.dispose();
    // Aplico la máscara a la imagen original
    BufferedImage masked = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g3d = masked.createGraphics();
    // applyQualityRenderingHints(g3d); // Comento o borro esta línea
    int x = (diameter - new_width) / 2;
    int y = (diameter - new_height) / 2;
    g3d.drawImage(originalImage, x, y, null);
    g3d.setComposite(AlphaComposite.getInstance(AlphaComposite.DST_IN));
        g3d.drawImage(mask, 0, 0, null);
        g3d.dispose();
        // Asigno la imagen redondeada al label
        l.setIcon(new ImageIcon(masked));
    }

    public void setRoundedImage2(BufferedImage originalImage, JLabel l) {
        // Obtengo el tamaño preferido del label
        Dimension size = l.getPreferredSize();
        // Asigno el ancho y el alto del nuevo BufferedImage al tamaño del label
        int new_width = size.width;
        int new_height = size.height;
        // Creo un nuevo BufferedImage del tamaño del label
        BufferedImage resizedImage = new BufferedImage(new_width, new_height, BufferedImage.TYPE_INT_ARGB);
        // Pinto la imagen original escalada en el nuevo BufferedImage
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, new_width, new_height, null);
        g.dispose();
        // Reemplazo la imagen original por la escalada
        originalImage = resizedImage;
        // Creo un nuevo BufferedImage con forma de círculo
        int diameter = Math.min(new_width, new_height);
        BufferedImage mask = new BufferedImage(new_width, new_height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = mask.createGraphics();
        applyQualityRenderingHints(g2d);
        g2d.fillOval(0, 0, diameter - 1, diameter - 1);
        g2d.dispose();
        // Aplico la máscara a la imagen original
        BufferedImage masked = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g3d = masked.createGraphics();
        applyQualityRenderingHints(g3d);
        int x = (diameter - new_width) / 2;
        int y = (diameter - new_height) / 2;
        g3d.drawImage(originalImage, x, y, null);
        g3d.setComposite(AlphaComposite.getInstance(AlphaComposite.DST_IN));
        g3d.drawImage(mask, 0, 0, null);
        g3d.dispose();
        // Asigno la imagen redondeada al label
        l.setIcon(new ImageIcon(masked));
    }

    public void applyQualityRenderingHints(Graphics2D g2d) {
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        // Aquí puedes agregar más RenderingHints según tus preferencias
    }

}
