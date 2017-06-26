package homeTasks4;

import java.lang.reflect.Array;

public class MinMaxValueFromArray {
    /*Дан массив размерности N,  найти наименьший элемент массива и
    вывести на консоль (если наименьших элементов несколько — вывести их все).
    Тоже самое для наибольнего*/

    public static void main(String[] args) {

        int [] massive = {-1, -1, 2, 10, 15, 55, 22, 56, 11, 113, 155, 155};
        int min = 0;
        int max = 0;

        System.out.println("Вывели минимальные значения с массива: ");
        for (int i = 0; i < massive.length; i++) {

            if (massive[i] < min) {
                min = massive[i];
            }
        }
        System.out.println(min + " ");

		System.out.println("Вывели все максимальные значения с массива: ");
        for (int i = 0; i < massive.length; i++) {

            if (massive[i] > max) {
                max = massive[i];
            }
        }
        System.out.println(max + " ");
    }
}