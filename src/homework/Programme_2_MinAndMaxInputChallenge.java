package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme_2_MinAndMaxInputChallenge {

    public static void main(String[] args) {
        int input = prompt();


        //Print the minimum and maximum number using while loop
        ArrayList<Integer> inputList;
        inputList = new ArrayList();
        Integer min;
        Integer max;

        if (input == 0 && inputList.isEmpty()) {
            System.out.println("error: empty list!");
        } else {
            while (input < 1 && input != 0 || input > 5 && input != 0) {
                input = prompt();
            }
            while (input >= 1 && input <= 5) {
                inputList.add(input);
                input = prompt();
            }
            min = Collections.min(inputList);
            max = Collections.max(inputList);
            System.out.println("Min: " + min + "\n" + "Max: " + max);
        }


    }

    private static int prompt() {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        return scanner.nextInt();

    }
}

