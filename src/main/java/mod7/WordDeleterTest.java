package mod7;

import java.util.ArrayList;
import java.util.Arrays;

class WordDeleter {
    public String remove(String phrase, String[] words) {
        String[] isParses = phrase.split("\\s+");
        String newPhrase = "";
        for (int i = 0; i < isParses.length; i++) {
            for (String word : words){
                    if (!isParses[i].equals(word)) {
                        newPhrase += isParses[i] + " ";
                    }

            }
        }
        String[] isParses2 = newPhrase.split("\\s+");
        for(int i = 0; i < isParses2.length; i++) {
            for(int j = 0; j < isParses2.length; j++) {
                if(i != j) {
                    if(isParses2[i].equals(isParses2[j])) {
                        isParses2[i] = "null";
                        isParses2[j] = "null";
                    }
                }
                else continue;
            }
        }
        String reult = "";
        for (String isP : isParses2){
            if(isP != "null"){
                reult += isP + " ";
            }
        }

        return reult.trim();
        }
 }

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));

        //lutoekj taizdop
        System.out.println(wordDeleter.remove("lutoekj yhypno vys zime egces taizdop ibfe", new String[] {"vys", "egces", "yhypno", "ibfe", "zime"}));

    }
}
