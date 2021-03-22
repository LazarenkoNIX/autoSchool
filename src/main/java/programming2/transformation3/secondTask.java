package programming2.transformation3;

import java.util.Scanner;

public class secondTask {
    public static void main(String[] args) {
        int n;
        int sum;
        Scanner input = new Scanner(System.in);
        n = getA(input);
        if (n > 9 && n < 100) {
            sum = n % 10 + n / 10;
            System.out.println("Сумма цифр двузначного числа: " + sum);
        } else
            System.out.println("Введённое число не дузначное");
    }

    private static int getA(Scanner input) {
        int a;
        System.out.println("Введите двузначное число: ");
        a = input.nextInt();
        return a;
    }
}
