import java.util.*;

public class PR13 
{
    public static void main(String[] args)
     {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter a single letter: ");
        String input = S.next();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0)))
         {
            System.out.println("Invalid input.");
        } 
        else {
            char c = Character.toLowerCase(input.charAt(0));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println(input.charAt(0) + " is a vowel.");
            } else {
                System.out.println(input.charAt(0) + " is a consonant.");
            }
        }

        S.close();
    }
}