package homeTasks2;


import java.util.Random;

public class DZ2_n_100_999_sum
{
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++)
        {
        Random random = new Random();
        int n = random.nextInt(899) + 100;
        int sum = (n / 100) + (n % 100) / 10 + (n % 10);

            System.out.println("v 1: " + sum + " - this is the sum of digits of " + n + "\n" + "--------");
        }
/*
В переменной n хранится натуральное трехзначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
*/
    }
}
