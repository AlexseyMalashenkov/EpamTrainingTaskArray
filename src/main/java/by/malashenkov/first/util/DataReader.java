package by.malashenkov.first.util;

import by.malashenkov.first.exception.FileException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DataReader {
    private static final Logger LOGGER = LogManager.getLogger();

    public List<String> loadFileToList(String myPathToTheFile) throws FileException {
        List<String> data;

        try {
            data = Files.readAllLines(Paths.get(myPathToTheFile));
        } catch (IOException e) {
            LOGGER.error("Failed to load file " + myPathToTheFile);
            throw new FileException("Failed to load file " + myPathToTheFile);
        }

        LOGGER.info("Success load from file");
        return data;
    }
}
