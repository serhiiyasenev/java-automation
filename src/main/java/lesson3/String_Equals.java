package lesson3;

public class String_Equals {
    public static void main(String[] args) {

       String str1 = new String("Привет");
       String str2 = new String("Приве");
       String sameStr = str1;

       boolean b1 = str1 == str2; // b1 - false, потому что это два разных объекта
       boolean b2 = str1.equals(str2); // b2 - true, потому что значения одинаковые
       boolean b3 = str1 == sameStr; // b3 - true, потому что эти 2 объекта есть один и тот же объект

        // "==" - можем сравнивать только примиивные типы: int, char, double, float
        // классы обёртки через equals
    }
}
