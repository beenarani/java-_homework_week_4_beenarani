package homework;

import java.util.Scanner;

/**
 * 7. First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * <p>
 * Example input/output
 * * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
 * <p>
 * gives us 0+0 and the sum is 0.
 * <p>
 * * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
 * gives us 5+5 and the sum is 10.
 * * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */
public class Programme_7_FirstAndLastDigitSum {
    // Method to find sum of first and last digit
    private static int FirstLastDigitSum(int number) {

        // Declare variables
        int lastDigit, firstDigit, divisor;
        ;
        int totalDigits = 0;
        int sum = 0;

        // Find last digit
        lastDigit = number % 10;

        // Find total number of digits
        totalDigits = findDigits(number);

        // calculate divisor value
        divisor = (int) Math.pow(10, totalDigits - 1);

        // find first digit
        firstDigit = number / divisor;

        // add values
        sum = firstDigit + lastDigit;

        return sum;
    }

    // method to find total number of digits
    private static int findDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    public static void main(String[] args) {

        // declare variables
        int number = 0;
        int sum = 0;

        // create Scanner class object for reading the values from console
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer number:: ");
        number = scan.nextInt();

        // find sum of digits of number
        sum = FirstLastDigitSum(number);

        // Print
        System.out.println("The sum of first & last"
                + " digit of the number " + number
                + " = " + sum);

        // close Scanner class
        scan.close();
    }
}
