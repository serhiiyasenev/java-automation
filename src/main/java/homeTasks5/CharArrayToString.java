package homeTasks5;


import java.util.Arrays;

public class CharArrayToString {

    public static void main(String[] args) {

        String stringToDisplay = "";
        char[] charArrayToString = {'a','b','c','d'};
        for (int i=0; i<charArrayToString.length; i++){
            stringToDisplay += charArrayToString[i] + " ";
        }
        System.out.println(stringToDisplay);

        String stringToDisplay1;
        char[] charArrayToString1 = {'a','b','c','d'};
        stringToDisplay1 = Arrays.toString(charArrayToString1).replace(",", "").replace(" ", "").trim();

        System.out.println(stringToDisplay1);


    }
}

