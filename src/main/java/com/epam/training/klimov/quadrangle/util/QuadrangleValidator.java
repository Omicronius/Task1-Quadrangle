package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.ObservableShape;

public class QuadrangleValidator extends Validator {
    private static QuadrangleValidator quadrangleValidator = new QuadrangleValidator();

    private QuadrangleValidator() {
    }

    public static QuadrangleValidator getInstance() {
        return quadrangleValidator;
    }

    public boolean validate(ObservableShape quadrangle) {
        throw new UnsupportedOperationException();
    }
}
