package programming2.flowControl7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input name ");
        input.nextLine();
        System.out.println("Input age");
        int a = input.nextInt();
        if (a > 20 && a > 0) {
            System.out.println("18 enough");
        }
    }
}