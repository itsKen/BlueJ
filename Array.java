
/**
 * Write a description of class Array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Array
{
      public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows? ");
        int row = input.nextInt();
        System.out.print("How many columns? ");
        int column = input.nextInt();
      
        int[][] matrix = new int[row][column];
        
        //Enter the matrix 
         for (int i = 0; i < row; i++)
        {
            System.out.println("Enter " + column + " values in row " + i);
            for (int j = 0; j < column; j++)
            {
            matrix[i][j]=input.nextInt();
         }
    }
        //Display matrix
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}
}

