package programming2.flowControl7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Input 2 names");
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        if (name1.equals(name2)) {
            System.out.println("Names are the same");
        } else if (name1.length() == name2.length()) {
            System.out.println("Names length are the same");
        }
    }
}
