package programming2.com.welcome;

public class Hello {

    private String name;

//    public String getName() {
//        return name;
//    }

    public Hello(String name) {
        this.name = name;
    }

    public void welcome() {
        System.out.printf("Hello %s!%n", name);
    }

    public void byeBay() {
        System.out.printf("Bye %s!%n", name);
    }
}
