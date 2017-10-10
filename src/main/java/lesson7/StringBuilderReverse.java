package lesson7;


import java.util.Scanner;

public class StringBuilderReverse {
    public static void main(String[] args) {

        System.out.println ("Enter your string:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        StringBuilder builder = new StringBuilder(string);
        System.out.println("\n" + "Reversed string: " + builder.reverse());


    }
}