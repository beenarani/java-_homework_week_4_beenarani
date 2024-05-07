package homework;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */
public class Programme_14_Diamond {

//Calling static method to main method for print
    public static void main(String[] args) {
       diamond();
    }

public static void diamond() {
    int i, j, r;
    System.out.print("Input number of rows (half of the diamond) : ");
    //Scanner class for reading input from console
    Scanner in = new Scanner(System.in);
    r = in.nextInt();
    in.close();
    for (i = 0; i <= r; i++) {
        for (j = 1; j <= r - i; j++)
            System.out.print(" ");
        for (j = 1; j <= 2 * i - 1; j++)
            System.out.print("*");
        System.out.print("\n");
    }

    for (i = r - 1; i >= 1; i--) {
        for (j = 1; j <= r - i; j++)
            System.out.print(" ");
        for (j = 1; j <= 2 * i - 1; j++)
            System.out.print("*");
        System.out.print("\n");
    }

}
}
