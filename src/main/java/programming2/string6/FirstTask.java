package programming2.string6;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        initializeString();
    }

    public static void initializeString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input line: ");
        String str = input.nextLine();
        System.out.println("First letter " + str.charAt(0));
        System.out.println("Last letter " + str.charAt(str.length() - 1));
        System.out.println("Line before . " + str.substring(0, str.indexOf('.') + 1));
        if (str.length() % 2 != 0) {
            System.out.println("Middle letter " + str.charAt(str.length() / 2));
        }
        int spaceCount = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Count of spaces: " + spaceCount);
    }
}