package com.guo.leetcode.dp;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * @Description:
 * @author gjyip
 * @date 2021-05-16
 */
public class _0121_买卖股票的最佳时机 {

	public static void main(String[] args) {

	}

	/**
	 * 一次遍历
	 * 
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices) {

		// 把每天当作要卖出的一天
		if (prices == null || prices.length == 0) {
			return 0;
		}

		// 前面扫描过的最小价格
		int minPrice = prices[0];
		// 前面扫描过的最大利润
		int maxProfit = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else {
				maxProfit = Math.max(maxProfit, prices[i] - minPrice);
			}
		}

		return maxProfit;
	}
}
