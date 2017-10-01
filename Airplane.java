/**
* Write a description of class Airplane here.
*
** @author (your name)?
* @version (a version number or a date)
*/
import java.util.*;
public class Airplane
{
 private final int ROW = 13; //ROW 1 - 12
 private final int SECTION = 5; //SEAT A - D
 private Seat[][] seats;
 private int numberOfSeats = 48;
 public Airplane()
 {
 seats = new Seat[SECTION][ROW];
 initializeSeats();
 }

 /**
 * Initializes the seats
 */
 public void initializeSeats()
 {
 for (int j = 1; j < ROW; j++)
 {
 boolean firstClass = true;
if (j > 4)
 firstClass = false;
 for (int i = 1; i < SECTION; i++)
 {
 String section = "E";
 boolean windowView = true;
 if (i == 1)
 section = "A";
 else if (i == 2)
 {
 section = "B";
 windowView =false;
}
 else if (i == 3)
{
 section = "C";
  windowView = false;
 }
 else
 section = "D";
 Seat temp = new Seat(section,j);
 temp.setWindowView(windowView);
 //temp.setSeatSection(section);
 temp.setSeatClass(firstClass);
 seats[i][j] = temp;
 }
 }
}
/**
 * Randomly assigns passengers
 * @param p the passnger
 */
 public void assignS(Passenger p){
 Random a = new Random();
 boolean Trust = true;
 while(Trust == true){
 int section = a.nextInt(SECTION - 1) +1;
 int row = a.nextInt(ROW - 1) + 1;
 if(seats[section][row].getVacancy() == true){
 seats[section][row].setVacancy(false);
 seats[section][row].assignPassenger(p);
 }
 }
 }
/**
 * checks if the section is a window section
 * @param j the section
 */ 
 public boolean windowChecker(String j)
 {
 if(j.equals("A")||j.equals("D"))
 {
 return true;
 }
 return false;
}
 /**
  * Converts all the sections to numbers
  * @param j the sectioin
  */
public int converter(String j){

 if(j.equals("A"))
 {
 return 1;
 }
else if (j.equals("B"))
{
 return 2;
 }
 else if(j.equals("C"))
 {
 return 3;
 }
 else if(j.equals("D"))
 {
 return 4;
 }
 else if(j.equals("E"))
{
 return 5;
 }
 else if(j.equals("F"))
 {
 return 6;
 }
 else if(j.equals("G"))
 {
 return 7;
 }
 else
 {
 return 8;
 }
}
/**
 * Reserves a seat for the passenger
 * @param section the section
 * @param row the row
 * @param bob The passenger
 * (Precondition:row >= 0)
 */  
  public void Reserve(String section, int row, Passenger bob)
 { 
 seats[converter(section)][row].setVacancy(false);
 seats[converter(section)][row].setPassenger(bob);
 if(section.equalsIgnoreCase("B") || section.equalsIgnoreCase("C"))
 {
 seats[converter(section)][row].setWindowView(false);
 }

}
/**
 * Asks the user thier preference of reservation
 */
public void Preference(){
 Scanner input = new Scanner(System.in);
 System.out.println("To Sit in First Class Press 1");
 System.out.println("To Sit in a Window Seat Press 2");
 System.out.println("To Sit in Both First Class and a Window Seat Press 3");
 int p = input.nextInt();
 if(p == 1){
 P1();
 }
 else if(p == 2){
 P2();
}
 else if (p == 3){
     P3();
}
 }
/**
 * Seats a passenger in the first 4 rows
 */
 public void P1(){
 Scanner input = new Scanner(System.in);
 System.out.println("What row do you want to sit in?" );
 int row = Integer.parseInt(input.nextLine());
 System.out.println("What section do you want to sit in?");
 String section = input.nextLine();
 if(checkAvail(section, row) == true && row <= 4)
  {
 System.out.println("Enter first name: ");
 String fName = input.nextLine();
System.out.println("Enter last name: ");
 String lName = input.nextLine();
 Passenger bob = new Passenger(fName, lName);
 Reserve(section, row, bob);
 printSeats();
 }
else{
 System.out.println("Sorry, Not Availible");

 DisplayMenu();
 }
 DisplayMenu();
}
/**
 * seats the passenger in a window seat
 */
 public void P2(){
 Scanner input = new Scanner(System.in);
 System.out.println("What row do you want to sit in?" );
 int row = Integer.parseInt(input.nextLine());
 System.out.println("What section do you want to sit in?");
String section = input.nextLine();
 if(checkAvail(section, row) == true && (section.equalsIgnoreCase("A") || section.equalsIgnoreCase("D")))
{
 System.out.println("Enter first name: ");
 String fName = input.nextLine();
 System.out.println("Enter last name: ");
 String lName = input.nextLine();
 Passenger bob = new Passenger(fName, lName);
 Reserve(section, row, bob);
 printSeats();
}
 else{
 System.out.println("Sorry, Not Availible");
 DisplayMenu();
 }
 DisplayMenu();
 }
 /**
  * seats the passenger in a window and firstclass(the first 4 rows) seat
  */
 public void P3(){
 Scanner input = new Scanner(System.in);
 System.out.println("What row do you want to sit in?" );
 int row = Integer.parseInt(input.nextLine());
 System.out.println("What section do you want to sit in?");
 String section = input.nextLine();
 if(checkAvail(section, row) == true && (section.equalsIgnoreCase("A") || section.equalsIgnoreCase("D")) && row <= 4)
 {
 System.out.println("Enter first name: ");
 String fName = input.nextLine();
 System.out.println("Enter last name: ");
 String lName = input.nextLine();
 Passenger bob = new Passenger(fName, lName);
 Reserve(section, row, bob);
 printSeats();
 }
 else{
 System.out.println("Sorry, Not Availible");
 DisplayMenu();
 }
 DisplayMenu();
}
/**
 * seats the passenger in a nonpreferential seat
 */ 
public void NoPref(){
 Scanner input = new Scanner(System.in);
System.out.println("What row do you want to sit in?" );
 int row = Integer.parseInt(input.nextLine());
 System.out.println("What section do you want to sit in?");
 String section = input.nextLine();
 if(checkAvail(section, row) == true)
 {
 System.out.println("Enter first name: ");
 String fName = input.nextLine();
 System.out.println("Enter last name: ");
 String lName = input.nextLine();
 Passenger bob = new Passenger(fName, lName);
 Reserve(section, row, bob);
 printSeats();
 }
 else{
 System.out.println("Sorry, that seat is already taken. ");
 DisplayMenu();
 }
 DisplayMenu();
 }
 /**
  * randomly fills up the seats
  * @param numberOfSeats the number of seats
  * (Precondition: numberOfSeats <= 0)
  */
 public void randomFill(int numberOfSeats)
 {
 Scanner input = new Scanner (System.in);
 Random generator = new Random();
 int counter = 0;
 String first = "Unknown";
 String last = "Assilant";
 Passenger p = new Passenger(first,last);
 while (counter < numberOfSeats)
 {
 int section = generator.nextInt(4) + 1;
 int row = generator.nextInt(12) + 1;
 if (seats[section][row].getVacancy() == true)
 {
 seats[section][row].setVacancy(false);
 seats[section][row].assignPassenger(p);
 counter++;
 }
 }
 }
 /**
  * checks the vacacncy of the seats
  * @param section the section
  * @param row the row
  * (Precondition: row <= 0)
  */
 public boolean checkAvail(String section, int row)
 {
 return (seats[converter(section)][row].getVacancy());
 }
 /**
  * Prints the seats
  */
 public void printSeats()
 {
 for (int j = 1; j < SECTION; j++)
 {
 for (int i = 1; i < ROW; i++)
 {
 if (seats[j][i].getVacancy() == true)
 System.out.print("[" + "] ");
 else
 System.out.print("[X" + "] ");
 }
 System.out.println();
 }
  }
 /**
  * Seats a group of passenger
  */
  public void GroupSeat(){
 Scanner input = new Scanner(System.in);

System.out.println("The Number of People in the Group: ");
int GroupSize = input.nextInt();
for (int j = 1; j < SECTION; j++)
 {
 for (int i = 1; i < ROW; i++)
 {
if(GS1(i, j, GroupSize) == true){
 GS2(j,i,GroupSize);
 } 
 }
}
DisplayMenu();
}
/**
 * checks if the group of seats is availible
 * (Postcondition: GS1 == true)
 * @param groupsize the group size
 * @param row the row
 * @param section the section
 * (Precondition: groupsize >= 0, row >= 0)
 */
public boolean GS1(int groupsize, int row, int section){
int a = row;
 int b = section;
 while(groupsize >= 0){
 if(seats[b][a].getVacancy() == false)
    return false;
    
     else{
         b++;
         groupsize--;
         if(b == SECTION){
             b = 1;
             a++;
            }
 }

}
return true;
}
/**
 * groups the passengers
 * @param groupsize the group size
 * @param row the row
 * @param section the section
 * (Precondition: groupsize >=0, row >= 0, section >= 0)
 */
 public void GS2(int groupsize, int row, int section){
Scanner input = new Scanner(System.in);
 int j = section;
 int i = row;
 
System.out.println("Enter Passenger First Name");
String first = input.nextLine();
System.out.println("Enter Passenger Last Name");
String last = input.nextLine();

 while(groupsize > 0){
     if(seats[j][i].getVacancy() == true){
   
   Passenger p = new Passenger(first, last);
   seats[section][row].setVacancy(false);
 seats[section][row].assignPassenger(p);
 }
else{
         j++;
         groupsize--;
         if(j == SECTION){
             j = 1;
             i++;
            }
           
 } 
}
 }




/**
 * Prints the passenger names and they have window view, first class, economy class, or aisle
 */ 
 public void PrintPassenger(){
 for (int j = 1; j < SECTION; j++)
 {
 for (int i = 1; i < ROW; i++)
 {
if (seats[j][i].getVacancy() == false){
 if(seats[j][i].getWindowViewStatus() == true && seats[j][i].getRow() <= 4){
 System.out.println("Passenger : "+seats[j][i].getPassenger().getFullName()+"");
System.out.println("Section : "+seats[j][i].getSeatSection()+"");
 System.out.println("Row : "+seats[j][i].getRow()+"");
 System.out.println("Has Window View and First Class");
 System.out.println();
}
 else if(seats[j][i].getWindowViewStatus() == false && seats[j][i].getRow() <= 4){
System.out.println("Passenger : "+seats[j][i].getPassenger().getFullName()+"");
 System.out.println("Section : "+seats[j][i].getSeatSection()+"");
System.out.println("Row : "+seats[j][i].getRow()+"");
 System.out.println("Has Aisle View and First Class");
 System.out.println();
} 
else if(seats[j][i].getWindowViewStatus() == true && seats[j][i].getRow() > 4){
System.out.println("Passenger : "+seats[j][i].getPassenger().getFullName()+"");
System.out.println("Section : "+seats[j][i].getSeatSection()+"");
System.out.println("Row : "+seats[j][i].getRow()+"");
System.out.println("Has Window View and Economy Class");
System.out.println();
}
 else {
 System.out.println("Passenger : "+seats[j][i].getPassenger().getFullName()+"");
 System.out.println("Section : "+seats[j][i].getSeatSection()+"");
 System.out.println("Row : "+seats[j][i].getRow()+"");
 System.out.println("Has Aisle view and Economy Class");
 System.out.println();
 }
}
else{
} 
 }
 }
 DisplayMenu();
 }
/**
 * Asks the User the name of the passenger they will like to remove
 */
 public void remove1(){
Scanner input = new Scanner(System.in);
 System.out.println("Enter First Name");
 String First = input.nextLine();
 System.out.println("Enter Last Name");
 String Last = input.nextLine();
 Passenger a = new Passenger(First, Last);
 remove2(a);
 DisplayMenu();
}
/**
 * Removes the passenger
 * @param p the passenger
 */
 public void remove2(Passenger p){
 for (int j = 1; j < SECTION; j++)
 {
     for (int i = 1; i < ROW; i++)
     {
         if (seats[j][i].getVacancy() == false){
             if(seats[j][i].getPassenger().getFullName().equalsIgnoreCase(p.getFullName())){
                 seats[j][i].clearSeat();
                 return;
                }
            }

 }
 }
}
/**
 * Display Menu for the User to use
 */ 
public void DisplayMenu(){
 Scanner input = new Scanner(System.in);
 System.out.println("Welcome to the Airplane, what would you like to do?");
 System.out.println("To Reserve a Seat with no preference, Press 1");
 System.out.println("To Reserve a Seat with preference, Press 2");
 System.out.println("To Reserve a Group, Press 3");
 System.out.println("To Cancel a reservation, Press 4");
 System.out.println("To Print the names of all the passengers, Press 5");
System.out.println("To Print out the Seats Press 6");
 System.out.println("To Exit out of this Press any key");
int a = input.nextInt();

 if(a == 1){
 NoPref();
 }
   
         
 else if(a == 2){
Preference();
}
else if(a == 3){
GroupSeat();
 }

 else if(a == 4){ 
 remove1();
}
else if(a == 5){
 PrintPassenger();
 } 
else if(a == 6){
 printSeats();
 DisplayMenu();
 }
}


/**
 * Prints out the seats, display menu, and randomly fill
 */
public static void main(String[] args){
 Airplane crash = new Airplane();
crash.randomFill(0);
 crash.printSeats();
 crash.DisplayMenu();

}



} 