package com.guo.leetcode.dp;

/**
 * https://leetcode-cn.com/problems/maximum-subarray/
 * 
 * @Description:
 * @author gjyip
 * @date 2021-05-16
 */
public class _0053_最大子序和 {

	/**
	 * 定义dp
	 * @param nums
	 * @return
	 */
	public int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		// dp
		int dp = nums[0];
		int max = dp;
		for (int i = 1; i < nums.length; i++) {
			if (dp < 0) {
				dp = nums[i];
			} else {
				dp = dp + nums[i];
			}
			max = Math.max(dp, max);
		}
		return max;
	}
}
