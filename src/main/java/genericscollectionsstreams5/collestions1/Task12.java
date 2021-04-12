package genericscollectionsstreams5.collestions1;

import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task12 {
    public static void main(String[] args) throws IOException {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            int leftLimit = 97;
            int rightLimit = 122;
            int targetStringLength = 10;
            Random random = new Random();
            String generatedString = random.ints(leftLimit, rightLimit + 1)
                    .limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
//            System.out.println(generatedString);
            if (generatedString.startsWith("L") || generatedString.startsWith("l")) {
                set.add(generatedString);
            }
//            else {
//                System.out.println("Word does not start with L");
//            }
        }
        for (String result : set) {
            System.out.println(result);
        }
    }
}
