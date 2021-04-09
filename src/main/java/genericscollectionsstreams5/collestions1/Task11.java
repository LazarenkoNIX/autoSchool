package genericscollectionsstreams5.collestions1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();

        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            System.out.printf("Input %s line%n", (i + 1));
            list.add(R.readLine());
        }
        for (int i = 0; i < 13; i++) {
            list.add(0, list.get(4));
            list.remove(5);
        }
        for (String text : list) {
            System.out.println(text);
        }
    }
}
