package com.epam.training.klimov.quadrangle.entity;

public class ShapeCharacteristic {
    private double perimeter;
    private double square;
    private boolean isRectangular;

    public ShapeCharacteristic() {
    }

    public ShapeCharacteristic(double perimeter, double square, boolean isRectangular) {
        this.perimeter = perimeter;
        this.square = square;
        this.isRectangular = isRectangular;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public boolean isRectangular() {
        return isRectangular;
    }

    public void setRectangularity(boolean rectangular) {
        isRectangular = rectangular;
    }
}
