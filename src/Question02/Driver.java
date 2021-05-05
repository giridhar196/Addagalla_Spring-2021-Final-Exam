package Question02;

/**
 *
 * @author Giridhar Addagalla
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla S542357");
        GeometricObject[] geoObj = new GeometricObject[5];
        geoObj[0] = new Square(10, 29);
        geoObj[1] = new Square(1, 2);
        geoObj[2] = new Square(3.3, 10.5);
        geoObj[3] = new Square(12, 19);
        geoObj[4] = new Square(13, 34.8);

        for (int i = 0; i < geoObj.length; i++) {
            System.out.println("Area of geoObj[" + i + "]" + " Object reference is :" + geoObj[i].getArea());
            System.out.print("Invoking howtoColor():");
            geoObj[i].howToColor();
        }
    }

}
