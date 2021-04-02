package programming2.flowControl7;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println("Input 4 numbers");
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[4];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println(max(arr1));
//        int max = Math.max(Math.max(input.nextInt(), input.nextInt()), Math.max(input.nextInt(), input.nextInt()));
//        System.out.println("Max of 4 numbers: " + max);
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