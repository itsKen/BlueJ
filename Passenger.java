/**
 * A passenger on airplane
 * 
 * @author (Luc) 
 * @version (a version number or a date)
 */
public class Passenger
{
    private String fName, lName; //first and last name
    
    /**
     * Initializes the First and last name
     */
    public Passenger(String first, String last)
    {
        fName = first;
        lName = last;
       
    }
    /**
     * returns the full name
     * @returns full name
     */
    public String getFullName()
    {
        return fName + " " + lName;
    }
    /**
     * returns first name
     * @returns first name
     */
    public String getFirstName()
    {
        return fName;
    }
    /**
     * returns last name
     * @returns last name
     */
    public String getLastName()
    {
        return lName;
    }
}
    
    
    
    
    
    
    

