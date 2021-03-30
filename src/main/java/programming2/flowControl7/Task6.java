package programming2.flowControl7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input name ");
        input.nextLine();
        System.out.println("Input age");
        if (input.nextInt() > 20) {
            System.out.println("18 enough");
        }
    }
}