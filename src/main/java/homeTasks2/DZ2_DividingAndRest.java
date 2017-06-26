package homeTasks2;


import java.util.Random;

public class DZ2_DividingAndRest
{
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++)
        {
        Random random = new Random();
        int q;
        q = random.nextInt(100);
        if (q<0)
            q=q*(-1);
        int w;
        w = random.nextInt(q);
            if (w<0)
                w=w*(-1);

        if (w > 0) {
            int qNAw;
            qNAw = q / w;
            int rest;
            rest = q % w;
            System.out.println("result " + i + ":" + "\n"
                    + "q = " + q
                    + "\n" + "w = " + w
                    + "\n" + "qNAw = " + qNAw
                    + "\n" + "rest = " + rest
                    + "\n" + "--------");
        }
        else
        {
            System.out.println("We cannot divide by 0" + "\n" + "--------");
        }
        }
/*
В переменных q и w хранятся два натуральных числа.
Создайте программу, выводящую на экран результат деления q на w с остатком.
Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):
21 / 8 = 2 и 5 в остатке
*/
    }
}
