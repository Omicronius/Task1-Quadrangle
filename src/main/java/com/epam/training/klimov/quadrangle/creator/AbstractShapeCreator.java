package com.epam.training.klimov.quadrangle.creator;

import com.epam.training.klimov.quadrangle.entity.ObservableShape;
import com.epam.training.klimov.quadrangle.entity.Point;

import java.util.List;

public abstract class AbstractShapeCreator<T extends ObservableShape>{
    public abstract T create(List<Point> points);
}
