package by.malashenkov.first.logic;

import by.malashenkov.first.entity.ArrayEntity;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortTest {

    private final Sorting sort = new Sorting();
    private final int[] ARRAY = {4, 6, 100, -4, 56, -33, 0, 101};
    private ArrayEntity testArray;

    @BeforeTest
    public void beforeTest() {
        testArray = new ArrayEntity(ARRAY);
    }

    @Test
    public void testBubbleSort() {
        int[] actual = sort.bubbleSort(testArray);
        int[] expected = {-33, -4, 0, 4, 6, 56, 100, 101};

        assertEquals(actual, expected);
    }

    @Test
    public void testShakerSort() {
        int[] actual = sort.shakerSort(testArray);
        int[] expected = {-33, -4, 0, 4, 6, 56, 100, 101};

        assertEquals(actual, expected);
    }
}
