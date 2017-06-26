package homeTasks5;
import java.util.Random;
import java.util.Scanner;

public class GameRandomNumbers
{
    public static void main(String[] args) {

        Random random = new Random();
        int programRandonInt = random.nextInt(90) + 10;
        int pcRandonInt = random.nextInt(90) + 10;

        System.out.println("Input your umber from 0 to 100:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toString();
        int userConsoleInt = new Integer(s);
        if (userConsoleInt<0 || userConsoleInt>100)
        {
            System.out.println("Input your umber from 0 to 100:");
            scanner = new Scanner(System.in);
            s = scanner.nextLine();
            userConsoleInt = new Integer(s);
        }

        int a = programRandonInt - userConsoleInt;
        if (a<0) a = a*(-1);
        int b = programRandonInt - pcRandonInt;
        if (b<0) b = b*(-1);
        if  (a < b)
        {
            System.out.println("Победил Игрок!" + "\n" +
                    "Программа = " + programRandonInt + "\n" +
                    "Игрок = " + userConsoleInt + "\n" +
                    "Компьютер = " + pcRandonInt);
        }
        else if (a == b)
        {
            System.out.println("Числа Программы и Игрока РАВНЫ!" + "\n" +
                    "Программа = " + programRandonInt + "\n" +
                    "Игрок = " + userConsoleInt + "\n" +
                    "Компьютер = " + pcRandonInt);
        }
        else
        {
            System.out.println("Победил Компьютер!" + "\n" +
                    "Программа = " + programRandonInt + "\n" +
                    "Игрок = " + userConsoleInt + "\n" +
                    "Компьютер = " + pcRandonInt);
        }
/*
1.	Программа генерирует рандомное число в диапазоне от 0 до 100
2.	Юзер из консоли вбивает целое число в пределах этого диапазона (проверять что оно в пределах!)
3.	Компьютер 1(тоже игрок) генерирует рандомное число от 0 до 100 себе.
4.	Победа достается тому (игроку или компьютеру1) у кого число ближе к сгенерированому изначально
Пример:
	Программа (игра) сгенерировала число 7
	Игрок ввел в консоль число 20
	Компьютер 1 сгенерировал число 90
Результат: Победил Игрок! Программа = 7, Игрок = 20, Компьютер 1 = 90
*/
    }
}