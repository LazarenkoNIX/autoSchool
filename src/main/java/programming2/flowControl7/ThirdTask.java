package programming2.flowControl7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        initializeArray();
    }

    public static void initializeArray() {
        Scanner input = new Scanner(System.in);
        Integer[] list = new Integer[3];
        System.out.println("Input 3 number: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        Arrays.sort(list, Collections.reverseOrder());
        System.out.println(Arrays.toString(list));
    }
}
