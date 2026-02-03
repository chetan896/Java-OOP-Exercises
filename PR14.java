import java.util.*;

public class Practical04 {
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = S.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = S.nextDouble();

        double kgs = pounds * 0.45359237;
        double meters = inches * 0.0254;

        double bmi = kgs / (meters * meters);

        System.out.println("Body Mass Index is "+ bmi);

        S.close();
    }
}