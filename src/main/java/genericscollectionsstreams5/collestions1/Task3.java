package genericscollectionsstreams5.collestions1;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

        Map<String, Cat> map = new HashMap<>();

        map.put("Bars", new Cat("Bars"));
        map.put("Luck", new Cat("Luck"));
        map.put("Lui", new Cat("Lui"));
        map.put("Mew", new Cat("Mew"));
        map.put("Kitty", new Cat("Kitty"));
        map.put("Sam", new Cat("Sam"));
        map.put("William", new Cat("William"));
        map.put("Barbos", new Cat("Barbos"));
        map.put("Alisa", new Cat("Alisa"));
        map.put("Baks", new Cat("Baks"));

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            String key = pair.getKey();
            Cat value = pair.getValue();
            System.out.printf("%s - %s%n", key, value);
        }
    }
}
