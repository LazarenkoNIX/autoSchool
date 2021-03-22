package programming2.transformation3;

import java.util.Scanner;

public class fourthTask {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        a = getA(input);
        b = getA(input);
        c = getA(input);
        int A = a, B = b, C = c;
        a = changeA(A, B);
        b = changeB(A, C);
        c = changeC(A, B, C);
        System.out.println("Новое значение a: " + a);
        System.out.println("Новое значение b: " + b);
        System.out.println("Новое значение c: " + c);
    }

    private static int getA(Scanner input) {
        int a;
        System.out.println("Введите целое число: ");
        a = input.nextInt();
        return a;
    }

    private static int changeA(int a, int b) {
        return a + b;
    }

    private static int changeB(int a, int c) {
        return c - a;
    }

    private static int changeC(int a, int b, int c) {
        return a + b + c;
    }
}
