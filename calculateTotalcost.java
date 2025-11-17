         // Nsme: John kyalo
        //Reg No: S08-11162-2024
        //A program to calculate the total cost af a vacation package

public class CaculateTotalcost {


    public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        // Return sum of the 3 prices
        return accommodationCost + mealCost + activityCost;
    }

    // Main method to calculateTotalVacation cost
    public static void main(String[] args) {
        // Sample costs
        double accommodationCost = 8000; // Cost of the accommodation offered
        double mealCost = 3505; // Cost of meals offered
        double activityCost = 3440; // Cost of activities done

        // To calculate the total cost
        double totalCost = calculateTotalCost(accommodationCost, mealCost, activityCost);

        // for print the total cost on the screen
        System.out.println("Total Vacation Cost: Ksh :  " + totalCost);
    }
}