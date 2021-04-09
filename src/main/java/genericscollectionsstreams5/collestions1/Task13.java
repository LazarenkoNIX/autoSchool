package genericscollectionsstreams5.collestions1;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task13 {
    public static void main(String[] args) throws IOException {
        Set<Integer> set = new HashSet<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.printf("Input %s number%n", (i + 1));
            set.add(input.nextInt());
        }
        set.removeIf(i -> i > 10);
//        for (Integer i : set) {
//            if (i > 10) {
//                set.remove(i);
//            }
//        }
        for (int result : set) {
            System.out.println(result);
        }
    }
}
