   //Name:john kyalo
   //Reg No :S08-11162-2024
   //  a program to dispaly university employees data
import java.util.Scanner; //importing the scanner class
 //employee superclass
class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
// method to display the information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Lecturer extends Employee {
    private String department;

    public Lecturer(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
   //the main method
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        Lecturer lecturer = new Lecturer(name, salary, department);
        lecturer.displayInfo();//to display all the employee information

        scanner.close();//for clossing the scanner class
    }
}