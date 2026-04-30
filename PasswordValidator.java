package mini_projects;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Create a Password: ");
        String password = scanner.nextLine().trim();

        if (password.isEmpty()) {
            System.out.println("ERROR: Password field cannot be empty!");
        } 
        else {
            System.out.print("Enter your Secret Key character: ");
            char secretKey = scanner.next().charAt(0);
            scanner.nextLine(); 

            System.out.println("\n--- Validation Results ---");

            if (password.length() < 8) {
                System.out.printf("Cleaned Password: [%s]\n", password);
                System.out.printf("Password Length: %d\n", password.length());
                System.out.println("RESULT: Access Denied. Password must be at least 8 characters.");
            } 
            else {
                System.out.printf("Cleaned Password: [%s]\n", password);
                System.out.printf("Password Length: %d\n", password.length());

                if (password.charAt(0) == secretKey) {
                    System.out.println("Key Match: true");
                    System.out.println("RESULT: Strong Password! Access Granted.");
                    
                    System.out.print("\nRe-type password to confirm: ");
                    String confirm = scanner.nextLine().trim();
                    
                    if (password.equalsIgnoreCase(confirm)) {
                        System.out.println("Match Found: true (Case Ignored)");
                        System.out.println("FINAL STATUS: Account Verified!");
                    } else {
                        System.out.println("Match Found: false");
                        System.out.println("FINAL STATUS: Confirmation failed.");
                    }
                } 
                else {
                    System.out.println("Key Match: false");
                    System.out.println("RESULT: SECURITY Alert! Key does not match the first letter.");
                }
            }
        }

        scanner.close();
    }
}
