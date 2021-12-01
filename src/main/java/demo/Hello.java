package demo;

import java.util.function.Function;

public class Hello {

    private static int operate(int num, Function<Integer, Integer> fn) {
        return fn.apply(num);
    }

    public static void main(String[] args) {
        System.out.println(operate(3, (a) -> a * 2));
    }

}
