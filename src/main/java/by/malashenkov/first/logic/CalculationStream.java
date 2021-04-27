package by.malashenkov.first.logic;

import by.malashenkov.first.entity.ArrayEntity;
import by.malashenkov.first.exception.InvalidDataException;
import by.malashenkov.first.util.RoundDouble;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.stream.IntStream;

public class CalculationStream {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final String TEXT_EXCEPTION = "Invalid array";

    public double averageElementStream(ArrayEntity array) throws InvalidDataException {
        if (array == null) {
            LOGGER.error(TEXT_EXCEPTION);
            throw new InvalidDataException(TEXT_EXCEPTION);
        }

        double average = IntStream.of(array.getArray()).average().orElseThrow();

        LOGGER.info("Average value of array elements with stream = " + RoundDouble.round(average));


        return RoundDouble.round(average);
    }

    public int sumElementStream(ArrayEntity array) throws InvalidDataException{
        if (array == null) {
            LOGGER.error(TEXT_EXCEPTION);
            throw new InvalidDataException(TEXT_EXCEPTION);
        }

        int sum = IntStream.of(array.getArray()).sum();

        LOGGER.info("Sum of array elements with stream = " + sum);

        return sum;
    }

    public int minElementStream(ArrayEntity array) throws InvalidDataException{
        if (array == null) {
            LOGGER.error(TEXT_EXCEPTION);
            throw new InvalidDataException(TEXT_EXCEPTION);
        }
        int min = IntStream.of(array.getArray()).min().orElseThrow();

        LOGGER.info("Min of array elements with stream = " + min);

        return min;
    }

    public int maxElementStream(ArrayEntity array) throws InvalidDataException{
        if (array == null) {
            LOGGER.error(TEXT_EXCEPTION);
            throw new InvalidDataException(TEXT_EXCEPTION);
        }
        int max = IntStream.of(array.getArray()).max().orElseThrow();

        LOGGER.info("Max of array elements with stream = " + max);

        return max;
    }

    public int positiveElementCountStream(ArrayEntity array) throws InvalidDataException{
        if (array == null) {
            LOGGER.error(TEXT_EXCEPTION);
            throw new InvalidDataException(TEXT_EXCEPTION);
        }

        int[] positiveArray = IntStream.of(array.getArray())
                .filter(value -> value > 0)
                .toArray();

        LOGGER.info("Count of positive array elements with stream = " + positiveArray.length);

        return positiveArray.length;
    }

    public int negativeElementCountStream(ArrayEntity array) throws InvalidDataException {
        if (array == null) {
            LOGGER.error(TEXT_EXCEPTION);
            throw new InvalidDataException(TEXT_EXCEPTION);
        }

        int[] negativeArray = IntStream.of(array.getArray())
                .filter(value -> value < 0)
                .toArray();

        LOGGER.info("Count of negative array elements with stream = " + negativeArray.length);

        return negativeArray.length;
    }
}
