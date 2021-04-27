package by.malashenkov.first.util;

import by.malashenkov.first.exception.FileException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class DataReaderTest {
    private static final String PATH_TO_FILE= "src/test/resources/data/data.txt";
    DataReader dataReader;

    @BeforeTest
    public void beforeTest() {
        dataReader = new DataReader();
    }

    @Test
    public void testFileRead() throws FileException {

        List<String> list;

        list = dataReader.loadFileToList(PATH_TO_FILE);

        if (!list.isEmpty()) {
            System.out.println(list);
        }
    }
}
