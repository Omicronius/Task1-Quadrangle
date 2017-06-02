package com.epam.training.klimov.quadrangle;

import com.epam.training.klimov.quadrangle.creator.QuadrangleCreator;
import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;
import com.epam.training.klimov.quadrangle.entity.ShapeCharacteristic;
import com.epam.training.klimov.quadrangle.repository.ShapeCharacteristicRepository;
import com.epam.training.klimov.quadrangle.util.Calculator;
import com.epam.training.klimov.quadrangle.util.CoordinatesParser;
import com.epam.training.klimov.quadrangle.util.InputDataReader;
import com.epam.training.klimov.quadrangle.util.InputDataValidator;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

public class AppTest {

    @Test
    public void completeApplicationTest() throws Exception {
        InputDataReader reader = new InputDataReader();
        InputDataValidator validator = new InputDataValidator();
        CoordinatesParser parser = new CoordinatesParser();
        ShapeCharacteristicRepository repository = ShapeCharacteristicRepository.getInstance();

        ArrayList<String> inputData = reader.readDataFromFile("data.txt");
        inputData = validator.validatedCoordinates(inputData);
        ArrayList<Point> points = parser.parseCoordinates(inputData.get(0));
        Quadrangle quadrangle = QuadrangleCreator.getCreator().create(points);
        ShapeCharacteristic characteristic = new ShapeCharacteristic();
        characteristic.setSquare(Calculator.calculateSquare(quadrangle));
        characteristic.setPerimeter(Calculator.calculateSquare(quadrangle));
        characteristic.setRectangularity(Calculator.checkQuadrangleIsRectangular(quadrangle));
        repository.setShapeCharacteristicById(quadrangle.getId(), characteristic);
        Assert.assertFalse(repository.getShapesCharacteristic().entrySet().isEmpty());
    }
}
