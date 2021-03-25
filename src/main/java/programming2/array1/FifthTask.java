package programming2.array1;

import java.util.Arrays;
import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        initializeArray();
    }

    public static void initializeArray() {
        Scanner input = new Scanner(System.in);
        int[] list = new int[20];
        int[] list2 = new int[10];
        int[] list3 = new int[10];
        System.out.println("Введите 20 чисел для массива: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.arraycopy(list, 0, list2, 0, 10);
        for (int i = 10; i < list.length; i++) {
            list3[i - 10] = list[i];
        }
        for (int i = 0; i < list3.length; i++) {
            System.out.println(list3[i]);
        }
//        System.out.println(Arrays.toString(list3));
//        System.out.println(Arrays.toString(list));
//        System.out.println(Arrays.toString(list2));
    }
}

