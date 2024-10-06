class WithdrawalException extends Exception 
{
    public WithdrawalException(String message) 
    {
        super(message);
    }
}

class BankAccount 
{
    private double balance;

    public BankAccount(double balance) 
    {
        this.balance = balance;
    }

    public void withdraw(double amount) throws WithdrawalException 
    {
        if (amount > balance) 
        {
            throw new WithdrawalException("Withdrawal amount exceeds the account balance.");
        } else 
        {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        }
    }
}

public class Bankingapplication 
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount(1000);

        try 
        {
            account.withdraw(1500);
        } catch (WithdrawalException e) 
        {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(500);
        } catch (WithdrawalException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
