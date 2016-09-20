
/**
 * @author Matthew Pische 
 */

import java.util.Scanner; 

public class ConvertFromSeconds
{
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of seconds: ");
        int inputSeconds = scanner.nextInt();
        
        int outputHours = inputSeconds / (3600);
        inputSeconds -= outputHours * 3600;
        int outputMinutes = inputSeconds / 60;
        inputSeconds -= outputMinutes * 60;
        
        System.out.println("This is " + outputHours + " hours, " + outputMinutes + " minutes and " + inputSeconds + " seconds.");
        
    }
}
