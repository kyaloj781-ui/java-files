   //Name: john kyalo
   //Reg No: S08-11162-2024
   //A program to manage different types of accounts
import java.util.Scanner;
   //bank account class
class BankAccount {
    protected double balance;
   //the attribute for the bank balance
    public BankAccount() {
        this.balance = 0;
    }
     //the deposit method
    public void deposit(double amount) {
        this.balance += amount;
    }
   //
    public double getBalance() {
        return balance;
    }
}
 //the savings class object
  //To increase the balance by 5%
class SavingsAccount extends BankAccount {
    public void addInterest() {
        balance *= 1.05;
    }
}
   //Main method of the program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SavingsAccount savingsAccount = new SavingsAccount();

        System.out.print("Enter deposit amount in Ksh ");// requesting the user to enter the deposit
        double amount = scanner.nextDouble();
        savingsAccount.deposit(amount);

        savingsAccount.addInterest();

        System.out.println("Final balance:  =Ksh " + savingsAccount.getBalance());
        scanner.close(); //for clossing the scanner object
    }
}