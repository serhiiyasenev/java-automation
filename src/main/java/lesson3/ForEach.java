package lesson3;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Петя");
        names.add("Коля");
        names.add("Вася");

        for (String name: (names))
        {
            System.out.println (name);
        }
    }
}
