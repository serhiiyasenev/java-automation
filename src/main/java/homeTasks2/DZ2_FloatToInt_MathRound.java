package homeTasks2;


import java.util.Random;

public class DZ2_FloatToInt_MathRound
{
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++)
        {
        float min = 0.000f;
        float max = 9.999f;
        Random rand = new Random();
        float result= rand.nextFloat() * (max - min) + min;
        int round = Math.round(result);
        System.out.println("answer: " + round + " - this is the MathRound of " + result + "\n" + "--------");
        }
/*
В переменной n хранится натуральное трехзначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
*/
    }
}
