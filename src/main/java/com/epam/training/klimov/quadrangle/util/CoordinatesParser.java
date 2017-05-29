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

    public ArrayList<Point> parseCoordinates(String str) throws IncorrectPointsDataException {
        ArrayList<Point> points = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(str, Configuration.POINTS_DELIMITER);
        while (st.hasMoreTokens()) {
            String[] coordinates = st.nextToken().split(Configuration.COORDINATES_DELIMITER);
            if (coordinates.length != Configuration.DIMENSIONS) throw new IncorrectPointsDataException();
            int x;
            int y;
            try {
                x = Integer.parseInt(coordinates[0]);
                y = Integer.parseInt(coordinates[1]);
                Point point = new Point(x, y);
                points.add(point);
            } catch (NumberFormatException e) {
                throw new IncorrectPointsDataException();
            }
        }
        return points;
    }
}
