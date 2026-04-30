import java.io.*;

public class PR82
{
    public static void main(String[] args)
    {
        FileWriter fw = null;
        BufferedReader br = null;

        try
        {
            fw = new FileWriter("students.txt");

            fw.write("55 Ansh 99\n");
            fw.write("33 Raj 98\n");
            fw.write("44 Suraj 97\n");

            System.out.println("Data written to file successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error : Writting to file.");
        }
        finally
        {
            try
            {
                if (fw != null)
                {
                    fw.close();
                }
            }
            catch (IOException e)
            {
                System.out.println("Error : Closing file writer.");
            }
        }

        try
        {
            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("Reading Student Records : ");

            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error : reading file.");
        }
        finally
        {
            try
            {
                if (br != null)
                {
                    br.close();
                }
            }
            catch (IOException e)
            {
                System.out.println("Error : clossing BufferedReader.");
            }
        }
    }
}