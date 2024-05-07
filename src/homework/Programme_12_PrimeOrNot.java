package homework;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme_12_PrimeOrNot {
    public static void main(String[] args) {
        // Input number
        int n = 11;

        // Holds the count of values
        int count = 0;

        // There is no prime number less than 2.
        if (n <= 1) {
            System.out.println("The number is not prime");
            return;
        }

        // For Loop
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("The number is not prime");
        }
        else {
            System.out.println("The number is prime");
        }
    }

}