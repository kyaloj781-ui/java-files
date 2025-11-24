  //Name: John kyalo
  //Reg No: S08-11162-2024
  


import java.util.Scanner;

class Product {
    private String name;
    private double price;

    // Constructor to set both attributes
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to apply a discount to the price
    public void applyDiscount(double percentage) {
        price -=price *(percentage/100);
    }

    // Method of getting  the updated price
    public double getPrice() {
        return price;
    }
}

// The main class

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Product object
        Product product = new Product("product y", 10000);

        // Ask the user to enter a discount percentage
        System.out.print("Enter a discount percentage: ");
        double discount = scanner.nextDouble();

        // Apply the discount
        product.applyDiscount(discount);

        // Displaying the new price of the product
        System.out.println(" The discounted price is: Ksh" + product.getPrice());
    }
}