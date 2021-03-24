package programming2.primitivetype4;

import programming2.com.welcome.hello;

import java.util.Scanner;

public class firstTask2 {
    public static void main(String[] args) {
        System.out.println("Введите своё имя: ");
        Scanner input = new Scanner(System.in);
        hello hello = new hello(input.nextLine());
        hello.welcome();
        System.out.println("Hello world!");
        hello.byeBay();
    }
}
