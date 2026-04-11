import java.util.*;

public class PR33
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);

        VolumeCalculator calc = new VolumeCalculator();

        System.out.print("Enter side of Cube: ");
        double cubeSide = S.nextDouble();
        System.out.println("Volume of Cube: "+ calc.calculateVolume(cubeSide));

        System.out.println("\nEnter dimensions for Rectangular Cube:");
        System.out.print("Length: ");
        double l = S.nextDouble();
        System.out.print("Width: ");
        double w = S.nextDouble();
        System.out.print("Height: ");
        double h = S.nextDouble();
        System.out.println("Volume of Rectangular Cube: "+ calc.calculateVolume(l, w, h));

        System.out.print("\nEnter radius of Sphere: ");
        float r = S.nextFloat();
        System.out.println("Volume of Sphere: "+ calc.calculateVolume(r));

        S.close();
    }
}

class VolumeCalculator
{
    public double calculateVolume(double side)
    {
        return side * side * side;
    }

    public double calculateVolume(double length, double width, double height)
    {
        return length * width * height;
    }

    public double calculateVolume(float radius)
    {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}