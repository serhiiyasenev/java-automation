package lesson2;

public class FloatToChar {

    public static void main(String[] args)
    {
        float f1 = 60533.0005f;
        char floatToChar = (char) f1;
        float f2 = (float) floatToChar;
        System.out.println("f1="+f1 + "\n");
        System.out.println("floatToChar="+floatToChar + "\n");
        System.out.println("f2="+f2);
    }
}
