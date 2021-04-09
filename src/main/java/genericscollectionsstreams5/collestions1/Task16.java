package genericscollectionsstreams5.collestions1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Task16 {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            System.out.printf("Input %s person surname %n", (i + 1));
            String surname = R.readLine();
            System.out.printf("Input %s person name%n", (i + 1));
            String name = R.readLine();
            map.put(surname, name);
        }
        Set<String> existing = new HashSet<>();
        map = map.entrySet()
                .stream()
                .filter(entry -> existing.add(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.printf("List of people without duplicates names: %s%n", map);
    }
}
