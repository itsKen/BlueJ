
/**
 * Write a description of class Euler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Euler
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     int three = 0;
     int five = 0;
     int sum = 0;
     for(int i = 0; i < 1000; i++)
     {
         if(i%3 == 0) {
         three = i + three;
        }
         else if(i%5 == 0) {
         five = i + five;
        }
        sum = three + five;
     } 
     System.out.print("Sum is: " + sum);
      
    }
}
