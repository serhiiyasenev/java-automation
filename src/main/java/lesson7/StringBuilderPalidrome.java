package lesson7;


import java.util.Scanner;

public class StringBuilderPalidrome {
    public static void main(String[] args) {

        System.out.println ("Enter your WORD");
        Scanner scanner = new Scanner(System.in);
        String palindrome = scanner.nextLine();

        StringBuilder builder = new
                StringBuilder(palindrome);
        builder.reverse();                          // метод для реверса строки
        if (palindrome.equalsIgnoreCase(builder.toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");


    }
}