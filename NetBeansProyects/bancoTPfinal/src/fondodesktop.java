

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;


public class fondodesktop extends JDesktopPane {
    private BufferedImage img;
    
    public fondodesktop(){
        try {
            img = ImageIO.read(getClass().getResourceAsStream("/imagenes/fondohelado.jpg"));
        }catch (IOException Ex){
          JOptionPane.showMessageDialog(null, "No se encuentra la imagen", "Atencion!", JOptionPane.INFORMATION_MESSAGE);
      
        }
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        
    }
}
