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
        pointsSet.addAll(points);
        return points.size() == pointsSet.size();
    }

    public boolean checkForConvexity(List<Point> points) {
        int edgesChecked = 0;
        if (points.size() > 3) {
            for (int i = 0; i < points.size(); i++) {
                Point a = points.get(i);
                Point b = points.get((i + 1)%points.size());
                Point c = points.get((i + 2)%points.size());
                if ((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY()) < 0) {
                    edgesChecked++;
                }
            }
        }
        return edgesChecked == points.size();
    }
}
