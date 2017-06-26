package homeTasks4;

import java.util.Scanner;

public class ArrayReplace {

    public static void main(String[] args) {
        double average;

        int[] matrixA = createArray();                                          //Создали массив;

        System.out.print("Массив А:\n");
        printArray(matrixA);                                                    //Вывели массив;

        System.out.print("Максимальный и минимальный элементы массива А:\n");
        min_max(matrixA);                                                       //Поменяли местами Min и Max;

        System.out.print("Массив А(после 'глупой' сортировки):\n");
        sortArray(matrixA);                                                     //Отсортировали массив;
        printArray(matrixA);                                                    //Вывели отсортироанный массив;

        System.out.println("Среднее арифметическое массива А:");
        System.out.println(averageElements(matrixA));                           //Посчитали среднее арифметическое;
    }

    public static int[] createArray() {                                         //Метод создает массив;
        int a;

        Scanner in = new Scanner(System.in);
        System.out.print("Сколько елементов в массиве: ");
        a = in.nextInt();

        int[] array = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.print("Введите элемент Array[" + (i + 1) + "]: ");
            array[i] = in.nextInt();
        }
        return array;
    }

    public static void printArray(int[] a) {                                    //Метод распечатывает массив;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    public static void min_max(int[] a) {                                       //Метод находит и меняет местами Min и Max елементы;
        int max = a[0];
        int min = a[0];
        int min_Ind = 0;
        int max_Ind = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                max_Ind = i;
            }
            if (a[i] < min) {
                min = a[i];
                min_Ind = i;
            }
        }
        System.out.println("Max element = " + max);
        System.out.println("Индекс Max елемента в массиве: " + (max_Ind + 1));
        System.out.println("Min element = " + min);
        System.out.println("Индекс Min елемента в массиве: " + (min_Ind + 1));

        int swap = a[min_Ind];
        a[min_Ind] = a[max_Ind];
        a[max_Ind] = swap;
        System.out.println("Массив после перестановки Min и Max местами: ");
        printArray(a);
    }

    public static void sortArray(int[] a) {                                     //Метод сортирует массив;
        int i = 0, tmp;
        while (i < a.length - 1) {
            if (a[i + 1] < a[i]) {
                tmp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = tmp;
                i = 0;
            } else i++;
        }
    }

    private static double averageElements(int[] a) {                            //Метод считает среднее арифм. массива;
        double average = 0;
        if (a.length > 0) {
            double sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            average = sum / a.length;
        }
        return average;
    }
}