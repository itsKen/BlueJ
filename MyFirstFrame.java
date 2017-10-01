/**
 * Creates an empty frame.
 * 
 * @author (Kenneth Nguyen) 
 * @version (10/4/16)
 * 
 * To show a frame
 * 1) Construct an object of JFrame
 *      JFrame frame = new JFrame();   
 *      
 * 2) Set the size of the frame.
 *      frame.setSize(300,400);
 *      //300 pixels wide, 400 pixels tall
 * 
 * 3) Optional - Naming the frame
 *      frame.setTitle("");
 *      
 * 4) Set the "default close operation"
 *      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 *      //if omit, program continues running even after the frame is closed.
 *      
 * 5) Make the frame visible 
 *      frame.setVisible(true);
 */
import javax.swing.JFrame;
public class MyFirstFrame
{
   public static void main(String[] args)
   {
       JFrame frame = new JFrame();
       frame.setSize(1000,1000);
       frame.setTitle("Flag");
       
       MyFlag flag = new MyFlag();
       frame.add(flag);
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}

