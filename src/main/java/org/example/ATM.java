package org.example;

public class ATM {
    public int countBanknotes(int sum){
        int count = 0;
        while (sum > 0) {
              if (sum > 500) {
                sum = sum - 500;
                count++;
            } else if (sum > 200) {
                    sum = sum - 200;
                    count++;
                 } else if (sum > 100) {
                        sum = sum - 100;
                        count++;
                      } else if (sum > 50) {
                            sum = sum - 50;
                            count++;
                          } else if (sum > 20) {
                                sum = sum - 20;
                                count++;
                             } else if (sum > 10) {
                                    sum = sum - 10;
                                    count++;
                                 } else if (sum > 5) {
                                        sum = sum - 5;
                                        count++;
                                      } else if (sum > 2) {
                                            sum = sum - 2;
                                            count++;
                                              } else {
                                                sum = sum - 1;
                                                count++;
                                              }
        }
        return count;
    }

    public static void main(String[] args){
            ATM bank = new ATM();
            System.out.println(bank.countBanknotes(1378));
        }
}
