package mod_9.ArrayList;

public class MyArrayList <T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] data;
    private int size;
    public MyArrayList(){
        data = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /*public boolean addAll(int index, Collection<? extends E> c) {
        rangeCheckForAdd(index);

        Object[] a = c.toArray();
        modCount++;
        int numNew = a.length;
        if (numNew == 0)
            return false;
        Object[] elementData;
        final int s;
        if (numNew > (elementData = this.elementData).length - (s = size))
            elementData = grow(s + numNew);

        int numMoved = s - index;
        if (numMoved > 0)
            System.arraycopy(elementData, index,
                    elementData, index + numNew,
                    numMoved);
        System.arraycopy(a, 0, elementData, index, numNew);
        size = s + numNew;
        return true;
    }*/


    public void add(T value){
        if (size >= data.length){
            Object[] newArray = data;
            int newSize = newArray.length;
        }
        data[size] = value;
        size++;
    }

    public T get(int index){
        if (index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
    }
 /*   public T remove(int index){
        return data[index] = null;
    }*/

    public T[] clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
        return data;
    }

    public int size(){
        return data.length;
    }
}
