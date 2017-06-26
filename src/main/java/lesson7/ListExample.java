package lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListExample {

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<String>();
        list.add("user.name");
        list.add("user.email");
        list.add("user.password");
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("Mama");
        list1.add("Mila");
        list1.add("Ramu");
        Iterator<String> iterator = list.iterator();
        System.out.println("-------list-------");
        while (iterator.hasNext())
        {
            String text = iterator.next();
            System.out.println(text);
        }
        System.out.println("-------list1-------");
        for (String text1 : list1)
        {
            System.out.println(text1);
        }
    }
}