package com.epam.training.klimov.quadrangle.repository;

import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;
import com.epam.training.klimov.quadrangle.entity.ShapeCharacteristic;
import com.epam.training.klimov.quadrangle.util.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCharacteristicRepositoryTest {
    @Test
    public void checkStoringShapeCharacteristic() {
        Quadrangle q = new Quadrangle(1, new Point(1, 1), new Point(1, -1), new Point(-1, -1), new Point(-1, 1));
        ShapeCharacteristic shapeData = new ShapeCharacteristic(Calculator.calculatePerimeter(q),
                Calculator.calculateSquare(q), Calculator.checkQuadrangleIsRectangular(q));
        ShapeCharacteristicRepository.getInstance().setShapeCharacteristicById(q.getId(), shapeData);
        Assert.assertNotNull(ShapeCharacteristicRepository.getInstance().getShapeCharacteristicById(q.getId()));
    }
}