package lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class StringSplitWordsExample {
    public static void main(String[] args) {

        System.out.println ("Enter words using whitespace delimiter");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split(" ");
        for (int i = 0; i < splittedStringArray.length; i++)
            splittedStringArray[i] = splittedStringArray[i];
        System.out.println(Arrays.toString(splittedStringArray).replace("[", "").replace("]", ""));
        System.out.println(Arrays.toString(splittedStringArray));
    }
}