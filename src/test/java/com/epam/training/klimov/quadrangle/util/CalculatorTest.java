package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void CalculateTwoPointsDistanceTest() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double actualDistance = Calculator.calculateTwoPointsDistance(a, b);
        Assert.assertEquals(actualDistance, 5, 0);
    }
    @Test
    public void CalculatePerimeterTest() {
        Point a = new Point(2, 3);
        Point b = new Point(2, -3);
        Point c = new Point(-2, -3);
        Point d = new Point(-2, 3);
        Quadrangle quadrangle = new Quadrangle(1, a, b, c, d);
        double actualPerimeter = Calculator.calculatePerimeter(quadrangle);
        Assert.assertEquals(actualPerimeter, 20, 0);
    }
    @Test
    public void CalculateSquareTest() {
        Point a = new Point(2, 3);
        Point b = new Point(2, -3);
        Point c = new Point(-2, -3);
        Point d = new Point(-2, 3);
        Quadrangle quadrangle = new Quadrangle(1, a, b, c, d);
        double actualSquare = Calculator.calculateSquare(quadrangle);
        Assert.assertEquals(actualSquare, 24, 0);
    }
    @Test
    public void CheckQuadrangleIsRectangular(){
        Point a = new Point(2, 3);
        Point b = new Point(2, -3);
        Point c = new Point(-2, -3);
        Point d = new Point(-2, 3);
        Quadrangle quadrangle = new Quadrangle(1, a, b, c, d);
        Assert.assertTrue(Calculator.checkQuadrangleIsRectangular(quadrangle));
    }
    @Test
    public void CheckQuadrangleIsNotRectangular(){
        Point a = new Point(3, 1);
        Point b = new Point(1, -1);
        Point c = new Point(-3, -1);
        Point d = new Point(-1, 1);
        Quadrangle quadrangle = new Quadrangle(1, a, b, c, d);
        Assert.assertFalse(Calculator.checkQuadrangleIsRectangular(quadrangle));
    }
}