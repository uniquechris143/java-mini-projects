package mini_projects;
import java.util.Scanner;

public class BillingSystem {
  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);


  System.out.print("Total Amount: ");
  int money = scanner.nextInt();
  scanner.nextLine();

  System.out.print("Are you a student (true/false)? ");
  String student = scanner.nextLine();

  boolean value = Boolean.parseBoolean(student);

  if (value) {
    double discount = money *= 0.90;
    System.out.println("\nDiscount Applied! ");
    System.out.println(discount);
  }

  else{
    System.out.println("No Discount available.");
    System.out.println(money);
  }

  scanner.close();
      
  }
}
