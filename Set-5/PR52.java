import java.util.*;

public class PR52
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = S.nextInt();

        Result r = new Result();
        if (r.isPassed(marks)) 
        {
            System.out.println("Status: Passed");
            System.out.println("Division: "+ r.getDivision(marks));
        } 
        else 
        {
            System.out.println("Status: Failed");
            System.out.println("Division: No Division");
        }

        S.close();
    }
}

interface Exam
{
    boolean isPassed(int mark);
}

interface Classify
{
    String getDivision(double average);
}

class Result implements Exam, Classify
{
    public boolean isPassed(int mark)
    {
        return mark >= 35;
    }

    public String getDivision(double average)
    {
        if (average >= 60)
            return "First Division";
        else if (average >= 50)
            return "Second Division";
        else if (average >= 35)
            return "Pass";
        else
            return "Fail";
    }
}