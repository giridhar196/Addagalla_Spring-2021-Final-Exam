package Question11;

/**
 *
 * @author Giridhar Addagalla
 */
public class Driver {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        Desktop desktop1 = new Desktop(250, "DES3546");
        Desktop desktop2 = new Desktop(350, "DES1376");
        Desktop desktop3 = new Desktop(250, "DES3546");
        System.out.println("Invoking equals method");
        System.out.println("Comparing object 1 and 2:  " + desktop1.equals(desktop2));
        System.out.println("Comparing object 2 and 3:  " + desktop2.equals(desktop3));
        System.out.println("Comparing object 1 and 3:  " + desktop3.equals(desktop1));
        System.out.println("Invoking hashcode method");
        System.out.println(desktop1.hashCode());
        System.out.println(desktop2.hashCode());
        System.out.println(desktop3.hashCode());

    }

}
