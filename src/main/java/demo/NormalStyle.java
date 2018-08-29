package demo;

public class NormalStyle {

    private static User user = new User("Freewind");

    static {
        user.email = "hello@test.com";
        user.address = "China";
    }

    public static void main(String[] args) {
        System.out.println(user);
    }

}
