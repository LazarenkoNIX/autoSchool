package programming2.array1;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        initializeArray();
    }

    public static void initializeArray() {
        Scanner input = new Scanner(System.in);
        int[] list = new int[20];
        System.out.println("Введите 20 чисел для массива: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.println(max(list));
    }

    private static int max(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
