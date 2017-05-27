package com.epam.training.klimov.quadrangle.creator;

import com.epam.training.klimov.quadrangle.entity.ObservableShape;
import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;
import com.epam.training.klimov.quadrangle.util.IdGenerator;
import com.epam.training.klimov.quadrangle.util.QuadrangleValidator;

public class QuadrangleCreator {
    private static QuadrangleCreator quadrangleCreator = new QuadrangleCreator();

    private QuadrangleCreator() {
    }

    public QuadrangleCreator getCreator() {
        return quadrangleCreator;
    }

    public Quadrangle create(Point a, Point b, Point c, Point d) {
        Quadrangle quadrangle = new Quadrangle(IdGenerator.generate(), a, b, c, d);
        if (QuadrangleValidator.getInstance().validate(quadrangle)) {
            return quadrangle;
        }
        throw new UnsupportedOperationException();
    }
}
