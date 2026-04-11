import java.util.*;

public class PR23
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);

        Point p1 = new Point();
        System.out.print("Point 1 (Default): ");
        p1.display();

        System.out.println("Enter coordinates for Point 2:");
        System.out.print("x: ");
        double x = S.nextDouble();
        System.out.print("y: ");
        double y = S.nextDouble();

        Point p2 = new Point(x, y);
        System.out.print("Point 2 (Parameterized): ");
        p2.display();

        Point p3 = new Point(p2);
        System.out.print("Point 3 (Copy of P2): ");
        p3.display();

        S.close();
    }
}

class Point
{
    double x;
    double y;

    Point()
    {
        this.x = 5;
        this.y = 5;
    }

    Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    Point(Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }

    void display()
    {
        System.out.println("("+ x +", "+ y +")");
    }
}