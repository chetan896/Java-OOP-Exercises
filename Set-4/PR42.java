import java.util.*;

public class PR42
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);

        System.out.println("=== Savings Account ===");
        System.out.print("Enter Account Number: ");
        int savAccNo = S.nextInt();
        S.nextLine();
        System.out.print("Enter Name: ");
        String savName = S.nextLine();
        System.out.print("Enter Balance: ");
        double savBal = S.nextDouble();

        SavingAccount sa = new SavingAccount();
        sa.openAccount(savAccNo, savName, savBal);

        System.out.print("Enter Interest Rate (%): ");
        double rate = S.nextDouble();
        System.out.print("Enter Time (years): ");
        int time = S.nextInt();
        System.out.println("Interest: "+ sa.calculateInterest(rate, time));
        sa.checkBalance();

        System.out.println("\n=== Fixed Deposit Account ===");
        System.out.print("Enter Account Number: ");
        int fdAccNo = S.nextInt();
        S.nextLine();
        System.out.print("Enter Name: ");
        String fdName = S.nextLine();
        System.out.print("Enter Principal Amount: ");
        double fdBal = S.nextDouble();
        System.out.print("Enter Term (years): ");
        int term = S.nextInt();
        System.out.print("Enter FD Interest Rate (%): ");
        double fdRate = S.nextDouble();

        FixedDepositAccount fa = new FixedDepositAccount();
        fa.openAccount(fdAccNo, fdName, fdBal);
        System.out.println("Maturity Amount: "+ fa.maturityAmount(fdRate, term));
        fa.checkBalance();

        S.close();
    }
}

class BankAccount
{
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal)
    {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
        System.out.println("Account Opened Successfully.");
    }

    void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited: "+ amount);
    }

    void withdraw(double amount)
    {
        if (balance >= amount) 
        {
            balance -= amount;
            System.out.println("Withdrawn: "+ amount);
        } 
        else
        {
            System.out.println("Insufficient Balance.");
        }
    }

    void checkBalance()
    {
        System.out.println("Current Balance: "+ balance);
    }
}

class SavingAccount extends BankAccount
{
    double calculateInterest(double rate, int time)
    {
        return (balance * rate * time) / 100;
    }
}

class FixedDepositAccount extends BankAccount
{
    double maturityAmount(double rate, int time)
    {
        return balance * Math.pow((1 + rate / 100), time);
    }
}