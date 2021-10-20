// Maxximus Secrest, AP CSA Unit 1 Challenge, Andrew Jackson High School, <10/20/2021>, <9:18>, v1.5
import java.util.Scanner;

public class DamageDealt {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please Enter the name of the weapon:");
        String weaponName = myScanner.nextLine();
        System.out.println("   ");
        System.out.println("Please enter the damage value of the weapon");
        double weaponDamage = myScanner.nextDouble();
        System.out.println("   ");
        System.out.println("What is the name of the monster?");
        String monsterName = myScanner.nextLine();
    }

}