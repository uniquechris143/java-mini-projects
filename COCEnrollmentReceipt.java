package mini_projects;
import java.util.Scanner;

public class COCEnrollmentReceipt{
  public static void main(String[] args) {

    boolean isEnrolled = true;
      
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("--- PHINMA COC ENROLLMENT ---\n");

    System.out.print("Enter Course: ");
    String course = scanner.nextLine();

    System.out.print("Enter Section: ");
    char section = scanner.next().charAt(0);

    System.out.print("Enter Monthly Fee: ");
    double fee = scanner.nextDouble();

    System.out.println("");

    System.out.println("GENERATING RECEIPT...");
    System.out.println("Course: " + course + " | " + "Section: " + section);
    System.out.println("Total Fee: " + fee);
    System.out.println("Enrolled: " + isEnrolled);
    
    scanner.close();
  }
}