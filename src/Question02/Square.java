package Question02;

/**
 *
 * @author Giridhar Addagalla
 */
public class Square extends GeometricObject implements Colorable {

    private double side1, side2;

    public Square(double side1, double side2) {

        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    @Override
    public double getArea() {
        return getSide1() * getSide2();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

}
