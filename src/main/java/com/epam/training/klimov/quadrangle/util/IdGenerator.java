package com.epam.training.klimov.quadrangle.util;

/**
 * Created by Kos on 27.05.2017.
 */
public class IdGenerator {
    private static int counter;

    public IdGenerator() {
        this.counter = 0;
    }

    public static int generate() {
        return counter++;
    }
}
