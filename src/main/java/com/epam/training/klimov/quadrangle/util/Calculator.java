package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;

public class Calculator {
    public static double defineDistance(Point a, Point b) {
        return Math.hypot(a.getX() - b.getX(), a.getY() - b.getY());
    }

    public static double calculatePerimeter(Quadrangle quadrangle) {
        double result = 0;
        result += defineDistance(quadrangle.getA(), quadrangle.getB());
        result += defineDistance(quadrangle.getB(), quadrangle.getC());
        result += defineDistance(quadrangle.getC(), quadrangle.getD());
        result += defineDistance(quadrangle.getD(), quadrangle.getA());
        return result;
    }

    public static double calculateSquare(Quadrangle quadrangle) {
        double semiPerimeter = calculatePerimeter(quadrangle) / 2;
        return Math.sqrt((semiPerimeter - defineDistance(quadrangle.getA(), quadrangle.getB())) *
                        (semiPerimeter - defineDistance(quadrangle.getB(), quadrangle.getC())) *
                        (semiPerimeter - defineDistance(quadrangle.getC(), quadrangle.getD())) *
                        (semiPerimeter - defineDistance(quadrangle.getD(), quadrangle.getA())));
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
        double ab = defineDistance(a, b);
        double bc = defineDistance(b, c);
        double ac = defineDistance(c, a);
        return ac == Math.sqrt(Math.pow(ab, 2) + Math.pow(bc, 2));
    }
}
