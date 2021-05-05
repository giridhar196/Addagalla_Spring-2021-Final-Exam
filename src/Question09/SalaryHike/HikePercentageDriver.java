package Question09.SalaryHike;

import Question08.ArithAndArrayIndex.NotValidException;
import java.util.Scanner;

/**
 *
 * @author Giridhar Addagalla
 */
public class HikePercentageDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hike Percentage:");
        int n = sc.nextInt();
        try {
            CheckHike sg = new CheckHike(n);
            if (sg.getHikePercentage() < 0 || sg.getHikePercentage() > 100) {
                throw new NotValidException("Invalid Hike Percentage");
            }
            if (sg.getHikePercentage() >= 90 && sg.getHikePercentage() <= 100) {
                System.out.println("Highest Hike");
            } else if (sg.getHikePercentage() < 90 && sg.getHikePercentage() >= 80) {
                System.out.println("Mid level Hike");
            } else if (sg.getHikePercentage() < 80 && sg.getHikePercentage() >= 70) {
                System.out.println("Hike Level: 70-80");
            } else {
                System.out.println("Hike less than 70%");
            }

        } catch (NotValidException ex) {
            System.out.println(ex);
        }
    }

}
