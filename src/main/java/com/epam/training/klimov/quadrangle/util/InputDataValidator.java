package com.epam.training.klimov.quadrangle.util;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputDataValidator {
    public static Logger logger = LogManager.getLogger(InputDataValidator.class);

    public ArrayList<String> validateCoordinates(ArrayList<String> inputCoordinates) {
        Pattern p = Pattern.compile("( *-?\\d+ +-?\\d+ *,){3} *-?\\d+ +-?\\d+");
        ArrayList<String> result = new ArrayList<>();
        for (String coordinates : inputCoordinates) {
            Matcher m = p.matcher(coordinates);
            if (m.matches()) {
                result.add(coordinates);
            } else {
                logger.log(Level.WARN, "Some string contains invalid data. It has been skipped.");
            }
        }
        return result;
    }
}
