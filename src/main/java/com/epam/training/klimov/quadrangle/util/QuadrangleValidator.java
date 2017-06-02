package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;

import java.util.ArrayList;

public class QuadrangleValidator extends AbstractValidator<Quadrangle> {

    public QuadrangleValidator() {
    }

    @Override
    public boolean validate(Quadrangle quadrangle) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(quadrangle.getA());
        points.add(quadrangle.getB());
        points.add(quadrangle.getC());
        points.add(quadrangle.getD());
        return checkForAbsencePointsDuplicates(points) && checkForConvexity(points);
    }
}
