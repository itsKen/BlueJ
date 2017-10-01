/**
 * A seat on an airplane.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seat
{
    private int row;
    private String section;
    private boolean vacancy;
    private Passenger passenger;
    private boolean windowView; 
    private boolean firstClass; //first class = 1, economomy class = 0;

    /**
     *Initializes row and section, makes a new passenger, and sets vacancy first class and windowview to true
     */
    public Seat(String aSection, int aRow)
    {
        row = aRow;
        section = aSection;
        vacancy = true;
        passenger = new Passenger("John", "Doe");
        firstClass = true;  //temporarily assumes to be first class
        windowView = true;  //temporarily initializes as window view
    }
    /**
     * returns row
     * (Postcondition: getRow <= 0)
     * @returns row
     * (Precondition: row <= 0)
     */
    public int getRow()
    {
        return row;
    }
    /**
     * sets the windowView
     * @param status the status of window view
     */
    //status = true if window seat, else false
    public void setWindowView(boolean status)
    {
        windowView = status;
    }
    /**
     * returns the window view
     * @returns the window view
     */
    public boolean getWindowViewStatus()
    {
        return windowView;
    }
    /**
     * sets the first class
     * @param status status of the firstclass
     */
    //status = true if first class
    public void setSeatClass(boolean status)
    {
        firstClass = status;
    }
    /**
     * returns first class 
     * @returns firstClass
     */
    public boolean getSeatClass()
    {
        return firstClass;
    }
        /**
         * returns the section
         * @returns section
         */
    public String getSeatSection()
    {
        return section;
    }
    /**
     * sets the section of the seat
     * @param s the section
     */
    public void setSeatSection(String s)
    {
        section = s;
    }
    /**
     * sets the vacancy
     * @param status the status of the vacancy
     */
    //status = true if seat is available
    public void setVacancy(boolean status)
    {
        vacancy = status;
    }
    /**
     * sets the passenger
     * @param p the passenger
     */
    public void setPassenger(Passenger p){
    passenger = p;
    }
    /**
     * returns the passenger
     * @returns passenger
     */
    public Passenger getPassenger(){
    return passenger;
    }
    /**
     * assigns the passenger to a seat
     * @param p the passenger
     */
    public void assignPassenger(Passenger p)
    {
        
        passenger = p;
    }
    /**
     * returns vacancy
     * @returns vacancy
     */
    public boolean getVacancy(){
    return vacancy;
    }
    /**
     * sets the vacancy to true and nulls the passenger
     */
    public void clearSeat(){
    vacancy = true;
    passenger = null;
    }
}
    
    