package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.Quadrangle;

public class QuadrangleValidator extends Validator <Quadrangle> {
    private static QuadrangleValidator quadrangleValidator = new QuadrangleValidator();

    private QuadrangleValidator() {
    }

    public static QuadrangleValidator getInstance() {
        return quadrangleValidator;
    }

    @Override
    boolean validate(Quadrangle observableShape) {
        return false;
    }
}
