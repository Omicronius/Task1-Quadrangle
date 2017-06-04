package com.epam.training.klimov.quadrangle.repository;

import com.epam.training.klimov.quadrangle.entity.ShapeCharacteristic;
import java.util.TreeMap;

public class ShapeCharacteristicRepository {
    private static ShapeCharacteristicRepository shapeCharacteristicRepository = new ShapeCharacteristicRepository();
    private static TreeMap<Long, ShapeCharacteristic> shapesCharacteristic = new TreeMap<>();

    private ShapeCharacteristicRepository() {
    }

    public static ShapeCharacteristicRepository getInstance() {
        return shapeCharacteristicRepository;
    }

    public ShapeCharacteristic getShapeCharacteristicById(long id) {
        return shapesCharacteristic.get(id);
    }

    public void setShapeCharacteristicById(long id, ShapeCharacteristic shapeDate) {
        shapesCharacteristic.put(id, shapeDate);
    }

    public TreeMap<Long, ShapeCharacteristic> getShapesCharacteristic() {
        return shapesCharacteristic;
    }
}
