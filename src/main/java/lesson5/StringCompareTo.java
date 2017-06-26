package lesson5;


public class StringCompareTo {
    public static void main(String[] args) {

        String word1 = "ac";
        String word2 = "ab";
        String word3 = "ca";
        System.out.println(word1.compareTo(word2));
        System.out.println(word1.compareTo(word3));
        System.out.println("--------------");

        String int1 = "10";
        String int2 = "20";
        String int3 = "30";
        String int4 = "10";
        System.out.println(int1.compareTo(int2));
        System.out.println(int1.compareTo(int3));
        System.out.println(int1.compareTo(int4));

    }
}