package com.epam.training.klimov.quadrangle.interfaces;

import com.epam.training.klimov.quadrangle.entity.ObservableShape;

import java.util.Observable;

/**
 * Created by Kos on 27.05.2017.
 */
public interface QuadrangleDataObserver {
    void update(ObservableShape o);
}
