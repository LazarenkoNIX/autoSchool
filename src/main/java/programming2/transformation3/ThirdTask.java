package programming2.transformation3;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        round();
    }

    private static void round() {
        System.out.println("Введите вещественное число: ");
        System.out.println("Округлённое число: " + Math.round(new Scanner(System.in).nextDouble()));
    }
}