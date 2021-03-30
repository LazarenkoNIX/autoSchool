package programming2.flowControl7;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = input.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s loves me %n", name);
        }
    }
}
