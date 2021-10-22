// Maxximus Secrest, AP CSA Unit 1 Challenge, Andrew Jackson High School, <10/22/2021>, <9:34>, v3.0 
// pear debugging by: robin/rachel macdonald (lol hi maxx)
import java.util.Scanner;

public class DamageDealt {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the monsters name?");
        String monsterName = myScanner.nextLine();
        System.out.print("\n");
        System.out.println("Please Enter the name of the weapon:");
        String weaponName = myScanner.nextLine();
        System.out.println("   ");
        System.out.println("Please enter the damage value of the weapon");
        double weaponDamage = myScanner.nextDouble();
        System.out.println("\n");
        System.out.println("How many attacks will you perform?");
        int attacknumber = myScanner.nextInt();
        double totaldamage = weaponDamage * attacknumber;
        
        
        
       
        
    }

}