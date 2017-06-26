package lesson3;

public class If_Else {
    public static void main(String[] args) {

       boolean b = true;
        if (b)
        {
            System.out.println("b - истина");
        }
        else
        {
            System.out.println("b - ложь");
        }
        int a = 4;
        int a1 = 5;

        boolean result = a != a1; // не равно
        System.out.println(result);

        result =! result; // преобразование
        System.out.println(result);
    }
}
