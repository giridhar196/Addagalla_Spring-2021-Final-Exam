package Question08.ArithAndArrayIndex;

import java.util.ArrayList;

/**
 *
 * @author Giridhar Addagalla
 */
public class Arithmatic {

    public void twoExceptions(ArrayList<Integer> listOne, int int2, int int3) throws ArithmeticException, IndexOutOfBoundsException, NotValidException {
        if (listOne.size() > 9) {
            throw new IndexOutOfBoundsException();
        } else {
            System.out.println("Array list values are:");
            listOne.forEach((a1) -> {
                System.out.println(a1);
            });
        }
        if (int2 <= 0 || int3 <= 0) {
            throw new ArithmeticException("The values should be positive only.");
        } else if (int2 > int3) {
            throw new NotValidException("int3 value must be less than int2 ");
        } else {
            System.out.println("Division :" + int2 / int3);
        }
    }

}
