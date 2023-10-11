package mod_9.ArrayList;

import java.util.Arrays;

public class MyArrayList <T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] data;
    private int size;
    public MyArrayList(){
        data = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(T value){
        resizeFromArrayLength();
        data[size] = value;
        size++;
    }

    private void resizeFromArrayLength() {
        if (size >= data.length) {
            System.out.println("The array has been resized " + size + ", data.length: " + data.length);
            int newSize = data.length * 2;
            Object[] newArray = new Object[newSize];
            System.arraycopy(data, 0, newArray, 0, data.length);
            data = (T[]) newArray;
        }
    }

    public T get(int index){
        if (index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
    }

    public T[] remove(int index){
        Object[] newArray = new Object[data.length];
        System.arraycopy(data, 0, newArray, 0, index);
        System.arraycopy(data, index + 1, newArray, index, data.length - index - 1);
        data = (T[]) newArray;
        System.out.println("Arrays.toString(data) = " + Arrays.toString(data));
        return (T[]) data;

    }

    public T[] clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
        System.out.println("data = " + Arrays.toString(data));
        return data;
    }

    public int size(){
        return data.length;
    }
}
