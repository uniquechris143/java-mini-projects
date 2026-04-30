package mini_projects;
import java.util.Scanner;

public class FitnessSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        double weight;

        System.out.println("--- Welcome to Elite Fitness ---");

        System.out.print("Enter your name: ");
        name = scanner.nextLine().toUpperCase();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Enter your weight (kg): ");
        weight = scanner.nextDouble();

        int memberID = age + 1000;
        boolean isAdult = age >= 18;
        boolean qualifies = (age >= 18 && age <= 60) && (weight > 50);
        double finalFee = qualifies ? 45.0 : 60.0;

        System.out.println("\nRegistration Summary:");
        System.out.printf("Name: %s\n", name);
        System.out.printf("Member ID: %d\n", memberID);
        System.out.printf("Is Adult: %b\n", isAdult);
        System.out.printf("Qualifies for Pro Discount: %b\n", qualifies);
        System.out.printf("Final Monthly Fee: $%.1f\n", finalFee);

        scanner.close();
    }
}
