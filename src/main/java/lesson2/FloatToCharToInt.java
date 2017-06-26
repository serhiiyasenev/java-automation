package lesson2;

public class FloatToCharToInt {

    public static void main(String[] args)
    {
        float float1 = 60533.05f;
        char cc2 = (char) float1;
        System.out.println(cc2 + "\n");

        Integer ii1 = new Integer (cc2);
        int ii2 = (int) cc2;
        System.out.println(ii1 + " " + ii2 + "\n" );

        Double xx1 = new Double(float1);
        double xx2 = (double) float1;
        System.out.println(xx1 + " " + xx2 + "\n" );

        float xFloat1 = xx1.floatValue();
        float xFloat2 = (float) xx2;
        System.out.println(xFloat1 + " " + xFloat2 + "\n" );
    }
}
