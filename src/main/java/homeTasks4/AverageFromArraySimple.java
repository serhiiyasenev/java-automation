package homeTasks4;

public class AverageFromArraySimple {
	
    /*Найти среднее арифметическое всех элементов массива.*/

        public static void main(String[] args) {

			int[] array = {11, 16, 19, 937, -100, -200, - 300, 14, 22, 36, 41, 42, 53, 52, 62};

            double average;
            double sum = 0;

            for (int i = 0; i < array.length; i++)
            {
                sum += array[i];
            }
            average = sum / array.length;

            System.out.println(average);
        }
    }


