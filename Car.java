
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Car
{
private double gas;
private double efficiency;

public Car(double fuelEfficiency) 
{
        efficiency = fuelEfficiency;
        gas = 0;
} 

public void tank(double amount)
{
    gas += amount;
}

public double getFuelLevel() 
{
     return gas; 
} 
 
public void drive(double distance)
{
if (distance > efficiency*gas)
{
    gas = 2;
}
else 
{
     gas = gas - distance/efficiency; 
 } 
}
}




