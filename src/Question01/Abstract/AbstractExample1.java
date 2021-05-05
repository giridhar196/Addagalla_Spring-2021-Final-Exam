package Question01.Abstract;

/**
 *
 * @author Giridhar Addagalla
 */
public abstract class AbstractExample1 {

    private int number;

    public AbstractExample1(int number) {
        this.number = number;
    }

    public int getVal() {
        return number;
    }

    public String valSquare() {
        return "Square Value is :" + (getVal() * getVal());
    }

    public abstract void display();

    public abstract void sum();

}
