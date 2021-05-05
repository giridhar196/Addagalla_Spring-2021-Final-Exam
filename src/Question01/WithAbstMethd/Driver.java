package Question01.WithAbstMethd;

/**
 *
 * @author Giridhar Addagalla
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | s542357");
        AbstractEx2 ex = new AbstractEx2();
        ex.getValue(14);
        AbstractEx2 ex1 = new AbstarctEx2b();
        ex1.print();
        ex1.getValue(1);

    }

}
