package homework;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_RightAngleTriangle {

    public static void main(String[] args) {
        int rows = 5;
        //For loop for rows
        for (int i = 1; i <= 5; i++) {
            // For Loop for col.
            for (int j = 1; j <= 5 - i; j++) {
            }
            for (int k = 1; k <= i; k++) {
                //Print
                System.out.print("@ ");
            }
            //New line
            System.out.println();
        }
    }
}