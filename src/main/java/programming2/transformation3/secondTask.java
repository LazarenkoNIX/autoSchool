package programming2.transformation3;

import java.util.Scanner;

public class secondTask {
    public static void main(String[] args) {
        int n;
//        int sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите двузначное число: ");
        n = input.nextInt();
        if (n > 9 && n < 100) {
//            sum = n % 10 + n / 10;
            System.out.println("Сумма цифр двузначного числа: " + (n % 10 + n / 10));
        } else
            System.out.println("Введённое число не дузначное");
    }
}
