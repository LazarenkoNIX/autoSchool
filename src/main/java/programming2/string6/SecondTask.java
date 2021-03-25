package programming2.string6;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        initializeString();
    }

    public static void initializeString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = input.nextLine();
        System.out.println("Введите подстроку для замены: ");
        String str1 = input.nextLine();
        System.out.println("Введите новую подстроку: ");
        String str2 = input.nextLine();
        if (str.contains(str1)) {
            System.out.println(str.replace(str1, str2));
        } else
            System.out.println("Строка не содержит подстроку");
    }
}
