   //Name:john kyalo
   //Reg No: S08-11162-2024
   //program to calculate the student's grade'
import java.util.Scanner;

class Student {
    private String name;
    private double marks;

    // Constructor to initialize attributes
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails(String grade) {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    // Getter for marks
    public double getMarks() {
        return marks;
    }
}

  //grade calculator
class GradeCalculator {
    // Method for calculating the grade based on the student's marks'
    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}

// MainApp class

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept user input to create a Student object
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student's marks: ");
        double marks = scanner.nextDouble();

        // Creating the Student object
        Student student = new Student(name, marks);

        // Use GradeCalculator to compute the grade
        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.calculateGrade(student.getMarks());

        // Display student details together with  the calculated grade
        student.displayDetails(grade);
    }
}