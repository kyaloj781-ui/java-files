//Name:john musembi kyalo
//Regno:S08-11172-2024
//program to calculate library fine
import java.util.Scanner;
public class Libraryfine {
public static void main(String[] args) {
        Scanner scanner = new Scanner
        System.out.print("Enter Book ID: ");
        String bookID = scanner.nextLine();
        System.out.print("Enter Due Date ");
        String dueDateStr = scanner.nextLine();
        System.out.print("Enter Return Date ");
        String returnDateStr = scanner.nextLine();
        long daysOverdue = 0;
        if (returnDate.isAfter(dueDate)) {
            daysOverdue = returnDate-dueDate
        }
        double Rate;
        double finet;
        if (daysOverdue <= 7) {
            Rate = 20.0;
        } else if (daysOverdue <= 14) {
            Rate = 50.0;
        } else { 
            Rate = 100.0;
        }
        final amount = Rate * daysOverdue;
        System.out.println("Book ID: " + bookID);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Days Overdue: " + daysOverdue);
        System.out.println(Rate: KSh. " +Rate);
        System.out.println("Fine Amount: KSh. " + fineAmount)
        ;scanner.close();
    }
}
