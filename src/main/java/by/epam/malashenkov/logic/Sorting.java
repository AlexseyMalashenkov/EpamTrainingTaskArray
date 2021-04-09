package by.epam.malashenkov.logic;

import by.epam.malashenkov.entity.ArrayEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sorting {
    static Logger logger = LogManager.getLogger();

    public void bubbleSort(ArrayEntity array) {
        logger.info("Start bubble sorting the array");

        int tmp;

        for (int k = array.size() - 1; k > 0; k--) {
            for (int i = 0; i < k; i++) {
                if (array.getElement(i) > array.getElement(i + 1)) {
                    tmp = array.getElement(i);
                    array.setElement(i, array.getElement(i + 1));
                    array.setElement(i + 1, tmp);
                }
            }
        }
    }

    public void shakerSort(ArrayEntity array) {
        logger.info("Start shaker sorting the array");

        int temp;
        int leftSide = 0;
        int rightSide = array.size() - 1;

        do {
            for (int i = leftSide; i < rightSide; i++) {
                if (array.getElement(i) > array.getElement(i + 1)) {
                    temp = array.getElement(i);
                    array.setElement(i, array.getElement(i + 1));
                    array.setElement(i + 1, temp);
                }
            }
            rightSide--;

            for (int i = rightSide; i > leftSide; i--) {
                if (array.getElement(i) < array.getElement(i - 1)) {
                    temp = array.getElement(i);
                    array.setElement(i, array.getElement(i - 1));
                    array.setElement(i - 1, temp);
                }
            }
            leftSide++;
        } while (leftSide < rightSide);
    }

    public void quickSort(ArrayEntity array, int firstElement, int lastElement) {
        logger.info("Start quick sorting the array");

    }
}
