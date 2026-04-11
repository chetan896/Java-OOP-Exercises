package exam;

import java.util.Scanner;
import student.Student;

public class Result extends Student
{
    int marks1;
    int marks2;
    int marks3;

    public Result(int rollNo, String name, int m1, int m2, int m3)
    {
        super(rollNo, name);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    public void displayResult()
    {
        displayStudent();
        int total = marks1 + marks2 + marks3;
        double avg = total / 3.0;

        System.out.println("Marks 1: "+ marks1);
        System.out.println("Marks 2: "+ marks2);
        System.out.println("Marks 3: "+ marks3);
        System.out.println("Total: "+ total);
        System.out.println("Average: "+ avg);
    }

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