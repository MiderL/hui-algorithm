package com.poetr.algorithm;

/**
 * Leetcode 122 买卖股票的最佳时机
 *
 * @author poetr
 */
public class MaxProfitII {

    public static int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        // 差值
        int diff = 0;
        // 利润和
        int sum = 0;
        // 使用贪心算法，计算每一区间和差值，为正值时累加
        for (int i = 1; i < prices.length; i++) {
            diff = prices[i] - prices[i - 1];
            if (diff > 0) sum += diff;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int sum = maxProfit(prices);
        System.out.println(sum);
    }

}
