package programming2.string6;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        initializeString();
    }

    public static void initializeString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = input.nextLine();
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.substring(0, str.indexOf('.') + 1));
        int spaceCount = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        System.out.println(spaceCount);
    }
}
