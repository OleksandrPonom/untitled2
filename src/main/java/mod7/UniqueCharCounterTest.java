package mod7;


class UniqueCharCounter{
    public long count(String phrase){
        long result = 0;
        for (int i = 0; i < phrase.length(); i++) {
            result = phrase.chars().distinct().count();
        }
        return result;
    }
}

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
