package genericscollectionsstreams5.collestions1;

import java.util.HashMap;
import java.util.Map;

public class Task17 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Petrov", "Vladimir");
        map.put("Vorobiov", "Viktor");
        map.put("Miranchuk", "Vitalij");
        map.put("Kalinin", "Vitalij");
        map.put("Kalinichenko", "Vitalij");
        map.put("Miranchuk", "Viktor");
        map.put("Miranchuk", "Vladimir");
        map.put("Kalinin", "Vladimir");
        map.put("Petrov", "Viktor");
        map.put("Voroshilov", "Maksim");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.printf("%s - %s%n", key, value);
        }
    }
}
