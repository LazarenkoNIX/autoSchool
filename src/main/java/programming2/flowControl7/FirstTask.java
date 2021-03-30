package programming2.flowControl7;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        System.out.println("Input 2 numbers");
        Scanner input = new Scanner(System.in);
        System.out.println("Min of 2 numbers = " + min(input.nextInt(), input.nextInt()));
    }

    static int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}