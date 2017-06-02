package com.epam.training.klimov.quadrangle.entity;

import com.epam.training.klimov.quadrangle.observer.ShapeDataObserver;

import java.util.ArrayList;

public abstract class ObservableShape {
    private long id;
    private ArrayList<ShapeDataObserver> observers;

    public ObservableShape(long id) {
        this.id = id;
        this.observers = new ArrayList<>();
    }

    public void addObserver(ShapeDataObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ShapeDataObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (ShapeDataObserver observer : observers) {
            observer.update(this);
        }
    }
}
