
/**
 * Write a description of class HourlyWorker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HourlyWorker extends Worker
{
    public HourlyWorker(String nombre, double dinero) 
    {
        super(nombre, dinero);
    }
    
    public double computePay() 
    {
        if (getHours() > 40)
        {
            return (40.0 * salary) + ((getHours() - 40.0) * salary * 1.5);
        }
            return salary*getHours();
    }
    }
    

