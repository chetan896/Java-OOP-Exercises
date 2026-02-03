import java.util.*;

public class PR12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficients of a, b, c, d, e, f for the equations:");
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");

        System.out.println("Enter a:- ");
        double a = scanner.nextDouble();
        System.out.println("Enter b:- ");
        double b = scanner.nextDouble();
        System.out.println("Enter c:- ");
        double c = scanner.nextDouble();
        System.out.println("Enter d:- ");
        double d = scanner.nextDouble();
        System.out.println("Enter e:- ");
        double e = scanner.nextDouble();
        System.out.println("Enter f:- ");
        double f = scanner.nextDouble();

        double determinant = (a * d) - (b * c);

        if (determinant == 0) {
            System.out.println("The equation has no unique solution.");
        } else {
            double x = ((e * d) - (b * f)) / determinant;
            double y = ((a * f) - (c * e)) / determinant;

            System.out.println("x = "+ x);
            System.out.println("y = "+ y);
        }

        scanner.close();
    }
}