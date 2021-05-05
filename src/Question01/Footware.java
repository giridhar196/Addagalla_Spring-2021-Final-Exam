package Question01;

/**
 *
 * @author Giridhar Addagalla
 */
public interface Footware {

    default void print() {
        System.out.println("Hello World ! welcome to default method");
    }

    public void size();

    public void genderUse();

    public void material();
}
