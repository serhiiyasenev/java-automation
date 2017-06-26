package homeTasks5;

import java.util.Scanner;

public class StringTrim {
    public static void main(String[] args) {

        String helloString = "Hello World !";
        System.out.println("StringTrim: " + helloString.replaceAll(" ", ""));
        String[] stringArray = helloString.split(" ");// Разбить строку на массив строк по символу " " (пробел);
        char c = helloString.charAt(4);// Вытащить символ по индексу 4 (позиция 4);
        int a = helloString.codePointAt(4);// UNICODE символа по 4му индексу;

        for (String name: (stringArray)) {
            System.out.println("StringArrays: " + name);
        }

        System.out.println("StringChar: " + c);
        System.out.println("StringInt: " + a);


        /*Input String from keyboard.
        If word “new” is present in string – print part of the string after this word.
        Example: in = “Brave new world” out = “ world”*/

        System.out.println("Input your sentence");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toString();

        String keyword = "new";

        if (s.contains(keyword))
        {
            int i = s.indexOf(keyword) + keyword.length();
            System.out.println(s.substring(i).trim());
        }
        else
        {
            System.out.println(s);
        }



    }
}