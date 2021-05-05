package Question06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Giridhar Addagalla
 */
public class CheckedException {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Giridhar Addagalla | S542357");
        Scanner sc = new Scanner(new File("textfilke.txt"));
        while (sc.hasNext()) {
            int a = sc.nextInt();
            System.out.println(a);
        }

    }

}
