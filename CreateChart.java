
/**
 * Write a description of class CreateBarGraph here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Rectangle;
public class CreateChart
{
    private int [ ] m; 
    private int max;
    private int width;
    private int multiplier;
    
  public CreateChart ()
  {
       m = new int [ ] {20,-200,4,8,12,0};
       max = 0;
       width = 1000/m.length;
       multiplier = 0;
    }
    
    public void illustrate(Graphics2D g2)
    {
     for (int i = 0; i < m.length; i++)
     {
         Rectangle getRect1;
         if (m[i]>0)
         {
          getRect1 = new Rectangle (i*width,250-multiplier*m[i],width, multiplier*m[i]); 
        
        }
        
         else{
          getRect1 = new Rectangle (i*width,250,width,Math.abs(multiplier*m[i])); 
         
        }
        
        if( i % 2 == 0)
        {
            g2.setColor(Color.RED);
        }
        else
        {
            g2.setColor(Color.BLUE);
        }
        
        g2.fill(getRect1);
     
    }
}
    public void maximum ()
    {
        for (int i = 0; i <m.length; i++)
        {
            max = Math.max(Math.abs(m[i]),Math.abs(max));
            
        }
        multiplier = 250/Math.abs(max);
    }
}

