package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.exception.IncorrectPointsDataException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class CoordinatesParser {
    public static Logger logger = LogManager.getLogger(CoordinatesParser.class);
    private static CoordinatesParser coordinatesParser = new CoordinatesParser();

    private CoordinatesParser() {
    }

    public CoordinatesParser getInstance() {
        return coordinatesParser;
    }

    public static  ArrayList<Point> parseCoordinates(String coorditates) {
        ArrayList<Point> points = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(" ");
        while(st.hasMoreTokens()) {
            String string = st.nextToken().trim();
            int x = Integer.parseInt(string.split(" ", 1)[0]);
            int y = Integer.parseInt(string.split(" ", 1)[0].trim());
            Point point = new Point(x, y);
            points.add(point);
        }
        return points;
    }
}
