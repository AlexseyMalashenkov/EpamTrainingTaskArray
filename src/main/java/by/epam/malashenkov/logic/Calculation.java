package by.epam.malashenkov.logic;

import by.epam.malashenkov.entity.ArrayEntity;
import by.epam.malashenkov.util.RoundDouble;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculation {
    static Logger logger = LogManager.getLogger();

    public double averageElement(ArrayEntity array) {
        double average = (double) sumElement(array) / array.size();

        logger.info("Average value of array elements = " + RoundDouble.round(average));

        return RoundDouble.round(average);
    }

    public int sumElement(ArrayEntity array) {
        int sum = 0;

        for (int element : array.getArray()) {
            sum += element;
        }

        logger.info("Sum of array elements = " + sum);

        return sum;
    }

    public int minElement(ArrayEntity array) {
        int min = array.getElement(0);

        for (int element : array.getArray()) {
            if (element < min) {
                min = element;
            }
        }

        logger.info("Min of array elements = " + min);

        return min;
    }

    public int maxElement(ArrayEntity array) {

        int max = array.getElement(0);

        for (int element : array.getArray()) {
            if (element > max) {
                max = element;
            }
        }

        logger.info("Max of array elements = " + max);

        return max;
    }

    public ArrayEntity elementReplacement(ArrayEntity array, int index, int number) {

//add index check
        array.setElement(index, number);

        logger.info("After replacing an element in an array - " + array.toString());

        return array;
    }

    public int positiveElementCount(ArrayEntity array) {

        int count = 0;

        for (int element : array.getArray()) {
            if (element >= 0) {
                count++;
            }
        }

        logger.info("Count of positive array elements = " + count);

        return count;
    }

    public int negativeElementCount(ArrayEntity array) {
        int count = 0;

        for (int element : array.getArray()) {
            if (element < 0) {
                count++;
            }
        }

        logger.info("Count of negative array elements = " + count);

        return count;
    }
}