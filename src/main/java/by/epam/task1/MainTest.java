package by.epam.task1;


import by.epam.task1.entity.ArrayEntity;
import by.epam.task1.logic.Calculations;

public class MainTest {
    public static void main(String[] args) {
        int[] a = {1,2,2};
        ArrayEntity array = new ArrayEntity(a);
        Calculations c = new Calculations();
        System.out.println(c.sumElement(array));
        System.out.println(c.averageElement(array));
    }
}
