import java.util.*;

public class PR43
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter Employee Details:");
        System.out.print("Name: ");
        String eName = S.nextLine();
        System.out.print("Department: ");
        String eDept = S.nextLine();
        Employee emp = new Employee(eName, eDept);

        System.out.println("\nEnter Manager Details:");
        System.out.print("Name: ");
        String mName = S.nextLine();
        System.out.print("Department: ");
        String mDept = S.nextLine();
        System.out.print("Team Size: ");
        int size = S.nextInt();
        Manager mgr = new Manager(mName, mDept, size);

        System.out.println("\n--- Employee Display ---");
        emp.displayDetails();

        System.out.println("\n--- Manager Display (Overridden) ---");
        mgr.displayDetails();

        S.close();
    }
}

class Employee
{
    String name;
    String department;

    Employee(String name, String department)
    {
        this.name = name;
        this.department = department;
    }

    void displayDetails()
    {
        System.out.println("Name: "+ name);
        System.out.println("Department: "+ department);
    }
}

class Manager extends Employee
{
    int teamSize;

    Manager(String name, String department, int teamSize)
    {
        super(name, department);
        this.teamSize = teamSize;
    }

    void displayDetails()
    {
        super.displayDetails();
        System.out.println("Team Size: "+ teamSize);
    }
}