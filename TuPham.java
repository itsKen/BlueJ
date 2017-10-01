/**
 * Does all the dirty graphic illustration (legally).
 * 
 * @author (Dong Chi Tu) 
 * @version (10/6/16)
 */
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
public class TuPham
{
    private int xTop, yLeft, width, height;
    
    public TuPham(int x, int y, int aWidth, int aHeight)
    {
        xTop = x;
        yLeft = y;
        width = aWidth;
        height = aHeight;
    }
    
    public void illustrate(Graphics2D g2)
    {
         Rectangle greenRect = new Rectangle(xTop,yLeft,width,height);
        g2.setColor(Color.GREEN);
        //g2.draw(greenRect);
        g2.fill(greenRect);
        
        Rectangle whiteRect = new Rectangle(xTop + width, yLeft, width, height);
        g2.setColor(Color.WHITE);
        //g2.draw(whiteRect);
        g2.fill(whiteRect);
        
        Rectangle redRect = new Rectangle(xTop + width + width, yLeft ,width, height);
        g2.setColor(Color.RED);
        //g2.draw(redRect);
        g2.fill(redRect);
    }
}

