
/**
 * Write a description of class KFC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class KFC
{
    private ArrayList<Employee> employees;   //list of employees in payroll.
    
    
    public KFC()
    {
       employees = new ArrayList <Employee>();
        
    }
    
    
    public void addEmployee(Employee e)
    {
        employees.add(e);
    }
    
    
    public void raiseForAll(double increase)
    {
        for(int i=0;i<employees.size();i++)
        {
            employees.get(i).setWage(employees.get(i).getWage()+increase);
        }
    }
    
    
    public void raiseIndividually(String name, double increase)
    {
        if(findEmployeeIndex(name)!=-1)
        {
            employees.get(findEmployeeIndex(name)).setWage(employees.get(findEmployeeIndex(name)).getWage()+increase);
        }
        else
        {
            System.out.println("Could not find employee with given name");
        }
    }
    
    
    public void remove(String name)
    {
        if(findEmployeeIndex(name)!=-1)
        {
            employees.remove(findEmployeeIndex(name));
        }   
        else
        {
            System.out.println("Could not find employee with given name");
        }
    }
    
   
    private int findEmployeeIndex(String name)
    {
        for(int i=0;i<employees.size();i++)
        {
            if(employees.get(i).getName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }
    
    
    public void printPayroll()
    {
        double money = 0;
        for (int i = 0; i < employees.size();i++)
        {
            if (employees.get(i).getHours() >= 40)
            {
                 money = (employees.get(i).getHours() - 40) * 1.5 * employees.get(i).getWage() + 40*employees.get(i).getWage();
                
            }
            else
            {
                 money = employees.get(i).getHours() * employees.get(i).getWage();
            }   
            System.out.println(employees.get(i).getName() + " worked " + employees.get(i).getHours() + " hours and earned " + money + " dollars.");
        
        }
    }  
}