package com.epam.training.klimov.quadrangle.util;

public class IdGenerator {
    private static long counter = 1;

    public static long generate() {
        return counter++;
    }
}
