package programming2.primitivetype4;

import java.util.Scanner;

public class firstTask {
    public static void main(String[] args) {
        printHelloName();
//        String a = "Hello, ";
//        String b = "world!";
//        System.out.println(a + b);
//        System.out.println(a + с);
    }

    private static void printHelloName() {
        String a = "Hello, ";
        String b = "world!";
        Scanner input = new Scanner(System.in);
        System.out.println("Введите своё имя: ");
        String name = input.nextLine();
        System.out.println(a + b);
        System.out.println(a + String.format("%s!", name));
    }
}
