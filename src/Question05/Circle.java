package Question05;

/**
 *
 * @author Giridhar Addagalla
 */
public class Circle {

    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.round(Math.PI * getRadius() * getRadius());
    }
}
