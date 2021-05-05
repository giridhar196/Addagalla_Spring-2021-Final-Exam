package Question10;

import java.util.Scanner;

/**
 *
 * @author Giridhar Addagalla
 */
public class DirectRec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | s542357");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to multiply");
        int value = sc.nextInt();
        System.out.println("Multiplication of " + value + " digits from 1 to " + value + " is:" + multiply(value));
    }

    private static int multiply(int value) {
        if (value > 1) {
            return value * multiply(value - 1);
        } else {
            return 1;
        }
    }

}
