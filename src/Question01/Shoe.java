package Question01;

/**
 *
 * @author Giridhar Addagalla
 */
public class Shoe implements Footware {

    @Override
    public void size() {
        System.out.println("This is shoe class and size method");
    }

    @Override
    public void genderUse() {
        System.out.println("This is shoe class and gender Use");
    }

    @Override
    public void material() {
        System.out.println("This is a shoe class and material method");
    }

}
