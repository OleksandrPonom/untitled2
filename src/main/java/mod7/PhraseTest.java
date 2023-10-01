package mod7;

import java.util.Arrays;


class Phrase{

    public final String[] words;
   public Phrase(final String[] words) {
        this.words = Arrays.copyOfRange(words, 0, words.length);

    }

    @Override
    public String toString() {
        return Arrays.toString(words).replace("[", "").replace(",", "").replace("]", "");
    }
}

class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}
