package programming2.flowControl7;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        initializeArray();
    }

    public static void initializeArray() {
        Scanner input = new Scanner(System.in);
        int[] list = new int[3];
        System.out.println("Input 3 number: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        sort(list);
        for (int j : list) {
            System.out.println(j + " ");
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] < array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}