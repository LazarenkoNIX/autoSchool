package programming2.flowControl7;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input m: ");
        int m = input.nextInt();
        System.out.print("Input n: ");
        int n = input.nextInt();
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
