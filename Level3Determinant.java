
/**
 * Array project that takes determinant of one matrix
 * Walton Ma & Kenneth Nguyen Period 5
 * 23 September 2016
 */
import java.util.Scanner;
public class Level3Determinant
{
    public static void main(String[] args)
    {
        boolean cont = true;
        while (cont == true)
        {
            System.out.print("Find the determinant of a 2x2 or 3x3 matrix (two/three)? ");
            Scanner input = new Scanner (System.in);
            String matSize = input.nextLine();
            
            int[][] b = new int[2][2];
            int[][] a = new int[3][3];
            if (matSize.equals("two"))
            {
             for (int i = 0; i < 2; i++ )
             {
                 System.out.println("Enter two values in row " + i + " of the matrix");
                 for ( int j = 0; j < 2; j++ )
                 {
                     b[i][j] = input.nextInt();
                 }
             }
             
             System.out.println("Your matrix: ");
             for ( int i = 0; i < 2; i++ )
             {
                 for ( int j = 0; j < 2; j++ )
                 {
                     System.out.print(b[i][j] + " ");
                 }
                 System.out.println();
                }
            
             int determinant = b[0][0]*b[1][1] - b[1][0]*b[0][1];
             System.out.println("The determinant is: " + determinant);
            }
            else if (matSize.equals("three"))
            {
               for (int i = 0; i < 3; i++ )
             {
                 System.out.println("Enter three values in row " + i + " of the matrix");
                 for ( int j = 0; j < 3; j++ )
                 {
                     a[i][j] = input.nextInt();
                 }
             }  
             
             System.out.println("Your matrix: ");
             for (int i = 0; i < 3; i++)
              {
                 for (int j = 0; j < 3; j++)
                  {
                      System.out.print(a[i][j] + " ");
                  }
                 System.out.println();
              }
              
              int determinant = ((a[0][0]*a[1][1]*a[2][2] + a[0][1]*a[1][2]*a[2][0] + a[0][2]*a[1][0]*a[2][1]) - (a[2][0]*a[1][1]*a[0][2] + a[2][1]*a[1][2]*a[0][0] + a[2][2]*a[1][0]*a[0][1]));             
              System.out.println("The determinant is: " + determinant);
            }
 
              System.out.print("Continue (y/n)? ");
              Scanner input2 = new Scanner (System.in);
              String userInput = input2.nextLine();
              if (!userInput.equals("y"))
              {
                cont = false;
              }
 
        }
    }
}

