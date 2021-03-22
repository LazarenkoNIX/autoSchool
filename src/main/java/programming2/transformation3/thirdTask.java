package programming2.transformation3;

import java.util.Scanner;

public class thirdTask {
    public static void main(String[] args) {
        double n;
        Scanner input = new Scanner(System.in);
        n = getA(input);
        System.out.println("Сумма цифр двузначного числа: " + Math.round(n));
    }

    private static double getA(Scanner input) {
        double a;
        System.out.println("Введите вещественное число: ");
        a = input.nextDouble();
        return a;
    }
}