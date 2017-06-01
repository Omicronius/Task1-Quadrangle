package com.epam.training.klimov.quadrangle.util;

import com.epam.training.klimov.quadrangle.exception.InvalidInitializationException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class InputDataReader {
    public static Logger logger = LogManager.getLogger(InputDataReader.class);

    public static ArrayList<String> readDataFromFile(String path) throws InvalidInitializationException {
        ArrayList<String> result = new ArrayList<>();
        try {
            Files.lines(Paths.get(path), StandardCharsets.UTF_8).forEach(result::add);
        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, "File not found.");
            throw new InvalidInitializationException("File not found.", e);
        } catch (IOException e) {
            logger.log(Level.ERROR, "IO Exception", e);
            throw new InvalidInitializationException("IO Exception.", e);
        }
        return result;
    }
}

