package Question10;

import java.util.Scanner;

/**
 *
 * @author Giridhar Addagalla
 */
public class InfinityRecursion {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | s542357");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value");
        int value = sc.nextInt();
        try {
            System.out.println(infinityRes(value));
        } catch (Exception ex) {

        }
    }

    private static String infinityRes(int value) {
        if (1 == 1) {
            return "infinite recursion" + "\n" + infinityRes(value + 1);
        } else {
            return "";
        }
    }

}
