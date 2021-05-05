package Question05;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Giridhar Addagalla
 */
public class ComparableCircleDriver {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        ArrayList<Double> al = new ArrayList<>();
        ComparableCircle circle1 = new ComparableCircle(30);
        ComparableCircle circle2 = new ComparableCircle(13);
        ComparableCircle circle3 = new ComparableCircle(1);
        ComparableCircle circle4 = new ComparableCircle(4);
        ComparableCircle circle5 = new ComparableCircle(7);
        al.add(circle1.getArea());
        al.add(circle2.getArea());
        al.add(circle3.getArea());
        al.add(circle4.getArea());
        al.add(circle5.getArea());
        System.out.println("Before sorting the area:");
        al.forEach((al1) -> {
            System.out.println(al1);
        });
        Collections.sort(al);
        System.out.println("After sorting the area:");
        al.forEach((al1) -> {
            System.out.println(al1);
        });
        if (circle1.compareTo(circle2) < 0) {
            System.out.println("c2 is the larger instance");
        } else if (circle1.compareTo(circle2) > 0) {
            System.out.println("c1 is larger instance :");
        } else {
            System.out.println("Both are equal");
        }
    }

}
