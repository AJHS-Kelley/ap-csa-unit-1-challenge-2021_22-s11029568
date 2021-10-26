// Maxximus Secrest, AP CSA Unit 1 Challenge, Andrew Jackson High School, <10/26/2021>, <8:20>, v4.5
// pear debugging by: robin/rachel macdonald (lol hi maxx)
import java.util.Scanner;

public class DamageDealt {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the monsters name?");
        String monsterName = myScanner.nextLine();
        System.out.println("\nPlease Enter the name of the weapon:");
        String weaponName = myScanner.nextLine();
        System.out.println("\nPlease enter the damage value of the weapon");
        double weaponDamage = myScanner.nextDouble();
        System.out.println("\nHow many attacks will you perform?");
        int attacknumber = myScanner.nextInt();
        double totaldamage = weaponDamage * attacknumber;
        System.out.print("You dealt " + totaldamage);
        System.out.print(" to " + monsterName);
        System.out.print(" using " + weaponName);
        double dps = totaldamage / 4;
        System.out.print("You dealt " + dps);
        System.out.print(" damage per second!");

        
        
        
       
        
    }

}