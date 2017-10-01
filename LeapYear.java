
/**
 * Write a description of class LeapYear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class LeapYear
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.print("What is the year? "); 
       int year = input.nextInt();
       if ((year%4 == 0) && (year%100 !=0 ))
       {
           System.out.println(year + " is a leap year ");
       }
       else if ((year%4 == 0) && (year%100 == 0) && (year%400 == 0))
       {
           System.out.println(year + " is a leap year ");
       }
       else
       {
           System.out.println(year + " is not a leap year ");
       }
   }
}
