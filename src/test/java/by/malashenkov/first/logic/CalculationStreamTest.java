package by.malashenkov.first.logic;

import by.malashenkov.first.entity.ArrayEntity;
import by.malashenkov.first.exception.InvalidDataException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculationStreamTest {
    private final CalculationStream calculation = new CalculationStream();
    private final int[] ARRAY = {4, 6, 100, -4, 56, -33, 0, 101};
    private ArrayEntity testArray;

    @BeforeTest
    public void beforeTest() {
        testArray = new ArrayEntity(ARRAY);
    }

    @Test
    public void testAverageElement() throws InvalidDataException {
        double actual = calculation.averageElementStream(testArray);
        double expected = 28.75;

        assertEquals(actual, expected);
    }

    @Test
    public void testSumElement() throws InvalidDataException{
        int actual = calculation.sumElementStream(testArray);
        int expected = 230;

        assertEquals(actual, expected);
    }

    @Test
    public void testMinElement() throws InvalidDataException {
        int actual = calculation.minElementStream(testArray);
        int expected = -33;

        assertEquals(actual, expected);
    }

    @Test
    public void testMaxElement() throws InvalidDataException {
        int actual = calculation.maxElementStream(testArray);
        int expected = 101;

        assertEquals(actual, expected);
    }

    @Test
    public void testPositiveElementCount() throws InvalidDataException {
        int actual = calculation.positiveElementCountStream(testArray);
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    public void testNegativeElementCount() throws InvalidDataException {
        int actual = calculation.negativeElementCountStream(testArray);
        int expected = 2;

        assertEquals(actual, expected);
    }
}
