package Question06.CheckedUsingTry;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Giridhar Addagalla
 */
public class CheckedException {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        try {
            Scanner sc = new Scanner(new File("extfilke.txt"));
            while (sc.hasNext()) {
                int a = sc.nextInt();
                System.out.println(a);
            }
        } catch (Exception ex) {
            System.out.println("File Not Found Exception");
        }

    }

}
