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
        for (int i = 0; i < 10; i++) {
            System.out.printf("Input %s person surname:%n", (i + 1));
            String surname = R.readLine();
            while (true) {
                System.out.printf("Input %s birthday year:%n", (i + 1));
                int year = scanner.nextInt();
                if (year >= 1900 && year <= 2021) {
                    yearApproved = year;
                    break;
                } else {
                    System.out.println("Incorrect year!");
                }
            }
            while (true) {
                System.out.printf("Input %s birthday month:%n", (i + 1));
                int month = scanner.nextInt();
                if (month >= 1 && month <= 12) {
                    monthApproved = month;
                    break;
                } else {
                    System.out.println("Incorrect month!");
                }
            }
            while (true) {
                System.out.printf("Input %s birthday day:%n", (i + 1));
                int day = scanner.nextInt();
                if (day >= 1 && day <= 31) {
                    dayApproved = day;
                    break;
                } else {
                    System.out.println("Incorrect day!");
                }
            }
            map.put(surname, LocalDate.of(yearApproved, monthApproved, dayApproved));
        }
        for (Map.Entry<String, LocalDate> pair : map.entrySet()) {
            int month = pair.getValue().getMonthValue();
            System.out.println(month);
            if (month >= 6 && month <= 8) {
                tobeDeleted.add(pair.getKey());
            }
        }
        for (String str : tobeDeleted) {
            map.remove(str);
        }
        System.out.println(map);
    }
}
