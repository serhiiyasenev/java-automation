package lesson2;

public class ChangeType {

    public static void main(String[] args)
    {
        int i = 605233;
        long lo = i;
        short s = (short) lo;
        System.out.println(s);
        char ch = 'J';
        int intCh = (int) ch;
        System.out.println("J corresponds with " + intCh);

        Integer ii = new Integer(100);

        Character cc = new Character('c');

        Boolean bb = new Boolean(true);
    }
}
