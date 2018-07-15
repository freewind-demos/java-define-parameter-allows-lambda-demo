package demo;

import static demo.Apply.apply;

public class Hello {

    public static void main(String[] args) {
        normalStyle();
        blockStyle();
    }

    private static void normalStyle() {
        User user = new User("Freewind");
        user.setEmail("hello@test.com");
        user.setAddress("China");
        System.out.println(user);
    }

    private static void blockStyle() {
        User user = apply(new User("Freewind"), self -> {
            self.setEmail("hello@test.com");
            self.setAddress("China");
        });
        System.out.println(user);
    }

}

final class User {
    private final String name;
    private String email;
    private String address;

    public User(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{name='" + name + '\'' + ", email='" + email + '\'' + ", address='" + address + '\'' + '}';
    }
}


interface Apply<T> {
    void apply(T t);

    static <T> T apply(T t, Apply<T> callback) {
        callback.apply(t);
        return t;
    }
}
