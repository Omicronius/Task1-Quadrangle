package com.epam.training.klimov.quadrangle.creator;

import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;
import com.epam.training.klimov.quadrangle.exception.IncorrectPointsDataException;
import com.epam.training.klimov.quadrangle.util.IdGenerator;
import com.epam.training.klimov.quadrangle.util.QuadrangleValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class QuadrangleCreator extends AbstractShapeCreator<Quadrangle> {
    public static Logger logger = LogManager.getLogger(QuadrangleCreator.class);
    private static QuadrangleCreator quadrangleCreator = new QuadrangleCreator();
    private static QuadrangleValidator validator = new QuadrangleValidator();

    private QuadrangleCreator() {
    }

    public static QuadrangleCreator getCreator() {
        return quadrangleCreator;
    }

    @Override
    public Quadrangle create(List<Point> points) throws IncorrectPointsDataException {
        if (validator.validatePoints(points)) {
            return new Quadrangle(IdGenerator.generate(), points.get(0), points.get(1), points.get(2), points.get(3));
        } else {
            throw new IncorrectPointsDataException();
        }
    }
}
