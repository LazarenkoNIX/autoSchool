package genericscollectionsstreams5.collestions1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>(10);

        BufferedReader readLine = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            System.out.printf("Input %s line%n", (i + 1));
            list.add(0, (readLine.readLine()));
        }

        for (String text : list) {
            System.out.println(text);
        }
    }
}
