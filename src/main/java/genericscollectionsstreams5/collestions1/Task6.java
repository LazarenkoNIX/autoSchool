package genericscollectionsstreams5.collestions1;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        map.put("watermelon", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        map.put("pear", 4);
        map.put("melon", 5);
        map.put("blackberry", "bush");
        map.put("ginseng", "root");
        map.put("strawberry", "berry");
        map.put("iris", "flower");
        map.put("potato", "tuber");

        for (Map.Entry<String, Object> pair : map.entrySet()) {
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.printf("%s - %s%n", key, value);
        }
    }
}
