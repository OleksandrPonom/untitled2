package org.example;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class CheapStocks {
    public String getCheapStocks(String[] stocks) {

        String result ="";
        for (int i = 0; i < stocks.length; i++) {
            String[] stocksData = stocks[i].split(" ");
              int priceStoks = Integer.parseInt(stocksData[1]);
               if(priceStoks < 200){
                   result += stocksData[0] + " ";
                }
            }

        return  result;
    }
    public static void main(String[] args) {
        CheapStocks shop = new CheapStocks();
        System.out.println(shop.getCheapStocks(new String[] {"Ilnyo 833", "Ricin 112", "baky 717", "rem 564", "yf 429", "qu 935", "tini 727", "qyha 584", "lyjiv 859", "Pi 306", "nuq 770"}));
    }
}
