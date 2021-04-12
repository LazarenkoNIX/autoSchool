package genericscollectionsstreams5.collestions1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();

        BufferedReader readLine = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            System.out.printf("Input %s line%n", (i + 1));
            list.add(readLine.readLine());
        }
        for (int i = 0; i < 2; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
        for (String text : list) {
            System.out.println(text);
        }
    }
}
