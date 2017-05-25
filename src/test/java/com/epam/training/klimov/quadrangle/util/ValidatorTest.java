package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.Point;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void pointsBelongToOneLine() {
        Point p1 = new Point(-2, -1);
        Point p2 = new Point(-3, -2);
        Point p3 = new Point(-4, -3);
        Assert.assertTrue(Validator.belongToOneLine(p1, p2, p3));
    }

    @Test
    public void pointsNotBelongToOneLine() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 4);
        Point p3 = new Point(3, 6);
        Assert.assertFalse(Validator.belongToOneLine(p1, p2, p3));
    }
}