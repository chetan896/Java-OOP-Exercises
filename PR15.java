import java.util.*;

public class PR15
 {
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangle:");
        System.out.print("Side a: ");
        double a = S.nextDouble();
        System.out.println("Side b: ");
        double b = S.nextDouble();
        System.out.println("Side c: ");
        double c = S.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a))
         {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("The area of the triangle is "+area);
        } 
        else
        {
            System.out.println("Invalid input");
        }

        S.close();
    }
}