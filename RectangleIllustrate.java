/**
 * Does the graphic illustration.
 * 
 * @author (Kenneth Nguyen) 
 * @version (10/6/16)
 */
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
public class RectangleIllustrate
{
    public void illustrate(Graphics2D g4)
    {
       Rectangle r1 = new Rectangle(200,150,100,170);
       Rectangle r2 = new Rectangle(190,170,200,150);
       g4.draw(r1);
       g4.draw(r2);
   
        Rectangle r3 = r1.intersection(r2);
        g4.setColor(Color.GREEN);
        
        g4.fill(r3);
        double area = r3.getWidth() * r3.getHeight();
        
        g4.setColor(Color.BLACK);
        g4.drawString(area + "", (int)r3.getCenterX(), (int)r3.getCenterY());
}
}
