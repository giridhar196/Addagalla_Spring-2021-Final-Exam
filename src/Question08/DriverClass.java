package Question08;

import java.io.FileNotFoundException;

/**
 *
 * @author Giridhar Addagalla
 */
public class DriverClass {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Giridhar Addagalla | S542357");
        FilentFound fc = new FilentFound();
        try {
            fc.getDetails();
        } catch (Exception ex) {
            System.out.println("Exception" + ex.getMessage());
        }
    }

}
