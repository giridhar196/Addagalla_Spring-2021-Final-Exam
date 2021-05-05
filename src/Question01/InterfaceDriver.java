package Question01;

/**
 *
 * @author Giridhar Addagalla
 */
public class InterfaceDriver {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        Sandels s = new Sandels();
        s.genderUse();
        s.material();
        s.size();
        Shoe so = new Shoe();
        so.genderUse();
        so.material();
        so.size();
        so.print();
    }

}
