package homeTasks2;

import java.util.Scanner;

public class DZ2_Scanner_CharToInt {

    public static void main(String[] args) {

       for (int i = 0; i < 100; i++)
       {
            System.out.println("Please, input your Char:");
            Scanner scanner = new Scanner(System.in); // Объявляем сканнер
            String s = scanner.nextLine().toString(); // получем введенную линию в String
            char d = s.charAt(0); // берем первый символ считанной строки
            int charToInt = (int) d; // переводим этот символ в его значение по ASCII
            System.out.println("answer: " + charToInt + " - this is the ASCII value of the symbol: " + s.charAt(0) + "\n" + "--------");
        }
/*
Написать программу которая переобразовывает char в int.
Считывает из консоли символ который вы вводите вручную (в консоль).
Переобразовывает символ в int. Выводит числовое значение символа.
*/
    }
}
