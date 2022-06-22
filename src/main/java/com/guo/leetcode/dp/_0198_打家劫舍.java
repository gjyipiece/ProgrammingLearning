package com.guo.leetcode.dp;

/**
 * https://leetcode-cn.com/problems/house-robber/
 * 
 * @Description:
 * @author gjyip
 * @date 2021-05-16
 */
public class _0198_打家劫舍 {

	public int rob(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		if (nums.length == 1) {
			return nums[0];
		}

		if (nums.length == 2) {
			return Math.max(nums[1], nums[0]);
		}

		int length = nums.length;
		int[] dp = new int[length];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[1], nums[0]);
		for (int i = 2; i < length; i++) {
			dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
		}
		return dp[length - 1];
	}
}
