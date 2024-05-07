package homework;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme_10_ArmstrongNumber {


    public static void main(String[] args) {
        armstrong();

    }

    public static void armstrong() {
        int num, number, temp, total = 0;
        System.out.println("Enter 3 Digit Number");
        //Import Scanner
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        //Scanner Close
        scanner.close();

        //Logic
        number = num;
        for (; number != 0; number /= 10) {
            temp = number % 10;
            total = total + temp * temp * temp;
        }
        if (total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}