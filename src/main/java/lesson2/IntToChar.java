package lesson2;

public class IntToChar {

    public static void main(String[] args)
    {
        int i1 = 99;
        System.out.println("i1 = " + i1);
        char intToChar = (char) i1;
        System.out.println("intToChar = " + intToChar);
        Integer i2 = new Integer(intToChar);
        System.out.println("i2 = " + i2);
    }
}
