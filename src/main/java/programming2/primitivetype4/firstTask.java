package programming2.primitivetype4;

import java.util.Scanner;

public class firstTask {
    public static void main(String[] args) {
        String a = "Hello, ";
        String b = "world!";
        System.out.println(a + b);
        String с = printHelloName();
        System.out.println(a + с);
    }

    private static String printHelloName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите своё имя: ");
        String name = input.nextLine() + '!';
        return name;
    }
}
