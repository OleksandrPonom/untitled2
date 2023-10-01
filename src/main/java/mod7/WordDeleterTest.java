package mod7;

import java.util.Arrays;

class WordDeleter{
    public String remove(String phrase, String[] words){
        String newPhrase = phrase.replaceAll(Arrays.toString(words), "");
        System.out.println("newPhrase = " + newPhrase);
        return newPhrase.trim();
    }
}

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}
