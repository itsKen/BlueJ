
/**
 * Write a description of class CarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class CarTest
{
   public static void main(String[] args)
   {
    Scanner input = new Scanner(System.in);
    System.out.print("What is your fuel efficiency(mph)?: ");
    double efficiency = input.nextDouble();
    Car a = new Car(efficiency);
    
    System.out.print("How many gallons do you want to tank up?: ");
    double gallons = input.nextDouble();
    a.tank(gallons);
            
    System.out.print("How many miles do you wish to drive?: ");
    double miles = input.nextDouble();
    a.drive(miles);
        
    System.out.println("You have "+a.getFuelLevel()+ " gallons left");
   }
}
