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
//        Integer[] list = new Integer[3];
        System.out.println("Input 3 number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a >= b && b >= c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a >= c && c >= b) {
            System.out.println(a + " " + c + " " + b);
        } else if (c >= a && a >= b) {
            System.out.println(c + " " + a + " " + b);
        } else if (c >= b && b >= a) {
            System.out.println(c + " " + b + " " + a);
        } else if (b >= a && a >= c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b >= c && c >= a) {
            System.out.println(b + " " + c + " " + a);
        }
        //        for (int i = 0; i < list.length; i++) {
//            list[i] = input.nextInt();
//        }
//        Arrays.sort(list, Collections.reverseOrder());
//        System.out.println(Arrays.toString(list));
    }

}