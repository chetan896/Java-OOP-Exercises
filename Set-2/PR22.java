import java.util.*;

public class PR22
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);

        Employee emp = new Employee();
        emp.readEmployeeData(S);
        emp.displayEmployeeData();

        S.close();
    }
}

class Employee
{
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData(Scanner S)
    {
        System.out.print("Enter Employee Name: ");
        employeeName = S.nextLine();
        System.out.print("Enter Employee Salary: ");
        employeeSalary = S.nextDouble();
    }

    public void displayEmployeeData()
    {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: "+ employeeName);
        System.out.println("Salary: "+ employeeSalary);
    }
}