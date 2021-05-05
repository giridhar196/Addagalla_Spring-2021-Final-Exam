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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        Laptops l = new Laptops("ch1200");
        System.out.println(l);
        ChromeBook c = new ChromeBook(12.5, "ch12000");
        System.out.println(c);
        l = c;
        //typecasting
        ChromeBook c1 = (ChromeBook) l;
        System.out.println("Type Casting\n" + c1);
    }

}
