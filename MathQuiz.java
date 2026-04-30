package mini_projects;
import java.util.Random;
import java.util.Scanner;

public class MathQuiz { 
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int num1 = random.nextInt(10) + 1;
    int num2 = random.nextInt(10) + 1;
    int correctAnswer = num1 + num2; 
    int attempts = 0;
    boolean solved = false;

    System.out.println("--- M-A-T-H Q-U-I-Z ---");

    while (!solved) { 
        System.out.printf("Question: What is %d + %d?\n", num1, num2);
        System.out.print("Answer: ");
        int userGuess = scanner.nextInt();
        attempts++; 

        if (userGuess == correctAnswer) {
            System.out.println("CORRECT!");
            solved = true; 
        } else {
            System.out.println("Incorrect! Try again.\n");
        }
    }

    String rank = (attempts == 1) ? "Legend" : "Beginner";
    
    System.out.printf("Total attempts: %d\n", attempts);
    System.out.println("Rank: " + rank);
  }
}
