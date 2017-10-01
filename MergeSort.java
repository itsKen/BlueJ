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
public class MergeSort extends JComponent
{
    final int frameWidth=950;
    public int[] num;
    public int[] first;
    public int[] second;
    public MergeSort(int arraySize)
    {
        num = new int[arraySize];
        fillArray();
    }
    
    public void fillArray()
    {
        for(int i = 0; i < num.length; i++)
        {
            Random generator = new Random();
            num[i] = generator.nextInt(100)+1;
        }
    }
    
    private void mergeSort(int[] nums, int startIndex, int endIndex) throws InterruptedException
    {
        if (startIndex == endIndex)
        {
            return;
        }
        int midIndex = (startIndex + endIndex) / 2;
        mergeSort(nums, startIndex, midIndex);
        mergeSort(nums, midIndex + 1, endIndex);

        merge(nums, startIndex, midIndex, endIndex);
    }
    
    private void merge(int[] nums, int startIndex, int midIndex, int endIndex)throws InterruptedException
    {
        int n1 = midIndex - startIndex + 1;
        int n2 = endIndex - midIndex;
        int[] leftNums = new int[n1 + 1];
        int[] rightNums = new int[n2 + 1];

        System.arraycopy(nums, startIndex, leftNums, 0, n1);
        System.arraycopy(nums, midIndex+1, rightNums, 0, n2);

        leftNums[n1] = Integer.MAX_VALUE;
        rightNums[n2] = Integer.MAX_VALUE;

        int j = 0;
        int k = 0;
        for(int i = startIndex; i <= endIndex; i++){
            if(leftNums[j]<=rightNums[k])
            {
                nums[i]=leftNums[j];
                j++;
            }
            else
            {
                nums[i]=rightNums[k];
                k++;
            }
            repaint();
            Thread.sleep(100);
        }
    }  
    
    public int[] getArray()
    {
        return num;
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2= (Graphics2D)g;
        int width=frameWidth/num.length;
        for(int i=0; i < num.length; i++)
        {
            Rectangle rect=new Rectangle(0, width*i,num[i]*8,width);
            g2.draw(rect);
        }
    }
    
    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame= new JFrame();
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        MergeSort sorter=new MergeSort(100);
        frame.add(sorter);
        sorter.mergeSort(sorter.getArray(),0,sorter.getArray().length-1);
        frame.setVisible(true);        
    }
}