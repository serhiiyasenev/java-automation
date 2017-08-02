package lesson9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveAllExample {

    public static void main(String[] args) {
        List<String> col = new ArrayList();
// Добавление в коллекцию
        col.add("1s");
        col.add("2asa");
        col.add("3aaa");
        col.add("4aaa");
        col.add("5");
        col.add("6");
        col.add("7");
        // Удаление через итератор
        Iterator<String> iter = col.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            if (s.contains("s")) {
                iter.remove();
            }
        }
        Iterator<String> iterNew = col.listIterator();
        while (iterNew.hasNext()) {
            System.out.println(iterNew.next());
        }
        for( String entry : col ){
            System.out.print( entry + ", " );
        }
    }
}