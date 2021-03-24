package programming2.transformation3;

import java.util.Scanner;

public class thirdTask {
    public static void main(String[] args) {
        round();
    }

    private static void round() {
        double n;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите вещественное число: ");
        n = input.nextDouble();
        System.out.println("Округлённое число: " + Math.round(n));
    }
}