package mini_projects;

import java.util.Random;
import java.util.Scanner;

public class MonsterBattle {
  public static void main(String[] args) {
      
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    System.out.println("--- MONSTER BATTLE START ---");

    System.out.println("\nA wild Dragon appears!");

    double monsterHealth = 50 + (100 - 50) * random.nextDouble();
    System.out.println("Monster Health: " + String.format("%.2f", monsterHealth));

    System.out.print("Enter your Attack Power: ");
    double attackPower = scanner.nextDouble();

   if(attackPower >= monsterHealth){
      System.out.println("CRITICAL HIT! You dealt " + attackPower + " damage!");
      System.out.println("\nMonster Slain");
    }
        
   else {
    double remainingHealth = monsterHealth - attackPower;
    System.out.println("You dealt " + attackPower + " damage!");
    System.out.println("\nMonster survived with " + (int)Math.floor(remainingHealth) + " HP.");
   }

    scanner.close();
  }
}
