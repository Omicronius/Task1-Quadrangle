package com.epam.training.klimov.quadrangle.creator;

import com.epam.training.klimov.quadrangle.entity.ObservableShape;
import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.exception.IncorrectPointsDataException;

import java.util.List;

public abstract class AbstractShapeCreator<T extends ObservableShape>{
    public abstract T create(List<Point> points) throws IncorrectPointsDataException;
}
