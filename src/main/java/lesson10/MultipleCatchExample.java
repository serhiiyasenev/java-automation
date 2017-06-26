package lesson10;

import java.util.Scanner;

public class MultipleCatchExample {

    public static void main(String[] args) {

        System.out.println("Введите Ваше число:");
        int[] m = {-1, 0, 1};
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            m[a] = 4 / a;
        }
        catch (ArithmeticException e) {
            System.out.println("Произошла недопустимая арифеметическая операция");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обращение по недопустимому индексу масива");
        }
        catch (Exception e) {
            System.out.println("Произошло ещё какое-то исключение");
        }
    }
}