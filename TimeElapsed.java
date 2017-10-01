
/**
 * Write a description of class TimeElapsed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TimeElapsed
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the first time: ");
     int timeOne = input.nextInt();
     System.out.print("Enter the second time: ");
     int timeTwo = input.nextInt();
     int hoursOne = timeOne/100;
     int minutesOne = timeOne%100;
     int hoursTwo = timeTwo/100;
     int minutesTwo = timeTwo%100;
     int totalMinsSinceMidOne = (hoursOne*60) + minutesOne;
     int totalMinsSinceMidTwo = (hoursTwo*60) + minutesTwo;
     int elapsed = totalMinsSinceMidTwo - totalMinsSinceMidOne;
     int hours = elapsed/60; 
     int minutes = elapsed%60;
     System.out.print(hours + " hour(s) " + minutes + " minute(s) ");
      
    }
}
