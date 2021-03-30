package programming2.flowControl7;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int secret;
        boolean bol = false;
        secret = random.nextInt(20 + 1);
        System.out.println("Input number (0-20)");
        for (int i = 0; i < 7; i++) {
            int num = input.nextInt();
            if (secret == num) {
                System.out.println("Угадал");
                bol = true;
                break;
            } else if (secret < num) {
                System.out.println("Много");
            } else {
                System.out.println("Мало");
            }
        }
        if (!bol) {
            System.out.println("Не угадал");
        }
    }
}