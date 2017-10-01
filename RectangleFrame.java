/**
 * Creates an empty frame.
 * 
 * @author (Kenneth Nguyen) 
 * @version (10/7/16)
 
 */
import javax.swing.JFrame;
public class RectangleFrame
{
   public static void main(String[] args)
   {
       JFrame frame = new JFrame();
       frame.setSize(1000,1000);
       frame.setTitle("Intersection of Rectangles");
       
       IntersectionRectangles rect = new IntersectionRectangles();
       frame.add(rect);
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}
