package mod7;

class ShortWordCounter{
    public int count(String phrase, int minLength){
        int result = 0;
        String[] texts = phrase.split("\\s+");
        for (String text:
                texts) {
            if(text.length() <= minLength){
                result += 1;
            }
        }
           return result;
    }

}

class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}
