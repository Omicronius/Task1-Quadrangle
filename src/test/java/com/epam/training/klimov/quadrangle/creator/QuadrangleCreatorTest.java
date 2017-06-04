package com.epam.training.klimov.quadrangle.creator;

import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.exception.IncorrectPointsDataException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class QuadrangleCreatorTest {

    @Test
    public void createQuadrangle() throws Exception {
        Assert.assertNotNull(QuadrangleCreator.getCreator().create(Arrays.asList(new Point[]{new Point(4, -4),
                new Point(-3, -3),
                new Point(-2, 2),
                new Point(1, 1)})));
    }

    @Test(expected = IncorrectPointsDataException.class)
    public void createUsingDuplicates() throws Exception {
        QuadrangleCreator.getCreator().create(Arrays.asList(new Point[]{new Point(1, 1),
                new Point(1, 1),
                new Point(2, -3),
                new Point(-1, -1)}));
    }

    @Test(expected = IncorrectPointsDataException.class)
    public void createConvexShape() throws Exception {
        QuadrangleCreator.getCreator().create(Arrays.asList(new Point[]{new Point(-3, 1),
                new Point(1, 2),
                new Point(3, -1),
                new Point(1, 1)}));
    }

}