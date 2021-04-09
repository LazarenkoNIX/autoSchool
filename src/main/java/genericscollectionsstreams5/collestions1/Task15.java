package genericscollectionsstreams5.collestions1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.*;

public class Task15 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(System.in);
        Map<String, LocalDate> map = new HashMap<>();
        Set<String> tobeDeleted = new HashSet<>();
        int yearApproved = 0;
        int monthApproved = 0;
        int dayApproved = 0;
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            System.out.printf("Input %s person surname %n", (i + 1));
            String surname = R.readLine();
            System.out.printf("Input %s birthday year%n", (i + 1));
            int year = scanner.nextInt();
            boolean a, b, c;
            while (true){
                if (year >= 1900 && year <= 2021) {
                    yearApproved = year;
                } else {
                    System.out.println("Incorrect year");
                    break;
                }
            }
            System.out.printf("Input %s birthday month%n", (i + 1));
            int month = scanner.nextInt();
            while (true) {
                if (month >= 1 && month <= 12) {
                    monthApproved = month;
                    break;
                } else {
                    System.out.println("Incorrect month");
                }
            }
            System.out.printf("Input %s birthday day%n", (i + 1));
            int day = scanner.nextInt();
            while (true) {
                if (day >= 1 && day <= 31) {
                    dayApproved = day;
                    break;
                } else {
                    System.out.println("Incorrect day");
                }
            }
            map.put(surname, LocalDate.of(yearApproved, monthApproved, dayApproved));
        }
        for (Map.Entry<String, LocalDate> pair : map.entrySet()) {
//            String key = pair.getKey();
//            LocalDate value = pair.getValue();
            int month = pair.getValue().getMonthValue();
            System.out.println(month);
            if (month >= 6 && month <= 8) {
                tobeDeleted.add(pair.getKey());
            }
//            System.out.printf("%s - %s%n", key, value);
        }
        for (String str : tobeDeleted) {
            map.remove(str);
        }
        System.out.println(map);
    }
}
