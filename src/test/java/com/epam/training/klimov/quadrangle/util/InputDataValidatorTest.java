package com.epam.training.klimov.quadrangle.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class InputDataValidatorTest {
    private ArrayList<String> unvalidatedStrings;

    @Before
    public void init() {
        unvalidatedStrings = new ArrayList<>();
        unvalidatedStrings.add("1 2, -3 4, 5 6, 7 8");
        unvalidatedStrings.add("9 -10, 11 wrong data 12, 13 14, 15 -16");
        unvalidatedStrings.add("    3  -5,   -4  -17   , -9   11, 4     1");
        unvalidatedStrings.add("7 3, -1 8, 4 -6, -2 -4");
    }
    @Test
    public void validatedCoordinates() throws Exception {
        Assert.assertEquals(InputDataValidator.validatedCoordinates(unvalidatedStrings).size(), 3);
    }
}