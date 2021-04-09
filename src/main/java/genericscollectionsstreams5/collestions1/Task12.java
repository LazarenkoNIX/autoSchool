package genericscollectionsstreams5.collestions1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Task12 {
    public static void main(String[] args) throws IOException {
        Set<String> set = new HashSet<>();

        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            System.out.printf("Input %s word that is beginning from L%n", (i + 1));
            String line = R.readLine();
            if (line.startsWith("L")) {
                set.add(line);
            } else if (line.startsWith("l")) {
                set.add(line);
            } else {
                System.out.println("Word does not start with L");
            }
        }
        for (String result : set) {
            System.out.println(result);
        }
    }
}
