package mod_9.ArrayList;

import java.util.Arrays;

public class _MyArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(0);
        myArrayList.add(6);
        myArrayList.add(10);
        myArrayList.add(2);
        myArrayList.add(7);
        myArrayList.add(9);
        myArrayList.add(20);
        myArrayList.add(33);
        myArrayList.add(31);
        myArrayList.add(20);
        myArrayList.add(44);

        Integer element = myArrayList.get(2);
        System.out.println("element = " + element);
        System.out.println("size = " + myArrayList.size());

        myArrayList.remove(2);

        myArrayList.clear();
        Integer cl = myArrayList.get(1);
        System.out.println("cl = " + cl);

    }
}
