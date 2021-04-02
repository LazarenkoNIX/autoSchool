package programming2.flowControl7;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input line: ");
        String line = input.nextLine();
        System.out.print("Input number of iteration: ");
        int i = 0;
        int num = input.nextInt();
        if (num > 0) {
            do {
                i++;
                System.out.println(line);
            }
            while (i < num);
        }
    }
}