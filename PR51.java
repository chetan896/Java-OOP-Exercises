import java.util.*;

public class PR51
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        double avg = S.nextDouble();

        Result r = new Result();
        System.out.println("Division: "+ r.getDivision(avg));

        S.close();
    }
}

interface Classify
{
    String getDivision(double average);
}

class Result implements Classify
{
    public String getDivision(double average)
    {
        if (average >= 60) 
        {
            return "First Division";
        } 
        else if (average >= 50) 
        {
            return "Second Division";
        } 
        else if (average >= 35) 
        {
            return "Pass";
        } 
        else 
        {
            return "Fail";
        }
    }
}