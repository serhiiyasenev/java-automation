package homeTasks5;

import java.util.Scanner;

public class StringSum {
    public static void main(String[] args) {

        System.out.println("Input your numbers separated by commas:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toString();

        String[] stringArray = s.split(",");// Разбить строку на массив строк по символу ","

        int [] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) { // присвоить интовые значения
            intArray[i] = new Integer(stringArray[i]) ;
        }

        int sum = 0;
        for (int i =0; i<intArray.length; i++) { // просумировать массив

                 sum += intArray[i];
        }

        System.out.println("StringSum: " + sum);

    }
}