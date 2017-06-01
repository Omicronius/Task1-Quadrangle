package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.exception.InvalidInitializationException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.FileNotFoundException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class InputDataReaderTest {
    @Test
    public void readDataFromExistingFile() throws Exception {
        ArrayList<String> inputStrings = InputDataReader.readDataFromFile("data.txt");
        System.out.println();
        Assert.assertTrue(inputStrings.size() == 5);
    }
    @Test
    public void checkFirstStringInFile() throws Exception {
        ArrayList<String> inputStrings = InputDataReader.readDataFromFile("data.txt");
        System.out.println();
        Assert.assertTrue("1 2, -3 4, 5 6, 7 8".equals(inputStrings.get(0)));
    }
}