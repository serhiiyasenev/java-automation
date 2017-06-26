package lesson7;

import java.util.Scanner;

public class CesarExample {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {

        String test;
        System.out.println("Введите текст:");
        Scanner in = new Scanner(System.in);
        test = in.nextLine().toString();
        System.out.println("Введите шифт:");
       Integer shift = new Integer(in.nextLine().toString());

        System.out.println(cesarExample(test, shift));
    }

    public static String cesarExample(String text, Integer shift) {

        StringBuilder str = new StringBuilder(text);

        for (int i = 0; i<text.length(); i++) {
            char c = str.charAt(i);
            int aIndex = ALPHABET.indexOf(c);
            int replaceIndex = (aIndex + shift) % 26;
            char charToReplace = ALPHABET.charAt(replaceIndex);
            str.setCharAt(i, charToReplace);
        }
        return str.toString();
    }
}