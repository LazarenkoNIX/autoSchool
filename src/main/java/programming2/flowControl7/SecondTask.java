package programming2.flowControl7;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println("Input 4 numbers");
        Scanner input = new Scanner(System.in);
        int max = Math.max(Math.max(input.nextInt(), input.nextInt()), Math.max(input.nextInt(), input.nextInt()));
        System.out.println("Max of 4 numbers: " + max);
    }
}