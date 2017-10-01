
/**
 * Write a description of class StudentTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class StudentTester
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the student's name?: ");
        String studentName = input.nextLine();
        Student student = new Student(studentName);
        
        
        System.out.println("Student: " + student.getName());
        System.out.println("Total Quiz Score: " + student.getTotalScore());
        System.out.println("Average Quiz Score: " + student.getAverageScore());
    }
}
