package Question10;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author Giridhar Addagalla
 */
public class Friends {

    private ArrayList<String> list1;
    private static int i = 0;

    public Friends(ArrayList<String> list1) {
        this.list1 = list1;
    }

    public int findMyFriend(String n) {
        if (list1.size() < i + 1) {
            throw new NoSuchElementException(n + " Name is not available in the list");
        }

        if (list1.get(i).equals(n)) {
            return i;
        } else {
            i = i + 1;
            return findMyFriend(n);
        }

    }
}
