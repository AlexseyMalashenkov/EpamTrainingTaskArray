package by.malashenkov.first.validator;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidatorTest {
    private static final String STRING_VALID_FIRST = "1 2 3 4 5 6 7 8 9";
    private static final String STRING_INVALID_SECOND = "1 d2f 3";
    private static final String STRING_VALID_THIRD = "3 5 7 8 9";

    Validator validator;

    @BeforeTest
    public void beforeTest() {
        validator = new Validator();
    }

    @Test
    public void testValidStringFirst() {
        Assert.assertTrue(validator.validateDataString(STRING_VALID_FIRST));
    }

    @Test
    public void testValidStringSecond() {
        Assert.assertFalse(validator.validateDataString(STRING_INVALID_SECOND));
    }

    @Test
    public void testValidStringThird() {
        Assert.assertTrue(validator.validateDataString(STRING_VALID_THIRD));
    }
}
