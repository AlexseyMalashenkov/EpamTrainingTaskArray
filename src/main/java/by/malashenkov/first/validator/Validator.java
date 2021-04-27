package by.malashenkov.first.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final String REGEX = "[0-9 ,-]+";

    public boolean validateDataString(String data) {
        boolean result = false;

        if (data != null) {
            Pattern pattern = Pattern.compile(REGEX);
            Matcher matcher = pattern.matcher(data);

            if (matcher.matches()) {
                result = true;
                LOGGER.info("String is valid");
            } else {
                LOGGER.error("String isn't valid");
            }
        } else {
            LOGGER.error("String is null");
        }

        return result;
    }
}
