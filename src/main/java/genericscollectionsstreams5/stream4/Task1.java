package genericscollectionsstreams5.stream4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("qwerty");
            list.add("Dinamo");
            list.add("Alladin");
            list.add("Plane");
        }
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Press Enter to input 10 empty elements: %n");
        String str = R.readLine();
        for (int i = 0; i < 10; i++) {
            list.add(str);
        }
        System.out.printf("Length of each element: %s%n", list.stream()
                .mapToInt(String::length)
                .boxed()
                .collect(Collectors.toList()));
        list.stream()
                .filter(item -> item != null && !"".equals(item) && !item.contains("d")) //&& !item.contains("D"))
                .sorted()
                .forEach(System.out::println);
//        System.out.println(list.size());
    }
}
