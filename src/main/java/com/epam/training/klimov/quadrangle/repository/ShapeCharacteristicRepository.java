package com.epam.training.klimov.quadrangle.repository;

import com.epam.training.klimov.quadrangle.entity.ShapeData;

import java.util.TreeMap;

public class ShapeCharacteristicRepository {
    private static ShapeCharacteristicRepository shapeCharacteristicRepository = new ShapeCharacteristicRepository();
    private static TreeMap<Integer, ShapeData> shapesCharacteristic = new TreeMap<>();

    private ShapeCharacteristicRepository() {
    }

    public static ShapeCharacteristicRepository getInstance() {
        return shapeCharacteristicRepository;
    }

    public ShapeData getShapeCharasteristicById(int id) {
        return shapesCharacteristic.get(id);
    }

    public void setShapeCharasteristicById(int id, ShapeData shapeDate) {
        shapesCharacteristic.put(id, shapeDate);
    }
}
