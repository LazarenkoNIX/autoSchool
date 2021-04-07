package exception4.log3;

public class Task1 {
    private static void first() {
        System.out.println("Private Method was called");
    }

    public static void second() {
        first();
        System.out.println("Public Method was called");
    }
}