package com.epam.training.klimov.quadrangle.repository;

import com.epam.training.klimov.quadrangle.entity.ShapeCharacteristic;

import java.util.TreeMap;

public class CharacteristicRepository {
    private static CharacteristicRepository characteristicRepository = new CharacteristicRepository();
    private static TreeMap<Integer, ShapeCharacteristic> shapesCharacteristic = new TreeMap<>();

    private CharacteristicRepository() {
    }
    public static CharacteristicRepository getInstance() {
        return characteristicRepository;
    }
    public ShapeCharacteristic getShapeCharasteristicById(int id) {
        return shapesCharacteristic.get(id);
    }
    public void setShapeCharasteristicById(int id, ShapeCharacteristic shapeCharacteristic) {
        shapesCharacteristic.put(id, shapeCharacteristic);
    }
}
