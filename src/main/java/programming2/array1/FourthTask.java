package programming2.array1;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        initializeArray();
    }

    public static void initializeArray() {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];
        System.out.println("Введите 10 чисел для массива: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        for (int i = 9; i > -1; i--) {
            System.out.println(list[i]);
        }
    }
}
