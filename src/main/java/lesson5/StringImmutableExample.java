package lesson5;


public class StringImmutableExample {
    public static void main(String[] args) {

        String myString = "JACK";
        myString.concat(" SPARROW"); // "JACK" + " SPARROW"
        System.out.println("String: " + myString);

        myString = myString.concat(" SPARROW"); // myString = "JACK"
        System.out.println(myString); // JACK SPARROW

        int i = 10;
        double d = 10.10d;
        long l = 10101110101L;
        boolean b = true;
        String intString = String.valueOf(i);
        String doubleString = String.valueOf(d);
        String longString = String.valueOf(l);
        String boolString = String.valueOf(b);

        System.out.println(intString);
        System.out.println(doubleString);
        System.out.println(longString);
        System.out.println(boolString);

        Integer ii = Integer.valueOf(intString);
        Double dd = Double.valueOf(doubleString);
        Long ll = Long.valueOf(longString);
        Boolean bb = Boolean.valueOf(boolString);

        System.out.println(ii);
        System.out.println(dd);
        System.out.println(ll);
        System.out.println(bb);



    }
}
