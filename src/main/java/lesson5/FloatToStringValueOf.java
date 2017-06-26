package lesson5;


public class FloatToStringValueOf {
    public static void main(String[] args) {

        float fin;
        String toFloat = "0.44";
        fin = Float.valueOf(toFloat);
        System.out.println("Float: " + fin);

        float toStringFloat = 1000.0002f;
        String stringFromFloat = String.valueOf(toStringFloat);
        System.out.println("String: " + stringFromFloat);

    }
}
