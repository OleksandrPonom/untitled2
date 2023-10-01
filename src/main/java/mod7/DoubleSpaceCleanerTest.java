package mod7;

import java.util.Arrays;

class DoubleSpaceCleaner{

    public String clean(String phrase){
        return phrase.strip().replaceAll("\\s+", " ");
    }
}

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}
