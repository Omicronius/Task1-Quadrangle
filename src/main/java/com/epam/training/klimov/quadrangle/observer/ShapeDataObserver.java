package com.epam.training.klimov.quadrangle.observer;

import com.epam.training.klimov.quadrangle.entity.ObservableShape;

public interface ShapeDataObserver<T extends ObservableShape> {
    void update(T shape);
}
