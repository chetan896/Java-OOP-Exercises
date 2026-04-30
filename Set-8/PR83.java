import java.io.*;

public class PR83
{
    public static void main(String[] args)
    {
        BufferedReader br = null;

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try
        {
            br = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = br.readLine()) != null)
            {
                lineCount++;
                String[] words = line.trim().split("\\s+");

                if (line.trim().length() > 0)
                {
                    wordCount += words.length;
                }

                for (int i = 0; i < line.length(); i++)
                {
                    if (line.charAt(i) != ' ')
                    {
                        charCount++;
                    }
                }
            }

            System.out.println("Total Lines : " + lineCount);
            System.out.println("Total Words : " + wordCount);
            System.out.println("Total Characters : " + charCount);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error : File not found.");
        }
        catch (IOException e)
        {
            System.out.println("Error : reading the file.");
        }
        finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                }
                catch (IOException e)
                {
                    System.out.println("Error closing file.");
                }
            }
        }
    }
}