/**
 * Write a description of class SavingsAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SavingsAccount extends BankAccount
{
    private final double interestRate = 0.01;


    public SavingsAccount(double newAmount)
    {  
        super(newAmount);
    }


    public void addInterest() 
    {  
        deposit(getBalance() * interestRate);  
    }
}
