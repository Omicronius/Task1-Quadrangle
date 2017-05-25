package com.epam.training.klimov.quadrangle.creator;

import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;
import com.epam.training.klimov.quadrangle.util.Validator;

public class QuadrangleCreator {
    private static QuadrangleCreator quadrangleCreator = new QuadrangleCreator();

    private QuadrangleCreator() {
    }

    public QuadrangleCreator getCreator() {
        return quadrangleCreator;
    }

    public static Quadrangle create(Point a, Point b, Point c, Point d) {
       if (Validator.validatePoints(a, b, c, d)) {
            return new Quadrangle(a, b, c, d);
       }
       throw new UnsupportedOperationException();
    }
}
