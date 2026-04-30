import java.util.*;

public class PR91
{
    public static void main(String[] args)
    {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(88);
        marks.add(92);
        marks.add(67);
        marks.add(81);

        System.out.println("Student Marks : ");
        for (int mark : marks)
        {
            System.out.print(mark + " ");
        }

        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("\n\n--- Marks Analysis ---");
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks : " + lowest);
    }
}