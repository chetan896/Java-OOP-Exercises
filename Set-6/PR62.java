import java.util.*;

public class PR62
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);

        VotingApp v = new VotingApp();

        System.out.print("Enter Age: ");
        int age = S.nextInt();

        try
        {
            v.checkEligibility(age);
            System.out.println("Eligible to vote.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Validation process completed");
        }

        S.close();
    }
}

class VotingApp
{
    void checkEligibility(int age)
    {
        if (age < 18)
        {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        }
    }
}