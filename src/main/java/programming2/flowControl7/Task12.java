package programming2.flowControl7;

public class Task12 {
    public static void main(String[] args) {
        int j = 0;
        int n = 0;
        while (n < 10) {
            n++;
            int i = 0;
            int a = 0;
            j++;
            do {
                i++;
                a = a + j;
                System.out.printf("%s ", a);
            } while (i < 10);
            System.out.println();
        }
    }
}