/**
 * To draw two rectangles that may or may not overlap.
 * 
 * @author (Kenneth) 
 * @version (10/7/16)
 */
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
public class IntersectionRectangles extends JComponent
{
    /**
     * To complete all the drawing tasks. 
     * @param g the graphical tool to draw
     */
    public void paintComponent(Graphics g)
    {
       Graphics2D g4 = (Graphics2D)g;
       
       RectangleIllustrate r = new RectangleIllustrate();
       r.illustrate(g4);
    }
}
