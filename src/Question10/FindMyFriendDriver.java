package Question10;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Giridhar Addagalla
 */
public class FindMyFriendDriver {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        ArrayList<String> friendList = new ArrayList<String>();
        friendList.add("Vasavi");
        friendList.add("Jeevan");
        friendList.add("Raghava");
        friendList.add("Prasamsha");
        System.out.println("Enter elemnt to search :");
        try {
            Scanner sc = new Scanner(System.in);
            String e = sc.next();
            Friends fr = new Friends(friendList);
            System.out.println("Friend Name : " + e + " Found at index:" + fr.findMyFriend(e));
        } catch (NoSuchElementException ex) {
            System.out.println(ex);
        }
    }

}
