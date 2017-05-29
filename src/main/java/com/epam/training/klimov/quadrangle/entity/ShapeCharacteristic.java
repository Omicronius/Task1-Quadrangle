package com.epam.training.klimov.quadrangle.entity;

public class ShapeCharacteristic {
    private double perimeter;
    private double square;
    private boolean isRectangular;
    private boolean isConvex;

    public ShapeCharacteristic() {
    }

    public ShapeCharacteristic(double perimeter, double square, boolean isRectangular, boolean isConvex) {
        this.perimeter = perimeter;
        this.square = square;
        this.isRectangular = isRectangular;
        this.isConvex = isConvex;
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

    public void setRectangular(boolean rectangular) {
        isRectangular = rectangular;
    }

    public boolean isConvex() {
        return isConvex;
    }

    public void setConvex(boolean convex) {
        isConvex = convex;
    }
}
