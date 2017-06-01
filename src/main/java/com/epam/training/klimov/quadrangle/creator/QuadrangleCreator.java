package com.epam.training.klimov.quadrangle.creator;

import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;
import com.epam.training.klimov.quadrangle.exception.IncorrectPointsDataException;
import com.epam.training.klimov.quadrangle.util.IdGenerator;
import com.epam.training.klimov.quadrangle.util.QuadrangleValidator;
import java.util.List;

public class QuadrangleCreator extends AbstractShapeCreator<Quadrangle> {
    private static QuadrangleCreator quadrangleCreator = new QuadrangleCreator();
    private int AMOUNT_OF_VERTEX = 4;

    private QuadrangleCreator() {
    }

    public static QuadrangleCreator getCreator() {
        return quadrangleCreator;
    }

    @Override
    public Quadrangle create(List<Point> points) throws IncorrectPointsDataException {
        if (points.size() == AMOUNT_OF_VERTEX && QuadrangleValidator.getInstance().validatePoints(points)) {
            return new Quadrangle(IdGenerator.generate(), points.get(0), points.get(1), points.get(2), points.get(3));
        } else {
            throw new IncorrectPointsDataException();
        }
    }
}
