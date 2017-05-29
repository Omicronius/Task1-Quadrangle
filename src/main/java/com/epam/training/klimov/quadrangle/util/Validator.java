package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.ObservableShape;
import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public abstract class Validator<T extends ObservableShape> {

    abstract boolean validate(T observableShape);

    public boolean checkForNotBelongingToOneLine(Point a, Point b, Point c) {
        return (a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY()) != 0;
    }

    public boolean checkForAbsencePointsDublicates(List<Point> points) {
        HashSet<Point> pointsSet = new HashSet<>();
        for (Point point : points) {
            pointsSet.add(point);
        }
        return points.size() == pointsSet.size();
    }

    public boolean checkForNonConcavity(List<Point> points) {
        throw new UnsupportedOperationException();
    }
}
