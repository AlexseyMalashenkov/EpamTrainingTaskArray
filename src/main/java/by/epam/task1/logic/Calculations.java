package by.epam.task1.logic;

import by.epam.task1.entity.ArrayEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculations {
    static Logger logger = LogManager.getLogger();

    public double averageElement(ArrayEntity array) {
        logger.info("Search for the average value of array elements");

        return (double) sumElement(array) / array.size();
    }

    public int sumElement(ArrayEntity array) {
        logger.info("Search for the sum of array elements");

        int sum = 0;

        for (int element : array.getArray()) {
            sum += element;
        }

        return sum;
    }
}
