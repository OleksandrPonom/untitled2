package org.example;
import java.util.Arrays;

class BubleSort {
    public static void main(String[] args) {
        int[] array = new int[] {0, -2,-1, -5, 10, 12, 2, 78, 44};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}