package homeTasks7;

import java.util.Scanner;

public class CesarExample2 {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {

        String test;
        System.out.println("Введите текст:");
        Scanner in = new Scanner(System.in);
        test = in.nextLine().toString().toLowerCase();
        System.out.println("Введите шифт:");
        Integer shift = new Integer(in.nextLine().toString());

        System.out.println("Зашифрованный текст:");
        System.out.println(cesarExample(test, shift));
        System.out.println("-------------------");
        String text1 = cesarExample(test, shift);
        System.out.println("Расшифрованный текст:");
        System.out.println(cesarExample1(text1, shift));
    }

    public static String cesarExample(String text, Integer shift) {

        StringBuilder str = new StringBuilder(text);

        for (int i = 0; i<text.length(); i++) {
            char c = str.charAt(i);
            int aIndex = ALPHABET.indexOf(c);
            int replaceIndex = (aIndex + shift) % ALPHABET.length();
            char charToReplace = ALPHABET.charAt(replaceIndex);
            str.setCharAt(i, charToReplace);
        }
        return str.toString();
    }

    public static String cesarExample1(String text, Integer shift) {

        StringBuilder str1 = new StringBuilder(text);

        for (int i = 0; i<str1.length(); i++) {
            char c = str1.charAt(i);
            int aIndex = ALPHABET.indexOf(c);
            int replaceIndex;
            if (aIndex<shift)
            {
                replaceIndex = (aIndex+ALPHABET.length() - shift);
                if (replaceIndex>ALPHABET.length())
                    replaceIndex = replaceIndex % ALPHABET.length();
            }
            else {
                replaceIndex = (aIndex - shift) % ALPHABET.length();
            }
            char charToReplace = ALPHABET.charAt(replaceIndex);
            str1.setCharAt(i, charToReplace);
        }
        return str1.toString();
    }
}