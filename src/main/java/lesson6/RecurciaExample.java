package lesson6;


public class RecurciaExample {

    public static int fact(int n) {
        int result;
        if (n == 1) {
            return 1;
        } else {
            result = fact(n - 1) * n;
        }
        return result;
    }

    public static void main(String[] args) {

        int n = 3;
        System.out.println(fact(n));
    }
}

