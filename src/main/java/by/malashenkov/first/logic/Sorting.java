package by.malashenkov.first.logic;

import by.malashenkov.first.entity.ArrayEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sorting {
    private static final Logger LOGGER = LogManager.getLogger();

    public int[] bubbleSort(ArrayEntity array) {
        LOGGER.info("Start bubble sorting the array");

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

        return array.getArray();
    }

    public int[] shakerSort(ArrayEntity array) {
        LOGGER.info("Start shaker sorting the array");

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

        return array.getArray();
    }

    public void quickSort(ArrayEntity array, int firstElement, int lastElement) {
        LOGGER.info("Start quick sorting the array");

        if (array.size() == 0) {
            return;
        }
        if (firstElement >= lastElement) {
            return;
        }

        int middle = firstElement + (lastElement - firstElement) / 2;
        int supportElement = array.getElement(middle);

        int i = firstElement;
        int j = lastElement;
        while (i <= j) {
            while (array.getElement(i) < supportElement) {
                i++;
            }

            while (array.getElement(j) > supportElement) {
                j--;
            }

            if (i <= j) {
                int temp = array.getElement(i);
                array.setElement(i, array.getElement(j));
                array.setElement(j, temp);
                i++;
                j--;
            }
        }

        if (firstElement < j) {
            quickSort(array, firstElement, j);
        }
        if (lastElement > i) {
            quickSort(array, i, lastElement);
        }
    }
}
