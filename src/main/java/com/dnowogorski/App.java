package com.dnowogorski;

public class App {
    public static void main(String[] args) {
        FoobarValue value = ImmutableFoobarValue.builder()
                .foo(2)
                .bar("Bar")
                .addBuz("test", "rest")
                .addCrux(1, 3, 4)
                .build();

        System.out.println(value);
    }
}
