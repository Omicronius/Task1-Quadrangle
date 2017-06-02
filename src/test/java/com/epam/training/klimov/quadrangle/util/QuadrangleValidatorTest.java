package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.entity.Point;
import com.epam.training.klimov.quadrangle.entity.Quadrangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class QuadrangleValidatorTest {
    private Quadrangle quadrangle;
    private Boolean expectedResult;
    private QuadrangleValidator validator;

    public QuadrangleValidatorTest(Quadrangle quadrangle, Boolean expectedResult) {
        this.quadrangle = quadrangle;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize() {
        validator = new QuadrangleValidator();
    }

    @Parameterized.Parameters
    public static Collection quadrangles() {
        return Arrays.asList(new Object[][] {
                { new Quadrangle(1, new Point(1, 1), new Point(1, -1), new Point(-1, -1), new Point(-1, 1)), true },
                { new Quadrangle(1, new Point(1, 1), new Point(1, 1), new Point(1, 1), new Point(1, 1)), false },
                { new Quadrangle(1, new Point(1, 1), new Point(3, 3), new Point(6, 0), new Point(0, -5)), true },
                { new Quadrangle(1, new Point(-3, 0), new Point(0, 5), new Point(4, 0), new Point(0, 4)), false },
        });
    }

    @Test
    public void validateQuadrangle() {
        Assert.assertEquals(validator.validate(quadrangle), expectedResult);
    }
}