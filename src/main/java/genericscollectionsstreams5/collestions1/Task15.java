package genericscollectionsstreams5.collestions1;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.*;

public class Task15 {
    public static void main(String[] args) throws IOException, ParseException {
//        Scanner scanner = new Scanner(System.in);
        Map<String, LocalDate> map = new HashMap<>();
        Set<String> tobeDeleted = new HashSet<>();
//        int yearApproved = 0;
//        int monthApproved = 0;
//        int dayApproved = 0;
        map.put("Gagarin", LocalDate.of(1992, 3, 2));
        map.put("Leonov", LocalDate.of(1975, 12, 28));
        map.put("Kalinin", LocalDate.of(1950, 9, 2));
        map.put("Voroshilov", LocalDate.of(1955, 7, 31));
        map.put("Voronov", LocalDate.of(1970, 6, 24));
        map.put("Komarov", LocalDate.of(1924, 7, 3));
        map.put("Zinchenko", LocalDate.of(1946, 8, 7));
        map.put("Shevchenko", LocalDate.of(1913, 5, 5));
        map.put("Baturin", LocalDate.of(1936, 4, 17));
        map.put("Golovko", LocalDate.of(1982, 1, 14));
//        BufferedReader readLine = new BufferedReader(new InputStreamReader(System.in));
//        for (int i = 0; i < 10; i++) {
//            System.out.printf("Input %s person surname:%n", (i + 1));
//            String surname = readLine.readLine();
//            int n = 0;
//            while (n < 20) {
//                System.out.printf("Input %s birthday year:%n", (i + 1));
//                int year = scanner.nextInt();
//                if (year >= 1900 && year <= 2021) {
//                    yearApproved = year;
//                    break;
//                } else {
//                    System.out.println("Incorrect year!");
//                    n++;
//                }
//            }
//            while (n < 20) {
//                System.out.printf("Input %s birthday month:%n", (i + 1));
//                int month = scanner.nextInt();
//                if (month >= 1 && month <= 12) {
//                    monthApproved = month;
//                    break;
//                } else {
//                    System.out.println("Incorrect month!");
//                    n++;
//                }
//            }
//            while (n < 20) {
//                System.out.printf("Input %s birthday day:%n", (i + 1));
//                int day = scanner.nextInt();
//                if (day >= 1 && day <= 31) {
//                    dayApproved = day;
//                    break;
//                } else {
//                    System.out.println("Incorrect day!");
//                    n++;
//                }
//            }
//            map.put(surname, LocalDate.of(yearApproved, monthApproved, dayApproved));
//        }
        for (Map.Entry<String, LocalDate> pair : map.entrySet()) {
            int month = pair.getValue().getMonthValue();
//            System.out.println(month);
            if (month >= 6 && month <= 8) {
                tobeDeleted.add(pair.getKey());
            }
        }
        for (String str : tobeDeleted) {
            map.remove(str);
        }
//        System.out.println(map);
    }
}
