
/**
 * @author Matthew J. Pische
 */

import java.util.Scanner;
public class ConvertToDollars
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quarters: ");
        int quarters = scanner.nextInt();
        System.out.print("Enter dimes: ");
        int dimes = scanner.nextInt();
        System.out.print("Enter nickles: ");
        int nickels = scanner.nextInt();
        System.out.print("Enter pennies: ");
        int pennies = scanner.nextInt();
        double output = (quarters * 25 + dimes * 10 + nickels * 5 + pennies) * 0.01;
        
        System.out.println("Total: $" + output);
        
    }
}
