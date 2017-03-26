package hacker_rank.algorithm.dynamic_programming.stock_maximize;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by wayne on 2017. 3. 25..
 *
 */
public class StockMaximizeSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int N = in.nextInt();
            int[] prices = new int[N];
            for(int prices_i=0; prices_i < N; prices_i++){
                prices[prices_i] = in.nextInt();
            }
            System.out.println(getMaxProfit(prices));
        }
    }

    /**
     * 가격 리스트를 뒤에서부터 순회한다.
     * @param prices N일의 주식 가격 목록
     * @return 최대 이익
     */
    public static long getMaxProfit(int[] prices) {
        long profit = 0L;
        int maxPrice = Integer.MIN_VALUE;

        for (int i = prices.length - 1; i >= 0; i--) {
            if (prices[i] >= maxPrice) maxPrice = prices[i];
            profit += maxPrice - prices[i];
        }

        return profit;
    }

    /**
     * 가격 리스트를 앞에서부터 순회한다.
     * @param prices N일의 주식 가격 목록
     * @return 최대 이익
     */
    public static long getMaxProfit2(int[] prices) {
        long profit = 0;
        for (int i = 0; i < prices.length; i++) {
            int maxPrice = 0;
            for (int j = i; j < prices.length; j++) {
                if (prices[j] > maxPrice) maxPrice = prices[j];
            }
            profit += (maxPrice - prices[i]);
        }
        return profit;
    }

//    public static long getMaxProfit(int[] prices) {
//        long[][] memo = new long[prices.length + 1][prices.length + 1];
//        for (int i = 0; i < memo.length; i++) {
//            for (int j = 0; j < memo.length; j++) {
//                memo[i][j] = -1;
//            }
//        }
//        return getMaxProfit(0,0, prices, memo);
//    }
//
//    private static long getMaxProfit(int owned, int index, int[] prices, long[][] memo) {
//        if (index == prices.length - 1 ) {
//            if (owned == 0) {
//                return 0;
//            }
//
//            return prices[index] * owned;
//        }
//
//        if (memo[owned][index] >= 0) return memo[owned][index];
//
//        // 산다
//        long profit1 = getMaxProfit(owned + 1, index + 1, prices, memo) - prices[index];
//
//        // 판다
//        long profit2 = 0;
//        if (owned != 0) {
//            profit2 = getMaxProfit(0, index + 1, prices, memo) + (prices[index] * owned);
//        }
//
//        // 아무것도 안한다
//        long profit3 = getMaxProfit(owned, index + 1, prices, memo);
//
//        System.out.println("o : " + owned + ", index : " + index);
//        return memo[owned][index] =  Stream.of(profit1, profit2, profit3).max(Long::compareTo).get();
//    }

}
