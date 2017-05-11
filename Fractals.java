

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class Fractals extends JPanel{
    private static int WIDTH = 800;
    private static int HEIGHT = 800;
    protected BufferedImage image = new BufferedImage(800,800, BufferedImage.TYPE_INT_RGB);
    private double x1 , y1, x2 , y2 ;

    public void draw(){
        JFrame frame = new JFrame("Fractals");

        frame.setContentPane(this);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setSize(WIDTH, HEIGHT);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(image,0,0,this);
    }
}
