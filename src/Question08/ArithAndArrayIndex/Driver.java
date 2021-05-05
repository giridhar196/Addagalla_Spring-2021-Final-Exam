package Question08.ArithAndArrayIndex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Giridhar Addagalla
 */
public class Driver {

    public static void main(String[] args) throws FileNotFoundException, NotValidException {
        System.out.println("Giridhar Addagalla | S542357");
        ArrayList<Integer> intList = new ArrayList<>();
        Scanner sc = new Scanner(new File("textfilke.txt"));
        Scanner s = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            intList.add(a);
        }
        System.out.println("First Integer value :");
        int int2 = s.nextInt();
        System.out.println("Enter Second Integer value:");
        int int3 = s.nextInt();
        Arithmatic ex = new Arithmatic();
        try {
            ex.twoExceptions(intList, int2, int3);
        } catch (ArithmeticException | IndexOutOfBoundsException | NotValidException ex1) {
            System.out.println(ex1);
        }
        try {
            System.out.println("Do you want to add element to the list and\n and invoke"
                    + "multipleExceptions() method Enter true/false");
            boolean d = s.nextBoolean();
            if (d == true) {
                intList.add(24);
                ex.twoExceptions(intList, int2, int3);
            }
            System.out.println("Done !!");
        } catch (ArithmeticException | IndexOutOfBoundsException | NotValidException ex2) {
            System.out.println(ex2);
        }
    }
}
