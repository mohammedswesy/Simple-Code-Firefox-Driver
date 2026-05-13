/**
 * 
 */
/**
 * 
 */

import java.util.Scanner;


public class FactorialCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number to find the factorial: ");
        int number = input.nextInt();

       
        long factorial = 1;

    if (number < 0) {
            System.out.println("Error! Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
 
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        input.close();
    }
}
}