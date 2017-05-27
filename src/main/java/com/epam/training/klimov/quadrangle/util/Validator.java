package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.ObservableShape;
import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;

import java.util.List;

/**
 * Created by Kos on 27.05.2017.
 */
public abstract class Validator {

    abstract boolean validate(ObservableShape observableShape);

    public boolean checkForNotBelongingToOneLine(Point p1, Point p2, Point p3) {
        return ((p3.getX() - p1.getX()) / (p2.getX() - p1.getX()) == (p3.getY() - p1.getY()) / (p2.getY() - p1.getY()));
    }

    public boolean checkForCorrectPointsLocation(List<Point> points) {
        throw new UnsupportedOperationException();
    }

    public boolean checkForAbsencePointsDublicates(List<Point> points) {
        throw new UnsupportedOperationException();
    }
    public boolean checkForNonConcavity(List<Point> points) {
        throw new UnsupportedOperationException();
    }
}
