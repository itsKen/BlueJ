
/**
 * To draw the flag of Russia.
 * 
 * @author (Kenneth) 
 * @version (10/6/16)
 */
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
public class RussiaFlag extends JComponent
{
    /**
     * To complete all the drawing tasks. 
     * @param g the graphical tool to draw
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g3 = (Graphics2D)g;
        
        Illustrator paintMe = new Illustrator(0,0,1000,200);
        paintMe.illustrate(g3);
    }
}
