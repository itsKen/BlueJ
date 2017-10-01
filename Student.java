
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Student
{
    private String studentName;
    private int totScore;
    private int numOfQuizzes;
    
    public Student(String name)
    {
        studentName = name;
        totScore = 0;
        numOfQuizzes = 0;
    }
    
    public String getName()
    {
        return studentName;
    }
    
    public void addQuiz(int score)
    {
        totScore = totScore + score;
        numOfQuizzes++;
    }
    
    public int getTotalScore()
    {
        return totScore;
    }
    
    public double getAverageScore()
    {
        return totScore/numOfQuizzes;
    }
}
