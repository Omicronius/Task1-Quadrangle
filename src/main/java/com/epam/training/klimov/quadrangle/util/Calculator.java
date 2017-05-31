package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;

public class Calculator {
    public static double calculateTwoPointsDistance(Point a, Point b) {
        return Math.hypot(a.getX() - b.getX(), a.getY() - b.getY());
    }

    public static double calculatePerimeter(Quadrangle quadrangle) {
        double result = 0;
        result += Calculator.calculateTwoPointsDistance(quadrangle.getA(), quadrangle.getB());
        result += Calculator.calculateTwoPointsDistance(quadrangle.getB(), quadrangle.getC());
        result += Calculator.calculateTwoPointsDistance(quadrangle.getC(), quadrangle.getD());
        result += Calculator.calculateTwoPointsDistance(quadrangle.getD(), quadrangle.getA());
        return result;
    }

    public static double calculateSquare(Quadrangle quadrangle) {
        double semiPerimeter = calculatePerimeter(quadrangle) / 2;
        return Math.sqrt((semiPerimeter - calculateTwoPointsDistance(quadrangle.getA(), quadrangle.getB())) *
                        (semiPerimeter - calculateTwoPointsDistance(quadrangle.getB(), quadrangle.getC())) *
                        (semiPerimeter - calculateTwoPointsDistance(quadrangle.getC(), quadrangle.getD())) *
                        (semiPerimeter - calculateTwoPointsDistance(quadrangle.getD(), quadrangle.getA())));
    }

    public static boolean checkQuadrangleIsRectangular(Quadrangle quadrangle) {
        Point a = quadrangle.getA();
        Point b = quadrangle.getB();
        Point c = quadrangle.getC();
        Point d = quadrangle.getD();
        return checkAngleIsRectangular(a, b, c) || checkAngleIsRectangular(b, c, d) ||
                checkAngleIsRectangular(c, d, a) || checkAngleIsRectangular(d, a, b);
    }

    private static boolean checkAngleIsRectangular(Point a, Point b, Point c) {
        double ab = calculateTwoPointsDistance(a, b);
        double bc = calculateTwoPointsDistance(b, c);
        double ac = calculateTwoPointsDistance(c, a);
        return ac == Math.sqrt(Math.pow(ab, 2) + Math.pow(bc, 2));
    }
}
