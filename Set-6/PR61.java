public class PR61
{
    public static void main(String[] args) 
    {
        try
        {
            int num = Integer.parseInt(args[0]);
            int den = Integer.parseInt(args[1]);

            int result = num / den;

            System.out.println("Numerator: "+ num);
            System.out.println("Denominator: "+ den);
            System.out.println("Result: "+ result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Please provide two arguments.");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid input. Enter integers only.");
        }
    }
}