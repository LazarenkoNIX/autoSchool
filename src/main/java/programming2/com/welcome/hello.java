package programming2.com.welcome;

public class hello {

    private String name;

//    public String getName() {
//        return name;
//    }

    public hello(String name) {
        this.name = name;
    }

    public void welcome() {
        System.out.println("Hello" + String.format(" %s!", name));
    }

    public void byeBay() {
        System.out.println("Bye" + String.format(" %s!", name));

    }
}
