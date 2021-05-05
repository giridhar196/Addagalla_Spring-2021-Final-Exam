package Question05;

/**
 *
 * @author Giridhar Addagalla
 */
public class ComparableCircle extends Circle
        implements Comparable {

    public ComparableCircle(double r) {
        super(r);
    }

    @Override
    public int compareTo(Object arg0) {
        Circle circle = (Circle) arg0;
        return Double.compare(getArea(), circle.getArea());

    }
}
