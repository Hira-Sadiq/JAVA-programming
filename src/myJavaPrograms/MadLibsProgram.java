package myJavaPrograms;

import java.util.Scanner;

public class MadLibsProgram {

    public static void main(String arg[]){

        // User is entering the season of the year
        System.out.println("Enter a season of the year:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // User is entering a whole number
        System.out.println("Enter a whole number:");
        int wholeNumber = scanner.nextInt();

        // User is entering an adjective
        System.out.println("Enter an adjective:");
        String adjective = scanner.next();
        scanner.close();

        // Add the inputs from user and generating a sentence
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");

    }
}
