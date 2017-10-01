
/**
 * This class extends JComponent to automatically run paintComponent
 * and connects CreatingRectangles with IntersectingRectangles to draw.
 * 
 * @author (Evan Sum) 
 * @version (10/6/16)
 */
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Rectangle;
public class BarChart extends JComponent
{
    /**
     * To complete all the drawing tasks
     * @param g the graphical tool to draw
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2= (Graphics2D)g;
        
        CreateChart creator=new CreateChart();
        creator.maximum();
        creator.illustrate(g2);

    }
}
