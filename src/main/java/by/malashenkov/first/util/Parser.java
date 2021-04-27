package by.malashenkov.first.util;

import by.malashenkov.first.entity.ArrayEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Parser {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final String REGEX = " ";

    public ArrayEntity stringToNumber(String data) {
        String[] stringArray = data.split(REGEX);
        int[] numbers = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            numbers[i] = Integer.parseInt(stringArray[i]);
        }

        ArrayEntity array = new ArrayEntity(numbers);

        return array;
    }
}
