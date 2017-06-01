package com.epam.training.klimov.quadrangle.util;

import org.junit.Assert;
import org.junit.Test;

public class IdGeneratorTest {
    @Test
    public void idGeneratorReturnConsistentValues() {
        Assert.assertEquals(IdGenerator.generate() + 1, IdGenerator.generate());
    }
}