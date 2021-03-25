package programming2.primitivetype4;

import programming2.com.welcome.Hello;

import java.util.Scanner;

public class FirstTask2 {
    public static void main(String[] args) {
        System.out.println("Введите своё имя: ");
        Scanner input = new Scanner(System.in);
        Hello hello = new Hello(input.nextLine());
        hello.welcome();
        System.out.println("Hello world!");
        hello.byeBay();
    }
}
