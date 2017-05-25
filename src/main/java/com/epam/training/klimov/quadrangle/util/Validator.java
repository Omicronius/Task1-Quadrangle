package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.Point;

public class Validator {
    public static boolean validatePoints(Point a, Point b, Point c, Point d) {
        //TODO check for dublicates must be added
        if (belongToOneLine(a, b, c)) return false;
        if (belongToOneLine(b, c, d)) return false;
        if (belongToOneLine(c, d, a)) return false;
        if (belongToOneLine(d, a, c)) return false;
        return true;
    }

    public static boolean belongToOneLine(Point p1, Point p2, Point p3) {
        //TODO check for division by zero must be added
        return ((p3.getX() - p1.getX()) / (p2.getX() - p1.getX()) == (p3.getY() - p1.getY()) / (p2.getY() - p1.getY()));
    }
}
