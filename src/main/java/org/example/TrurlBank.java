package org.example;

public class TrurlBank {
    /*public int sumQuads(int n){
        int sum = 0;
        while (n > 0){
            sum += n * n;
            n--;

        }
return sum;

    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(26));
    }*/

        public int sumQuads(int n) {
            int result = 0;

            while(n > 0) {
                result += n * n;
                n--;
            }

            return result;
        }

        public int countSumOfDigits(int number) {
            int result = 0;

            while (number > 0) {
                result = result + number % 10;
                number = number / 10;
            }
            return result;
        }

        public static void main(String[] args) {
            TrurlBank bank = new TrurlBank();

            //Should be 16 - 5 + 4 + 7
            System.out.println(bank.countSumOfDigits(547));
        }
    }
