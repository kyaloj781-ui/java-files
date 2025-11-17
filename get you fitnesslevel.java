   //Name: John kyalo
   //Reg no: S08-11162-2024
   //A program to determine users fitness level based on steps walked in a day
import java.util.Scanner;

    // Defining the public class to check the fitness levell
public class FitnessLevelChecker {
	//determining the fitness level according to the number of steps

    public static String getFitnessLevel(int steps) {
        // Check the fitness level based on the number of steps
        if (steps >= 10000) {
            
            return "Excellent";
        } else if (steps >= 7000 && steps < 10000) {
           
            return "Good";
        } else if (steps >= 4000 && steps < 7000) {
            
            return "Average";
        } else {
           
            return "Poor";
        }
    }

    // Main method to test the method
    
    public static void main(String[] args) {
        // Creating a Scanner object that reads the user input
        Scanner Scanner= new Scanner(System.in);
        
        System.out.print("Enter the number of steps for today: ");
        int steps = Scanner.nextInt(); 

        // Determine the fitness level
        String fitnessLevel = getFitnessLevel(steps);
        System.out.println("Your fitness level is: " + fitnessLevel);
    }
}