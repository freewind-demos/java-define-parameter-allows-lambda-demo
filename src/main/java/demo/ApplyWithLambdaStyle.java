package demo;

import static demo.Apply.apply;

public class ApplyWithLambdaStyle {

    private static User user = apply(new User("Freewind"), self -> {
        self.email = "hello@test.com";
        self.address = "China";
    });

    public static void main(String[] args) {
        System.out.println(user);
    }

}

interface Apply<T> {
    void apply(T t);

    static <T> T apply(T t, Apply<T> callback) {
        callback.apply(t);
        return t;
    }
}


