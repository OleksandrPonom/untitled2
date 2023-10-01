package mod6;

import java.util.Arrays;

class PowTable {
    public static final int[] POWERS_2;
    static{
        int[] a = new int[11];
        for(int i = 1; i < a.length; i++) {

                a[i] = i * i;
        }
        POWERS_2 = Arrays.copyOfRange(a,1,11);
    }
}

class PowTableTest {
    public static void main(String[] args) {
        //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}
class GameSaver {
    static {
        System.out.println("GameSaver created!");
    }
}