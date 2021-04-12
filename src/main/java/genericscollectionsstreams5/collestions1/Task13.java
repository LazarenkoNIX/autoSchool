package genericscollectionsstreams5.collestions1;

import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task13 {
    public static void main(String[] args) throws IOException {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            set.add(random.nextInt());
        }
        set.removeIf(i -> i > 10);
        for (int result : set) {
            System.out.println(result);
        }
    }
}
