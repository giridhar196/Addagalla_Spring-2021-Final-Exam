/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03.Example3;

/**
 *
 * @author Giridhar Addagalla
 */
public class ChromeBook extends Laptops {

    private double speed;

    public ChromeBook(String laptopName) {
        super(laptopName);
    }

    @Override
    public String toString() {
        return "ChromeBook{" + "speed=" + speed + '}';
    }

    public ChromeBook(double speed, String laptopName) {
        super(laptopName);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

}
