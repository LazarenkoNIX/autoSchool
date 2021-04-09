package genericscollectionsstreams5.collestions1;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("watermelon");
        set.add("banana");
        set.add("cherry");
        set.add("pear");
        set.add("melon");
        set.add("blackberries");
        set.add("ginseng");
        set.add("strawberries");
        set.add("iris");
        set.add("potatoes");

        for (String text : set) {
            System.out.println(text);
        }
    }
}
