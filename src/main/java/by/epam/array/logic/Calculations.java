package by.epam.array.logic;

import by.epam.array.entity.ArrayEntity;
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

    public int minElement(ArrayEntity array) {
        logger.info("Search for the min of array elements");

        int min = array.getElement(0);

        for (int element : array.getArray()) {
            if (element < min) {
                min = element;
            }
        }

        return min;
    }

    public int maxElement(ArrayEntity array) {
        logger.info("Search for the max of array elements");

        int max = array.getElement(0);

        for (int element : array.getArray()) {
            if (element > max) {
                max = element;
            }
        }

        return max;
    }

    public ArrayEntity elementReplacement(ArrayEntity array, int index, int number) {
        logger.info("Start replacing an element in an array");

        array.setElement(index, number);

        return array;
    }

    public int positiveElementCount(ArrayEntity array) {
        logger.info("Search for the count of positive array elements");

        int count = 0;

        for (int element : array.getArray()) {
            if (element >= 0) {
                count++;
            }
        }

        return count;
    }

    public int negativeElementCount(ArrayEntity array) {
        logger.info("Search for the count of negative array elements");

        int count = 0;

        for (int element : array.getArray()) {
            if (element < 0) {
                count++;
            }
        }

        return count;
    }
}
