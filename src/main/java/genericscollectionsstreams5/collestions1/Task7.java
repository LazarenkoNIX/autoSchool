package genericscollectionsstreams5.collestions1;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Nokia");
        list.add("Samsung");
        list.add("Sony Erricsson");
        list.add("Oppo");
        list.add("Meizu");

        System.out.printf("Array size = %s%n", list.size());

        for (String text : list) {
            System.out.println(text);
        }
    }
}
