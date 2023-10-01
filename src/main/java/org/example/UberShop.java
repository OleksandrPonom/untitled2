package org.example;
import java.util.*;

public class UberShop {
  /*  public void printPrices(float[] prices) {
        for(float price: prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices){

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] >= 1000){
                prices[i] = prices[i] * 1.5f;
            } else {
                prices[i] = prices[i] * 2.0f;
            }
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
                if(prices[0]==prices[prices.length-1]){
                    int[] result = new int[]{prices[0]};
                    return result;
                } else {
                    Arrays.sort(prices);
                    int[] result = {prices[0], prices[prices.length-1]};
                    return result;
                }
            }
        return prices;
    }
*/
   /* public int getMinPriceCount(int[] prices) {
        Arrays.sort(prices);
        int min = prices[0];
        int serch = 0;
        for (int i = 0; i < prices.length; i++) {
           if (prices[i] < min) {
               min = prices[i];
           }
           if (prices[i] == min) {
                      serch++;

                        }
                    }



        return serch;
    }*/
    /*public int[] removePrice(int[] prices, int toRemove) {
        int count = 0;
        for (int price : prices){
            if(price != toRemove){
                count++;
            }}
        int[] newPrices = new int[count];
        int j = 0;
            for (int i = 0; i < prices.length; i++) {
                if(prices[i] != toRemove){
                    newPrices[j] = prices[i];
                    j++;
                }


            }
        return newPrices;
    }*/

    /*public int[] leavePrice9(int[] prices){
        int count = 0;

        for (int price : prices) {
            int digist = price % 10;
            if(digist == 9){
                count++;
                System.out.println("count = " + count);
        }
        }
        int[] newPrices = new int[count];
        int j = 0;
        for (int i = 0; i < prices.length; i++) {
            int digist = prices[i] % 10;
            if(digist == 9){
                newPrices[j] = prices[i];
                j++;
            }
        }
        return newPrices;
    }
*/

  /*  public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        String[] resultArray = new String[showcaseStocks.length + warehouseStocks.length];
        System.arraycopy(showcaseStocks, 0 , resultArray, 0, showcaseStocks.length);
        System.arraycopy(warehouseStocks, 0, resultArray, showcaseStocks.length, warehouseStocks.length);
        for (int i = 0; i < resultArray.length; i++) {
                }
       return resultArray;
    }*/

    public int getPricesSum(int[] prices, int minPrice, int maxPrice){
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            if(minPrice <= prices[i] && prices[i] <= maxPrice){
                sum = sum + prices[i];
            }
        }
    return sum;
    }


    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));
    }

}
