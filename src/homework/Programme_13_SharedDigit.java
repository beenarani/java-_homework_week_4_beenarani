package homework;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Programme_13_SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // Should return true
        System.out.println(hasSharedDigit(9, 99));  // Should return false
        System.out.println(hasSharedDigit(15, 55)); // Should return true
    }

    // Method to check if two numbers have a shared digit
    public static boolean hasSharedDigit(int num1, int num2) {
        // Check if both numbers are within the range of 10 (inclusive) to 99 (inclusive)
        if (!isValid(num1) || !isValid(num2)) {
            return false;
        }

        //digits of num1 and num2
        int digit1_num1 = num1 % 10;
        int digit2_num1 = num1 / 10;
        int digit1_num2 = num2 % 10;
        int digit2_num2 = num2 / 10;

        // Check if any digit of num1 is equal to any digit of num2
        return (digit1_num1 == digit1_num2 || digit1_num1 == digit2_num2 ||
                digit2_num1 == digit1_num2 || digit2_num1 == digit2_num2);
    }

    // Method
    public static boolean isValid(int num) {
        return (num >= 10 && num <= 99);
    }
}



