package lesson4;


public class ReturnSum {

    public static int sum(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    public static void main(String[] args) {
        int sum = sum(4, 5);
        System.out.println(sum);
    }


}