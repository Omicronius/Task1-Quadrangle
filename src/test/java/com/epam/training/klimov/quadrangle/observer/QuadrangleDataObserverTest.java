package com.epam.training.klimov.quadrangle.observer;

import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;
import com.epam.training.klimov.quadrangle.repository.ShapeCharacteristicRepository;
import com.epam.training.klimov.quadrangle.util.IdGenerator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuadrangleDataObserverTest {
    private static Quadrangle quadrangle;
    private static QuadrangleDataObserver observer;

    @BeforeClass
    public static  void init() {
        quadrangle = new Quadrangle(IdGenerator.generate(), new Point(1,2), new Point(1, -1),
                new Point(-1, -1), new Point(-1, 1));
        observer = new QuadrangleDataObserver();
        quadrangle.addObserver(observer);
    }

    @Test
    public void changingQuadranglePointsObserved() {
        quadrangle.setA(new Point(1, 1));
        double newPerimeter = ShapeCharacteristicRepository.getInstance().
                getShapeCharacteristicById(quadrangle.getId()).getPerimeter();
        Assert.assertEquals(newPerimeter, 8, 0.00001);
    }
}
