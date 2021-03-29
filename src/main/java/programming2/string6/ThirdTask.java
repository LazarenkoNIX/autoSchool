package programming2.string6;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        initializeString();
    }

    public static void initializeString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input line with spaces: ");
        String str = input.nextLine();
        System.out.println(maxLength(str));
    }

    static String maxLength(String str) {
        String[] words = str.split(" ");
        String temp = "";
        for (String word : words) {
//            if (word.length() == temp.length())
//                temp = "";
//            else
                if (word.length() > temp.length())
                temp = word;
        }
        return (temp);
    }
}