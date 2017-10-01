
/**
 * Write a description of class SelectionSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SelectionSort extends JComponent
{
    private int[] num;
    int frameWidth = 500;
    

    public SelectionSort(int arraySize)
    {
        num = new int[arraySize];
        fillArray();
    }

    public void fillArray()
    {
        for (int i = 0; i < num.length; i++)
        {
            Random generator = new Random();
            num[i] = generator.nextInt(100)+1;
        }
    }
    
    public void sort()
    {
        for (int i = 0; i< num.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < num.length; j++)
            {
                if (num[j] < num[index])
                    index = j;
            }
            if (index != i)
            {
                int smallerNumber = num[index];
                num[index] = num[i];
                num[i] = smallerNumber;
                repaint();
                return;
            }
        }
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        int width = frameWidth / num.length; 
        for (int i = 0; i <num.length; i++)
        {
            Rectangle rect = new Rectangle(0,width*i,num[i]*8,width);
            g2.draw(rect);
        }
    }
    
    public static void main(String [] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        SelectionSort s = new SelectionSort(75);
        frame.add(s);
        
        class TimerListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                s.sort();
            }
        }
        
        ActionListener listener = new TimerListener();
        Timer t = new Timer(300, listener);
        t.start();
    }
}



