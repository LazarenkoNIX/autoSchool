package programming2.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class thirdTask {
    public static void main(String[] args) throws IOException {
        initializeStringArray();
    }

    public static void initializeStringArray() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        String[] listStr = new String[10];
        int[] listInt = new int[10];
        System.out.println("Введите 10 строк для массива: ");
        for (int i = 0; i < listStr.length; i++) {
            listStr[i] = reader.readLine();
            listInt[i] = listStr[i].length();
        }
        for (int i = 0; i < listInt.length; i++) {
            System.out.print(listInt[i]);
            System.out.println(String.format(" %s", i));
        }
    }
}