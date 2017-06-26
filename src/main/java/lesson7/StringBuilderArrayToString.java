package lesson7;

public class StringBuilderArrayToString {
    public static void main(String[] args) {

        char[] charArrayToString = {'a','b','c','d'};
        StringBuilder builder = new StringBuilder();
        for (char value : charArrayToString) {
            builder.append(value);
        }
        System.out.println(builder);
    }
}