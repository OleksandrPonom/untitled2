package Quarke;

class TotalScore {
    public int sum(int[] score) {
        int result = 0;
        int index = 0;

        while(index < score.length) {

                result += score[index];
                index++;


        }

        return result;
    }
}

class TotalScoreTest {
    public static void main(String[] args) {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore().sum(score));
    }
}
