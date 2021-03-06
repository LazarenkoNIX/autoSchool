package genericscollectionsstreams5.collestions1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();

        BufferedReader readLine = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            System.out.printf("Input %s line%n", (i+1));
            list.add(readLine.readLine());
        }

        int minStr = list.get(0).length();
        for (String str : list)
            if (str.length() < minStr)
                minStr = str.length();
        for (String str : list)
            if (str.length() == minStr)
                System.out.printf("Shortest line(s): %s%n", str);
    }
}
