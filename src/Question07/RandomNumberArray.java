package Question07;

import java.util.Scanner;

/**
 *
 * @author Giridhar Addagalla
 */
public class RandomNumberArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        int randomArr[] = new int[100];
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = (int) (Math.random() * 100);
        }
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the Index to display value:");
            int index = sc.nextInt();
            System.out.println("value is :" + randomArr[index]);
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("Out of Bounds");

        }

    }

}
