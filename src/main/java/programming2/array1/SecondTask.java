package programming2.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class SecondTask {
    public static void main(String[] args) throws IOException {
        initializeArray();
    }

    public static void initializeArray() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        String[] list = new String[10];
        System.out.println("Введите 8 строк для массива: ");
        for (int i = 0; i < 8; i++) {
            list[i] = reader.readLine();
        }
        for (int i = 9; i > -1; i--) {
            System.out.println(list[i]);
        }
    }
}
