
/**
 * Write a description of class Worker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worker
{
    public double salary;
    public String workerName;
    public int workHours;
    
    public Worker(String nombre, double dinero)
    {
        workerName = nombre;
        salary = dinero;
    }
    
    public String getName()
    {
        return workerName;
    }
    
    public void setHours(int time)
    {
        workHours = time;
    }
    
    public double getHours()
    {
        return workHours;
    }
    
    public double computePay()
    {
        return salary*getHours();
    }
}
