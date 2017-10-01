/**
 * To draw a flag of a country of choice.
 * 
 * @author (Kenneth) 
 * @version (10/6/16)
 */
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
public class MyFlag extends JComponent
{
    /**
     * To complete all the drawing tasks. 
     * @param g the graphical tool to draw
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        
        TuPham tutu = new TuPham(100,100,100,200);
        tutu.illustrate(g2);
    }
}

