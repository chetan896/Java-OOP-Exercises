import java.util.*;

public class PR94
{
    public static <T> boolean searchElement(LinkedList<T> list, T element)
    {
        return list.contains(element);
    }

    public static void main(String[] args)
    {
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);

        int searchRoll = 102;
        System.out.println("Searching roll number " + searchRoll + " : " + searchElement(rollNumbers, searchRoll));

        LinkedList<String> names = new LinkedList<>();
        names.add("Ansh");
        names.add("Priya");
        names.add("Rahul");
        names.add("Sneha");

        String searchName = "Ansh";
        System.out.println("Searching name " + searchName + " : " + searchElement(names, searchName));
    }
}