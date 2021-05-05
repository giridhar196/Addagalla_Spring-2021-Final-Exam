package Question06.UnCheckedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Giridhar Addagalla
 */
public class UnCheckedException {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        Scanner sc;
        try {
            sc = new Scanner(new File("textfilke.txt"));
            int a = sc.nextInt();
            while (true) {

                System.out.println(a);
                a = sc.nextInt();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found Exception" + ex.getMessage());
        } catch (java.util.NoSuchElementException ex) {
            System.out.println("No element found to read" + ex);
        }

    }

}
