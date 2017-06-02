package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.Point;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;

public class CoordinatesParserTest {
    private static CoordinatesParser parser;

    @BeforeClass
    public static void init() {
        parser = new CoordinatesParser();
    }

    @Test
    public void parseCoordinates() {
        String coordinates = "      1 -1 ,-3      5, 4 7, -6 -1";
        ArrayList<Point> actualPoints = new ArrayList<>();
        actualPoints.add(new Point(1, -1));
        actualPoints.add(new Point(-3, 5));
        actualPoints.add(new Point(4, 7));
        actualPoints.add(new Point(-6, -1));
        ArrayList<Point> expectedPoints = parser.parseCoordinates(coordinates);
        Assert.assertTrue(expectedPoints.containsAll(actualPoints));
    }
}