
/**
 * Write a description of class SalariedWorker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalariedWorker extends Worker
{   
   public SalariedWorker(String nombre, double dinero) 
    {
        super(nombre, dinero);
    }
    
    public double computePay()
    {
        return salary*getHours();
    }
}
