package genericscollectionsstreams5.collestions1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();

        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            System.out.printf("Input %s line%n", (i+1));
            list.add(R.readLine());
        }

        int maxStr = list.get(0).length();
        for (String str : list)
            if (str.length() > maxStr)
                maxStr = str.length();
        for (String str : list)
            if (str.length() == maxStr)
                System.out.printf("Longest line(s): %s%n", str);
    }
}
