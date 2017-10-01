/**
 * Write a description of class TimeDepositAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeDepositAccount extends BankAccount
{
    private static double earlyWithdrawal = 10;  
    private final double interestRatee;
    private int monthsToMaturity;

    /**
     * Creates a time deposit account with a given balance, maturity, and interest rate.
     * (Postcondition: None)
     * @param newAmount the balance of the account input by the user
     * @param maturity the months to maturity of the account input by the user
     * @param interestRate the interest rate of the account input by the user
     * (Precondition: None)
     */
    public TimeDepositAccount(double newAmount, int maturity, double interestRate)
    {  
        super(newAmount);
        monthsToMaturity = maturity;
        interestRatee = interestRate;
    }

    /**
     * Withdraws money from the account
     * (Postcondition: balance > 0)
     * (Precondition: month > 0)
     */
    public void withdraw(double amount)
    {  
        if (monthsToMaturity > 0 && (amount + earlyWithdrawal < balance)) {
            balance = balance - amount - earlyWithdrawal;
        }
        else if (monthsToMaturity > 0 && (amount + earlyWithdrawal > balance)) {
            System.out.println("Cannot withdraw, please choose another option");
        }
        else if (monthsToMaturity <= 0 && (amount < balance)) {
            balance = balance - amount;
        }
        else if (monthsToMaturity <= 0 && (amount > balance)) {
            System.out.println("Cannot withdraw, please choose another option");
        }
    }

    /**
     * Add interest to the account at the end of a month
     * (Postcondiiton: balance > 0)
     * (Precondition: months > 0)
     */
    public void addInterest()
    {  
        deposit(getBalance() * interestRatee);
        monthsToMaturity--; 
    }
}
