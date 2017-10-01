
/**
 * Array program that adds & subtracts two matrices
 * Walton Ma & Kenneth Nguyen
 * 23 September 2016
 */
import java.util.Scanner;
public class Level2AddSubtract
{
    public static void main(String[] args)
    {
        boolean cont = true;
        while (cont == true)
        {
        System.out.println("Add or subtract (a/s)? ");
        Scanner input2 = new Scanner (System.in);
        String addSubtract = input2.nextLine();
       
        Scanner input = new Scanner (System.in);
        System.out.print("How many rows? ");
        int row = input.nextInt();
        System.out.print("How many columns? ");
        int column = input.nextInt();
 
        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        
                //enter matrix1
        for ( int i = 0; i < row; i++ )
        {
            System.out.println("Enter " + column + " values in row " + i + " of first matix");
            for ( int j = 0; j < column; j++ )
            {
                matrix1[i][j] = input.nextInt();
            }
            
        }
            //Display matrix1
        System.out.println("First matrix: ");
        int[][] firstMatrix = matrix1;
        for ( int i = 0; i < row; i++ )
        {
            for ( int j = 0; j < column; j++ )
            {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
        
              //enter matrix2
        for ( int i = 0; i < row; i++ )
        {
            System.out.println("Enter " + column + " values in row " + i + " of second matix");
            for ( int j = 0; j < column; j++ )
            {
                matrix2[i][j] = input.nextInt();
            }
                
        }
            //Display matrix2
        System.out.println("Second matrix: ");
        int[][] secondMatrix = matrix2;
        for ( int i = 0; i < row; i++ )
        {
            for ( int j = 0; j < column; j++ )
            {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
        
        //final matrix
        int[][] result = new int[row][column];
        if ( addSubtract.equals("a") )
        {
            for ( int i = 0; i < row; i++ )
            {
                for ( int j = 0; j < column; j++ )
                {
                    result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                }
       
            }
        } 
        else if ( addSubtract.equals("s") )
        {
            for ( int i = 0; i < row; i++ )
            {
                for ( int j = 0; j < column; j++ )
                {
                    result[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
                }
            
            }
        }
        //Display final matrix
        
        System.out.println("Resulting matrix: "); 
        for ( int i = 0; i < row; i++) 
        {
            for( int j = 0; j < column; j++ )
            {
               System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
           System.out.println();
        //asks the user whether to continue or not)
        
            System.out.print("Continue (y/n)? ");
            Scanner input3 = new Scanner (System.in);
            String userInput = input3.nextLine();
            if (!userInput.equals("y"))
                cont = false;
            
        
        
        
    
}
}
}
