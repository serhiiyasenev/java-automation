package homeTasks6;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Input your FIRST number from 0 to 100:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toString();
        int userConsoleInt0 = new Integer(s);
        while (userConsoleInt0<0 || userConsoleInt0>100)
        {
            System.out.println("Input your FIRST number from 0 to 100:");
            scanner = new Scanner(System.in);
            s = scanner.nextLine();
            userConsoleInt0 = new Integer(s);
        }
        System.out.println("Input your SECOND number from 0 to 100:");
        String s1 = scanner.nextLine().toString();
        int userConsoleInt1 = new Integer(s1);
        while (userConsoleInt1<0 || userConsoleInt1>100)
        {
            System.out.println("Input your SECOND number from 0 to 100:");
            scanner = new Scanner(System.in);
            s1 = scanner.nextLine();
            userConsoleInt1 = new Integer(s1);
        }

        System.out.println("Input your ACTION: +, -, * or /");
        String s2 = scanner.nextLine().toString().trim();

        System.out.println(calc(userConsoleInt0, userConsoleInt1, s2));
    }

    public static double calc(int userConsoleInt0, int userConsoleInt1, String s2)
    {
        double result = 0;
        if (s2.equals("+")) {
            result = userConsoleInt0 + userConsoleInt1;
        }
        else if (s2.equals("-")) {
            result = userConsoleInt0 - userConsoleInt1;
        }
        else if (s2.equals("*")) {
            result = userConsoleInt0 * userConsoleInt1;
        }
        else if(s2.equals("/"))
        {
            if (userConsoleInt1 == 0)
            {
                System.out.println("Dividing by ZERO!");
            }
            else
            {
                result = userConsoleInt0 / userConsoleInt1;
            }
        }
        else
        {
            System.out.println("Input your ACTION: +, -, * or /");
        }
        return result;
    }
}