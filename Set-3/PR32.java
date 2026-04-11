import java.util.*;

public class PR32
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter College Name: ");
        String collegeName = S.nextLine();

        College college = new College(collegeName);
        College.Admission admission = college.new Admission();

        admission.inputStudentDetails(S);
        admission.displayAdmissionDetails();

        S.close();
    }
}

class College
{
    private String collegeName;

    public College(String collegeName)
    {
        this.collegeName = collegeName;
    }

    class Admission
    {
        private String studentName;
        private String course;

        public void inputStudentDetails(Scanner S)
        {
            System.out.print("Enter Student Name: ");
            studentName = S.nextLine();
            System.out.print("Enter Course: ");
            course = S.nextLine();
        }

        public void displayAdmissionDetails()
        {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College: "+ collegeName);
            System.out.println("Student: "+ studentName);
            System.out.println("Course: "+ course);
        }
    }
}