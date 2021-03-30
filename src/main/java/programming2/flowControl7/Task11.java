package programming2.flowControl7;

public class Task11 {
    public static void main(String[] args) {
        String let = "S";
        int j = 0;
        while (j < 10) {
            j++;
            int i = 0;
            do {
                i++;
                System.out.print(let);
            } while (i < 10);
            System.out.println();
        }
    }
}