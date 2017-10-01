/**
 * Creates an empty frame.
 * 
 * @author (Kenneth Nguyen) 
 * @version (10/6/16)
 
 */
import javax.swing.JFrame;
public class FlagFrame
{
   public static void main(String[] args)
   {
       JFrame frame = new JFrame();
       frame.setSize(1500,1500);
       frame.setTitle("Flag of Russia");
       
       RussiaFlag flag = new RussiaFlag();
       frame.add(flag);
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}