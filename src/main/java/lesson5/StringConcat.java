package lesson5;


public class StringConcat {
    public static void main(String[] args) {

        String s1 = "first string";
        String s2 = " and second string";
        s1 += s2;
        System.out.println("Concat string example: " + s1);
        s1 = "1";
        s2 = " and 2";
        s1 = s1.concat(s2);
        System.out.println("Another concat string example: " + s1);
    }
}