
/**
 * CS 162 Lab 03.
 * 
 * @author Matthew J. Pische 
 * @version Sept 19th, 2016
 */

import java.util.Scanner;

public class ConvertToSeconds
{
    int hours;
    int minutes;
    int seconds;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // propt user for 3 integers as hours minutes seconds input
        //String userStringInput = scanner.next();
        System.out.print("Enter the number of hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter the number of seconds: ");
        int seconds = scanner.nextInt();
        int output = (hours * 60 + minutes) * 60 + seconds;
        System.out.println("Total Seconds: " + output);
        
    }
}
