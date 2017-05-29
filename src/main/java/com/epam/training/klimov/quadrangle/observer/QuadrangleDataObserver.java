package com.epam.training.klimov.quadrangle.observer;

import com.epam.training.klimov.quadrangle.entity.Quadrangle;
import com.epam.training.klimov.quadrangle.entity.ShapeData;
import com.epam.training.klimov.quadrangle.repository.ShapeCharacteristicRepository;
import com.epam.training.klimov.quadrangle.util.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QuadrangleDataObserver implements ShapeDataObserver<Quadrangle> {
    public static Logger logger = LogManager.getLogger(QuadrangleDataObserver.class);

    @Override
    public void update(Quadrangle quadrangle) {
        ShapeData data = new ShapeData();
        data.setPerimeter(Calculator.calculatePerimeter(quadrangle));
        data.setSquare(Calculator.calculateSquare(quadrangle));
        data.setRectangularity(Calculator.checkForRectangularity(quadrangle));
        ShapeCharacteristicRepository.getInstance().setShapeCharasteristicById(quadrangle.getId(), data);
    }
}
