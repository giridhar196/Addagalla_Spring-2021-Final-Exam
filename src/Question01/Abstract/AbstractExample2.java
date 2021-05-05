package Question01.Abstract;

/**
 *
 * @author Giridhar Addagalla
 */
public class AbstractExample2 extends AbstractExample1 {

    public AbstractExample2(int number) {
        super(number);
    }

    @Override
    public void display() {
        System.out.println("Display method is implemented in Abstract Example 2 class");
    }

    @Override
    public void sum() {
        System.out.println("Sum Method is implemented in Abstract Example 2" + super.getVal() + super.getVal());
    }

}
