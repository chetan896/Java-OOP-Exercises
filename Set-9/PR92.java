import java.util.*;

public class PR92
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter a sentence : ");
        String sentence = S.nextLine();
        sentence = sentence.toLowerCase();

        String[] words = sentence.split("\\s+");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words)
        {
            if (wordCount.containsKey(word))
            {
                wordCount.put(word, wordCount.get(word) + 1);
            }
            else
            {
                wordCount.put(word, 1);
            }
        }

        System.out.println("\n--- Word Frequencies ---");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        S.close();
    }
}