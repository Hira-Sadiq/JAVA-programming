package myJavaPrograms;

import java.util.Scanner;
/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String args[]) {
        //Initialize what we know
        int amountRequired = 30000;
        int yearsRequired = 2;

        //Get what we don't
        System.out.println("Enter your salary in dollars you made in the company:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Enter the number of years you worked for the company:");
        double yearsWorked = scanner.nextDouble();
        scanner.close();

        //Make decision
        if (salary >= amountRequired) {
            if (yearsWorked >= yearsRequired) {
                System.out.println("Congrats! You are qualified for a loan. Please proceed further with the process.");
            } else {
                yearsWorked = yearsRequired - yearsWorked;
                System.out.println("We're Sorry! You are not qualified for a loan. In order to get qualified you need to work for 2 years."
                        + " You were short by " + yearsWorked + " years");
            }
        } else {
            salary = amountRequired - salary;
            System.out.println("We're Sorry! You are not qualified for a loan. In order to get qualified you need to make at least $30,000."
            + " You were short by " + salary + " $");
        }
    }
}
