package homeTasks5;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {

        System.out.println("Выберите необходимое действие:" + "\n" +
                "1.	Сравнить строки на равенство" + "\n" +
                "2.	Сравнить строки без учета регистра" + "\n" +
                "3.	Сравнить строки без учета пробелов между буквами\\словами:");
        Scanner scanner = new Scanner(System.in);
        String s0 = scanner.nextLine();
        int i = new Integer(s0);
        System.out.println("Input your first string:");
        scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Input your second string:");
        scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();

        switch (i)
        {
            case 1:
                boolean case1 = s.equals(s1);
                if (case1)
                {
                    System.out.println("Строки равны!");
                }
                else
                {
                    System.out.println("Строки НЕ равны!");
                }
                break;
            case 2:
                int case2 = s.compareToIgnoreCase(s1);
                if (case2==0)
                {
                    System.out.println("Строки равны!");
                }
                else
                {
                    System.out.println("Строки НЕ равны!");
                }
                break;
            case 3:
                int case3 = s.replaceAll(" ", "").compareTo(s1.replaceAll(" ", ""));
                if (case3==0)
                {
                    System.out.println("Строки равны!");
                }
                else
                {
                    System.out.println("Строки НЕ равны!");
                }
                break;
            default:
                System.out.println("This is not '1' or '2' and not '3' !");
                break;
        }
    }
}