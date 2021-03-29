package programming2.array1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        initializeArray();
    }

    public static void initializeArray() {
        Scanner input = new Scanner(System.in);
        Integer[] list = new Integer[10];
        System.out.println("Input 10 number for array: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, Collections.reverseOrder());
        System.out.println(Arrays.toString(list));
//        for (int i = 9; i > -1; i--) {
//            System.out.println(list[i]);
//
//        }
    }
}
