package com.epam.training.klimov.quadrangle.util;

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

    public static List<String> readDataFromFile(String path) {
        ArrayList<String> result = new ArrayList<>();
        try {
            Files.lines(Paths.get(path), StandardCharsets.UTF_8).forEach(result::add);
        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, "File not found.");
        } catch (IOException e) {
            logger.log(Level.ERROR, "IO Exception", e);
        }
        return result;
    }
}

