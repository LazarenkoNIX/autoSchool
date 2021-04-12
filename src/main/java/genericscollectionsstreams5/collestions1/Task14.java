package genericscollectionsstreams5.collestions1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task14 {
    public static void main(String[] args) throws IOException {
//        String checkSurname = "Lavrov";
        String checkName = "Mikhail";
        int countName = 0;
//        int countSurname = 0;

        Map<String, String> map = new HashMap<>();
        map.put("Gagarin", "Viktor");
        map.put("Leonov", "Vladimir");
        map.put("Kalinin", "Mikhail");
        map.put("Voroshilov", "Kosantin");
        map.put("Voronov", "Ivan");
        map.put("Komarov", "Ivan");
        map.put("Zinchenko", "Vladimir");
        map.put("Shevchenko", "Aleksandr");
        map.put("Baturin", "Miron");
        map.put("Golovko", "Mikhail");
//        BufferedReader readLine = new BufferedReader(new InputStreamReader(System.in));
//        for (int i = 0; i < 10; i++) {
//            System.out.printf("Input %s person surname %n", (i + 1));
//            String surname = readLine.readLine();
//            if (surname.equals(checkSurname)) {
//                countSurname++;
//            }
//            System.out.printf("Input %s person name%n", (i + 1));
//            String name = readLine.readLine();
//            if (name.equals(checkName)) {
//                countName++;
//            }
//            map.put(surname, name);
//        }
        for (Map.Entry<String, String> pair : map.entrySet()) {
//            String key = pair.getKey();
//            String value = pair.getValue();
//            if (pair.getKey().equals(checkSurname)) {
//                countS++;
//            }
            if (pair.getValue().equals(checkName)) {
                countName++;
            }
//            System.out.printf("%s - %s%n", key, value);
        }
//        System.out.printf("Surname repeated %s times%n", countSurname);
        System.out.printf("%s people have the same name%n", countName);
    }
}
