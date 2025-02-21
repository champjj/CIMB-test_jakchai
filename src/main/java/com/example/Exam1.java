package com.example;

public class Exam1 {
    
    public static int arrProfit(int[] prices) {

        // check array null or length = 0
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE; // for get min prices
        int arrProfit = 0; // for get high profit

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // set lower price
            } else if (price - minPrice > arrProfit) {
                arrProfit = price - minPrice; // set high profit
            }
        }

        return arrProfit;
    }
}
