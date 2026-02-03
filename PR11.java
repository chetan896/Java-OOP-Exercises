import java.util.*;

public class PR11 {
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter Distance in meters: ");
        double meters = S.nextDouble();

        double feet = meters * 3.28084;

        System.out.println(meters +" meters is equal to "+feet+" %.2f feet.");
        S.close();
    }
}