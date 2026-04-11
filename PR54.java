import java.util.*;
import exam.Result;

public class PR54
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int r = S.nextInt();
        S.nextLine();
        System.out.print("Enter Name: ");
        String n = S.nextLine();
        System.out.print("Enter Marks 1: ");
        int m1 = S.nextInt();
        System.out.print("Enter Marks 2: ");
        int m2 = S.nextInt();
        System.out.print("Enter Marks 3: ");
        int m3 = S.nextInt();

        Result res = new Result(r, n, m1, m2, m3);
        System.out.println("\n--- Mark Sheet ---");
        res.displayResult();

        S.close();
    }
}