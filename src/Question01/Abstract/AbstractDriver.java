package Question01.Abstract;

/**
 *
 * @author Giridhar Addagalla
 */
public class AbstractDriver {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        AbstractExample2 abstractObj = new AbstractExample2(50);
        System.out.println(abstractObj.valSquare());
        abstractObj.display();
        abstractObj.sum();
    }

}
