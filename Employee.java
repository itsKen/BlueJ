
/**
 * Contains information about an employee
 * 
 * @author (Lucy) 
 * @version (6/6/06)
 */
public class Employee
{
    private String name;
    private double hoursWorked;
    private double wage;
    
    /*
     * Create an employee with given name and wage.Initializes hoursWorked to 0.
     * 
     */
    public Employee(String aName, double aWage)
    {
       name=aName;
       wage=aWage;
       hoursWorked=0;
    }
    
    /*
     * Set working hours.
     */
    public void setHours(double hours)
    {
        hoursWorked=hours;
    }
    
    /*
     * Retrieves the total numbers of hours worked.
     */
    public double getHours()
    {
       return hoursWorked;
    }
    
    /*
     * Sets new wage.
     */
    public void setWage(double aWage)
    {
        wage=aWage;
    }
    
    /*
     * Returns employee name.
     */
    public String getName()
    {
       return name;
    }
    
    /*
     * Returns employee wage (pay per hour).
     */
    public double getWage()
    {
       return wage;
    }
    
    
}

