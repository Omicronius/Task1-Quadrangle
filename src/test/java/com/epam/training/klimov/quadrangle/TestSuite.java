package com.epam.training.klimov.quadrangle;

import com.epam.training.klimov.quadrangle.creator.QuadrangleCreatorTest;
import com.epam.training.klimov.quadrangle.repository.ShapeCharacteristicRepositoryTest;
import com.epam.training.klimov.quadrangle.util.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CalculatorTest.class,
        CoordinatesParserTest.class,
        QuadrangleValidatorTest.class,
        InputDataReaderTest.class,
        QuadrangleCreatorTest.class,
        ShapeCharacteristicRepositoryTest.class,
        InputDataValidatorTest.class,
        AppTest.class
})
public class TestSuite {
}
