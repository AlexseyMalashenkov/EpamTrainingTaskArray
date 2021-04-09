package by.epam.task1.entity;

public class ArrayEntity {
    private int[] array;

    public ArrayEntity(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return this.array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setElement(int index, int value) {
        this.array[index] = value;
    }

    public int size(){
        return this.array.length;
    }
}
