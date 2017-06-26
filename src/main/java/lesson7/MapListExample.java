package lesson7;

import java.util.*;

public class MapListExample {

    public static void main(String[] args)
    {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("first", "Mama");
        map.put("second", "Mila");
        map.put("third", "Ramu");
        System.out.println("Map");
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ": " + value);
        }
        System.out.println("Map1");
        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("first", "Mama");
        map1.put("second", "Mila");
        map1.put("third", "Ramu");
        Iterator<Map.Entry<String, String>> iterator = map1.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ": " + value);
        }

    }
}