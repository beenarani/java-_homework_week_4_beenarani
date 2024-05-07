package homework;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_FibonacciNumber {
    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci() {

        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int numTerms = scanner.nextInt();
        scanner.close();
//Variable
        int n = 8;
        int firstTerm = 0;
        int secondTerm = 1;

        //Calculations
        System.out.print("Fibonacci Series up to " + numTerms + " terms: ");
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

}