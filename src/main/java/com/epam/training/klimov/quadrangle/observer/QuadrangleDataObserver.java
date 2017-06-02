package com.epam.training.klimov.quadrangle.observer;

import com.epam.training.klimov.quadrangle.entity.Quadrangle;
import com.epam.training.klimov.quadrangle.entity.ShapeCharacteristic;
import com.epam.training.klimov.quadrangle.repository.ShapeCharacteristicRepository;
import com.epam.training.klimov.quadrangle.util.Calculator;

public class QuadrangleDataObserver implements ShapeDataObserver<Quadrangle> {

    @Override
    public void update(Quadrangle quadrangle) {
        ShapeCharacteristic shapeData = new ShapeCharacteristic();
        shapeData.setPerimeter(Calculator.calculatePerimeter(quadrangle));
        shapeData.setSquare(Calculator.calculateSquare(quadrangle));
        shapeData.setRectangularity(Calculator.checkQuadrangleIsRectangular(quadrangle));
        ShapeCharacteristicRepository.getInstance().setShapeCharacteristicById(quadrangle.getId(), shapeData);
    }
}
