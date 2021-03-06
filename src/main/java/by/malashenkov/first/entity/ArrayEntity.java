package by.malashenkov.first.entity;

public class ArrayEntity {
    private int[] array;

    public ArrayEntity(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return this.array;
    }

    public int getElement(int index){
        return this.array[index];
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

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i: this.array) {
            string.append(i);
            string.append(' ');
        }
        return string.toString();
    }
}
