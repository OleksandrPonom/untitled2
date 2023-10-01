package mod7;

class PalindromeCounter{
    public static String reverse(String phrase)
    {
        if (phrase == null || phrase.equals("")) {
            return phrase;
        }
        return reverse(phrase.substring(1)) + phrase.charAt(0);
    }

    public int count(String phrase){
        int result = 0;
        String[] texts = phrase.split("\\s+");
        for (String text:
                texts) {
            text = text.toLowerCase();
            String newText = reverse(text);
            System.out.println("newText = " + newText);
            if(text.equals(newText) == true){
               result += 1;
            }
        }
        return result;
    }
}

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}
