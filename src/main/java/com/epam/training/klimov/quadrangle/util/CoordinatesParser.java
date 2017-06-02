package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.Point;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class CoordinatesParser {
    private static final String COORDINATES_DELIMITER = " ";
    private static final String POINTS_DELIMITER = ",";

    public ArrayList<Point> parseCoordinates(String coordinates) {
        ArrayList<Point> points = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(coordinates, POINTS_DELIMITER);
        while (st.hasMoreTokens()) {
            String string = st.nextToken().trim();
            int x = Integer.parseInt(string.split(COORDINATES_DELIMITER, 2)[0]);
            int y = Integer.parseInt(string.split(COORDINATES_DELIMITER, 2)[1].trim());
            Point point = new Point(x, y);
            points.add(point);
        }
        return points;
    }
}
