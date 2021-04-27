package by.malashenkov.first.logic;

import by.malashenkov.first.entity.ArrayEntity;
import by.malashenkov.first.util.RoundDouble;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculation {
    private static final Logger LOGGER = LogManager.getLogger();

    public double averageElement(ArrayEntity array) {
        double average = (double) sumElement(array) / array.size();

        LOGGER.info("Average value of array elements = " + RoundDouble.round(average));

        return RoundDouble.round(average);
    }

    public int sumElement(ArrayEntity array) {
        int sum = 0;

        for (int element : array.getArray()) {
            sum += element;
        }

        LOGGER.info("Sum of array elements = " + sum);

        return sum;
    }

    public int minElement(ArrayEntity array) {
        int min = array.getElement(0);

        for (int element : array.getArray()) {
            if (element < min) {
                min = element;
            }
        }

        LOGGER.info("Min of array elements = " + min);

        return min;
    }

    public int maxElement(ArrayEntity array) {

        int max = array.getElement(0);

        for (int element : array.getArray()) {
            if (element > max) {
                max = element;
            }
        }

        LOGGER.info("Max of array elements = " + max);

        return max;
    }

    public boolean elementReplacement(ArrayEntity array, int index, int number) {
        boolean key = false;
        if (index <= array.size() - 1) {
            key = true;
            array.setElement(index, number);

            LOGGER.info("Element replacement was successful");
        } else {
            LOGGER.error("Index more that array size");
        }

        return key;
    }

    public int positiveElementCount(ArrayEntity array) {
        int count = 0;

        for (int element : array.getArray()) {
            if (element >= 0) {
                count++;
            }
        }

        LOGGER.info("Count of positive array elements = " + count);

        return count;
    }

    public int negativeElementCount(ArrayEntity array) {
        int count = 0;

        for (int element : array.getArray()) {
            if (element < 0) {
                count++;
            }
        }

        LOGGER.info("Count of negative array elements = " + count);

        return count;
    }
}