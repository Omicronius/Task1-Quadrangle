package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;

import java.util.ArrayList;

public class QuadrangleValidator extends Validator <Quadrangle> {
    private static QuadrangleValidator quadrangleValidator = new QuadrangleValidator();

    private QuadrangleValidator() {
    }

    public static QuadrangleValidator getInstance() {
        return quadrangleValidator;
    }

    @Override
    public boolean validate(Quadrangle quadrangle) {
        ArrayList<Point> pointsList = new ArrayList<>();
        pointsList.add(quadrangle.getA());
        pointsList.add(quadrangle.getB());
        pointsList.add(quadrangle.getC());
        pointsList.add(quadrangle.getD());
        return checkForAbsencePointsDublicates(pointsList) && checkForConvexity(pointsList);
    }
}
