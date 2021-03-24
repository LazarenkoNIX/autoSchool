package programming2.transformation3;

import java.util.Scanner;

public class fourthTask {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        a = getA(input);
        b = getA(input);
        c = getA(input);
        int tempA = a, tempB = b, tempC = c;
        a = changeA(tempA, tempB);
        b = changeB(tempA, tempC);
        c = changeC(tempA, tempB, tempC);
        System.out.println("Новое значение a: " + a);
        System.out.println("Новое значение b: " + b);
        System.out.println("Новое значение c: " + c);
    }

    private static int getA(Scanner input) {
        System.out.println("Введите целое число: ");
        return input.nextInt();
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
