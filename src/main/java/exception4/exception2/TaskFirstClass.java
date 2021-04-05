package exception4.exception2;

import java.util.Scanner;

public class TaskFirstClass {
    public static void main(String[] args) throws InterruptedException {
        initializeArray();
    }

    public static void initializeArray() throws InterruptedException {
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
        Thread.sleep(3000);
        int zero = 5/0;
        for (int j : list3) {
            System.out.println(j);
        }
    }
}
