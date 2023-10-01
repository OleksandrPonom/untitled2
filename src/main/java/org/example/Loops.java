package org.example;

public class Loops {
    public static void main(String[] args) {
//        int counter = 0;
//       while (counter < 4) {
//            counter++;
 //           System.out.println(counter);
 //       }

 //       do {
 //           counter++;
 //           System.out.println(counter);
  //      } while (false);
    int[] array = new int[] {1, 2, 3, 4, 5};

//    for (int i=0; i < array.length; i++) {
//        System.out.println(i + " " + array[i]);

        for (int element : array) {
            System.out.println("element = " + element);
        }
    }

    }


