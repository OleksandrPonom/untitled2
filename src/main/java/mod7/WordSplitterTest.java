package mod7;

import java.util.Arrays;

class WordSplitter{
    public String[] split(String phrase){

        return phrase.toLowerCase().split("\\s+");
    }
}

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}