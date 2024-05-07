package homework;

/**
 * 15. Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Programme_15_LeftAngleTriangle {
    //Creating Static Method with Params
    public static void leftTriangle(int c) {
        int a, b;

//Using nested Lop
        for (a = 0; a < c; a++) {
            for (b = 2 * (c - a); b >= 0; b--) {
                System.out.print(" ");
            }
            for (b = 0; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Calling static method in main method to print
    public static void main(String args[]) {
        int c = 5;
        leftTriangle(c);
    }
}



