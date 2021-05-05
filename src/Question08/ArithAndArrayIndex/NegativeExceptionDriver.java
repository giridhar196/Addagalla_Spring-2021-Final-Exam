package Question08.ArithAndArrayIndex;

import java.util.Scanner;

/**
 *
 * @author Giridhar Addagalla
 */
public class NegativeExceptionDriver {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value:");
        int integer = sc.nextInt();
        if (integer < 0) {
            try {
                throw new NegativeException("n value is less than 0");
            } catch (NegativeException ex) {
                System.out.println(ex);
            }
        } else {
            System.out.println("Square is :" + (integer * integer));
        }
    }

}
