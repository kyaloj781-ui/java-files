  //Name: John kyalo
  //Reg No:S08-11162-2024
  // CoffeeOrder java program
class CoffeeOrder {
    String size;
    double price;

    // Constructor to set attributes
    public CoffeeOrder(String size, double price) {
        this.size = size;
        this.price = price;
    }

    // Method to display order details
    public void displayOrder() {
        System.out.println("Size: " + size );
        System.out.println("price" + price);
    }
}

   //The Main class
public class Main {
    public static void main(String[] args) {
        // Creating the two CoffeeOrders objects
        CoffeeOrder firstOrder = new CoffeeOrder("fine", 35);
        CoffeeOrder secondOrder = new CoffeeOrder("medium", 40);

        // Displaying details of each order
        firstOrder.displayOrder();
        secondOrder.displayOrder();
    }
}