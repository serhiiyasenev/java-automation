package homeTasks2;


import java.util.Random;

public class DZ2_n_10_99_sum
{
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++)
        {
        Random random = new Random();
        int n = random.nextInt(89) + 10;
        int  sum = 0;
        int n1 = n;
            while(n1 != 0)
            {
                //Суммирование цифр числа
                sum = sum + (n1 % 10);
                n1 = n1 / 10;
            }
        int sum1 = (n/10) + (n % 10);

            System.out.println("v 1: " + sum + " - this is the sum of digits of " + n + "\n" + "--------");
            System.out.println("v 2: "+ sum1 + " - this is the sum of digits of " + n + "\n" + "--------");
        }
/*
В переменной n хранится натуральное двузначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
*/
    }
}
