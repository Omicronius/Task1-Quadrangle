package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;

public class Calculator {
    public static double calculateTwoPointsDistance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX()-b.getX(), 2) + Math.pow(a.getY()-b.getY(), 2));
    }

    public static double calculatePerimeter(Quadrangle quadrangle) {
        throw new UnsupportedOperationException();
    }

    public static double calculateSquare(Quadrangle quadrangle) {
        throw new UnsupportedOperationException();
    }

    public static boolean checkForRectangularity(Quadrangle quadrangle) {
        throw new UnsupportedOperationException();
    }

}
