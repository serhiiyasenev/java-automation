package homeTasks4;

public class Integer10Numbers2 {


    /*Создайте массив, содержащий 10 первых нечетных чисел.
     Выведете элементы массива на консоль в одну строку, разделяя запятой.*/

    public static void main(String[] args) {

        int [] massive = new int[20];

        System.out.println("Заполнили и вывели массив: ");

        for (int i = 1; i < 20; i=i+2) {

            massive[i] = i;

            System.out.print(massive[i] + ", ");
		}
    }
}