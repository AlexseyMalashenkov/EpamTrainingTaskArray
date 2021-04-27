package by.malashenkov.first.logic;

import by.malashenkov.first.entity.ArrayEntity;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculationTest {

    private final Calculation calculation = new Calculation();
    private final int[] ARRAY = {4, 6, 100, -4, 56, -33, 0, 101};
    private ArrayEntity testArray;

    @BeforeTest
    public void beforeTest() {
        testArray = new ArrayEntity(ARRAY);
    }

    @Test
    public void testAverageElement() {
        double actual = calculation.averageElement(testArray);
        double expected = 28.75;

        assertEquals(actual, expected);
    }

    @Test
    public void testSumElement() {
        int actual = calculation.sumElement(testArray);
        int expected = 230;

        assertEquals(actual, expected);
    }

    @Test
    public void testMinElement() {
        int actual = calculation.minElement(testArray);
        int expected = -33;

        assertEquals(actual, expected);
    }

    @Test
    public void testMaxElement() {
        int actual = calculation.maxElement(testArray);
        int expected = 101;

        assertEquals(actual, expected);
    }

    @Test
    public void testPositiveElementCount() {
        int actual = calculation.positiveElementCount(testArray);
        int expected = 6;

        assertEquals(actual, expected);
    }

    @Test
    public void testNegativeElementCount() {
        int actual = calculation.negativeElementCount(testArray);
        int expected = 2;

        assertEquals(actual, expected);
    }
}