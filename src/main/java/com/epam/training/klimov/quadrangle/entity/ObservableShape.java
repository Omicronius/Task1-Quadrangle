package com.epam.training.klimov.quadrangle.entity;

import com.epam.training.klimov.quadrangle.interfaces.QuadrangleDataObserver;

import java.util.ArrayList;

/**
 * Created by Kos on 27.05.2017.
 */
public abstract class ObservableShape {
    private int id;
    private ArrayList<QuadrangleDataObserver> observers;

    public ObservableShape() {
    }

    public ObservableShape(int id) {
        this.id = id;
        this.observers = new ArrayList<>();
    }

    public void addObserver(QuadrangleDataObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(QuadrangleDataObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (QuadrangleDataObserver observer : observers) {
            observer.update(this);
        }
    }
}
