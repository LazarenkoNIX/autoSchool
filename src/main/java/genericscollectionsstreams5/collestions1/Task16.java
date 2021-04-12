package genericscollectionsstreams5.collestions1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task16 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        map.put("Gagarin", "Viktor");
        map.put("Leonov", "Vladimir");
        map.put("Kalinin", "Mikhail");
        map.put("Voroshilov", "Konstantin");
        map.put("Voronov", "Ivan");
        map.put("Komarov", "Ivan");
        map.put("Zinchenko", "Vladimir");
        map.put("Shevchenko", "Aleksandr");
        map.put("Baturin", "Ivan");
        map.put("Golovko", "Mikhail");
        HashMap<String, String> map2 = new HashMap<>(map);
        HashMap<String, String> map3 = new HashMap<>(map);
//        BufferedReader readLine = new BufferedReader(new InputStreamReader(System.in));
//        for (int i = 0; i < 10; i++) {
//            System.out.printf("Input %s person surname %n", (i + 1));
//            String surname = readLine.readLine();
//            System.out.printf("Input %s person name%n", (i + 1));
//            String name = readLine.readLine();
//            map.put(surname, name);
//        }
//        Set<String> existing = new HashSet<>();
//        map = map.entrySet()
//                .stream()
//                .filter(entry -> existing.add(entry.getValue()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        System.out.printf("List of people without duplicates names: %s%n", map);
        for (Map.Entry<String, String> pair : map2.entrySet()) {
            map3.remove(pair.getKey());
            if (map3.containsValue(pair.getValue())) {
                HashMap<String, String> copy = new HashMap<>(map);
                for (Map.Entry<String, String> pair2 : copy.entrySet()) {
                    if (pair2.getValue().equals(pair.getValue()))
                        map.remove(pair2.getKey());
                }
            }
        }
        System.out.printf("List of people without duplicates names: %s%n", map);
    }
}
