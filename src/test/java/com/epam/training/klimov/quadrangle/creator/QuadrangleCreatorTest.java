package com.epam.training.klimov.quadrangle.creator;

import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;
import com.epam.training.klimov.quadrangle.exception.IncorrectPointsDataException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class QuadrangleCreatorTest {
    private AbstractShapeCreator quadrangleCreator;

    @Test
    public void createQuadrangle() throws IncorrectPointsDataException {
        Assert.assertNotNull(QuadrangleCreator.getCreator().create(Arrays.asList(new Point[]{new Point(4, -4),
                new Point(-3, -3),
                new Point(-2, 2),
                new Point(1, 1)})));
    }

    @Test(expected = IncorrectPointsDataException.class)
    public void createUsingDuplicates() throws IncorrectPointsDataException {
        QuadrangleCreator.getCreator().create(Arrays.asList(new Point[]{new Point(1, 1),
                new Point(1, 1),
                new Point(2, -3),
                new Point(-1, -1)}));
    }

    @Test(expected = IncorrectPointsDataException.class)
    public void createConvexShape() throws IncorrectPointsDataException {
        QuadrangleCreator.getCreator().create(Arrays.asList(new Point[]{new Point(-3, 1),
                new Point(1, 2),
                new Point(3, -1),
                new Point(1, 1)}));
    }
}