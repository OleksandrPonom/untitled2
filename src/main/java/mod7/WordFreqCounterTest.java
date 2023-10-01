package mod7;

class WordFreqCounter{
    public float countFreq(String phrase, String word){
        float result = 0;
        float k = 0;
        int a = phrase.split(" ").length;
        String[] texts = phrase.split("\\s+");
        for (String text:
                texts) {
            if(text.toLowerCase().equals(word.toLowerCase())){
                k += 1;
            }
        }
        result = k / a;
        return result;
    }
}

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));

        //0.2142857164144516
        System.out.println(freqCounter.countFreq("fyulseuswuq ezcagu xogabanune milah tulovufiaqv daf efgynia milah ynab dyrya milah cirovoadve gidage exiw", "milah"));


    }
}
