
/**
 * This creates a frame for the user to draw on and display rectangles and connects 
 * IntersectingRectanglesRunner with IntersectingsRectangles.
 * 
 * @author (Evan Sum) 
 * @version (10/8/16)
 * 
 * To show a frame.
 * 1)Construct an object of JFrame.
 *      Jframe frame= mnew JFrame();
 * 2) Set the size of the frame
 *      frame,setSize(300,400);
 *      //300 pixels wide, 400 pixels tall
 * 3)Optional - Naming the frame.
 *      frame.setTitle("My First Love");
 * 4) set the "default close operation"
 *      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 *      // if omit,the program continues running even after the frame is closed.
 * 5)
 */
import javax.swing.JFrame;
public class BarChartRunner
{
    public static void main(String[] args)
    {
        
    JFrame frame=new JFrame();
    frame.setSize(1000,500);
    frame.setTitle("Bar Chart");
    
    BarChart chart=new BarChart();

    frame.add(chart);
   
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
}
