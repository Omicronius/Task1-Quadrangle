package com.epam.training.klimov.quadrangle.util;

public class IdGenerator {
    private static int counter;

    public IdGenerator() {
        this.counter = 0;
    }

    public static int generate() {
        return counter++;
    }
}
