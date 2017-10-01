import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class SearchBin
{
    public int[] num;
    public SearchBin(int arraySize)
    {
        num = new int[arraySize];
        fillArray();
    }

    public void fillArray()
    {
        Random fill = new Random();
        for(int i = 0; i < num.length; i++)
        {
            num[i] = fill.nextInt(99)+1;
        }
    }

    public void sort()
    {
        int temp;
        for(int i = 1;i<num.length;i++)
        {
            for(int j = 1; j < num.length; j++)
            {
                if(num[j] < num[j-1])
                {
                    temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                }
            }
        }
    }

    public void Linear(int numberToFind)
    {
        int temp;
        int comparison = 1;
        boolean found = false;
        for(int i = 0; i < num.length; i++)
        {
            if(num[i] == numberToFind)
            {
                found = true;
                break;
            }
            else
            {
                comparison++;
            }
        }
        if(found == true)
        {
            System.out.println("Found.");
            System.out.println("Comparisons done: " + comparison);

        }
        if(found == false)
        {
            System.out.println("Not found.");
            System.out.println("Comparisons done: " + (comparison-1));
        }
    }

    public void Binary(int numberToFind)
    {
        int start = 0;
        int end = num.length - 1;
        boolean found = false;
        int comparison = 0;
        while(start <= end)
        {
            int mid = (start + end) / 2;
            if(numberToFind == num[mid])
            {
                comparison++;
                found = true;
                break;
            }
            if(numberToFind < num[mid])
            {
                end = mid - 1;
                comparison++;
            }
            else
            {
                start = mid + 1;
                comparison++;
            }
        }

        if(found == true)
        {
            System.out.println("Found.");
            System.out.println("Comparisons done: " + comparison);
        }
        if(found == false)
        {
            System.out.println("Not found.");
            System.out.println("Comparisons done: " + comparison);
        }
    }

    public static void main(String[] args)
    {
        boolean cont = true;
        while(cont == true)
        {
            System.out.println("How large is your array?");
            Scanner input = new Scanner(System.in);
            int arraySize = input.nextInt();
            SearchBin a = new SearchBin(arraySize);
            System.out.println("Unsorted Array");
            System.out.println(Arrays.toString(a.num));
            a.sort();
            System.out.println("Sorted Array");
            System.out.println(Arrays.toString(a.num));
            System.out.println("What number to find?");
            int numberToFind = input.nextInt();
            System.out.println("Press 1 for linear search, and 2 for binary.");
            int choice = input.nextInt();
            if(choice == 1)
            {
                a.Linear(numberToFind);
            }
            if(choice == 2)
            {
                a.Binary(numberToFind);
            }
            System.out.println("Do you want to run this program again?(y/n)" );
            Scanner input2 = new Scanner(System.in);
            String answer = input2.nextLine();
            if(!answer.equals("y"))
            cont = false;
        }
    }
}
