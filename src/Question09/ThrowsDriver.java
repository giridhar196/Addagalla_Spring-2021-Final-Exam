package Question09;

import java.util.Scanner;

/**
 *
 * @author Giridhar Addagalla
 */
public class ThrowsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first  value:");
        double x = sc.nextInt();
        System.out.print("Enter second value");
        double y = sc.nextInt();
        if (y == 0) {
            try {
                throw new ArithmeticException("second value is not equal to 0");
            } catch (ArithmeticException ex) {
                System.out.println(ex);
            }
        } else {
            System.out.println("Division is :" + (x / y));
        }
    }

}
