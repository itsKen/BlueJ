
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
public class InsertionSort extends JComponent
{
    private int[] num;
    int frameWidth = 500;

    public InsertionSort(int arraySize)
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
        int temp;
        for(int i = 1;i<num.length;i++)
        {
            for(int j = 1; j < num.length; j++)
            {
                if(num[j] < num[j-1])
                {
                    temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                    repaint();
                    return;
                }
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
        InsertionSort s = new InsertionSort(20);
        frame.add(s);

        class TimerListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                s.sort();
            }
        }

        ActionListener listener = new TimerListener();
        Timer t = new Timer(2000, listener);
        t.start();
    }
}

