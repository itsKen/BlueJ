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
public class Illustrator
{
    private int xTop, yLeft, width, height;
    
    public Illustrator(int x, int y, int aWidth, int aHeight)
    {
        xTop = x;
        yLeft = y;
        width = aWidth;
        height = aHeight;
    }
    
    public void illustrate(Graphics2D g3)
    {
        Rectangle whiteRect = new Rectangle(xTop,yLeft,width,height);
        g3.setColor(Color.WHITE);
        //g2.draw(greenRect);
        g3.fill(whiteRect);
        
        Rectangle blueRect = new Rectangle(xTop, yLeft + height, width, height);
        g3.setColor(Color.BLUE);
        //g2.draw(whiteRect);
        g3.fill(blueRect);
        
        Rectangle redRect = new Rectangle(xTop, yLeft + height + height ,width, height);
        g3.setColor(Color.RED);
        //g2.draw(redRect);
        g3.fill(redRect);
    }
}
