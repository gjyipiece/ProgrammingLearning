package com.guo.leetcode.dp;

import com.guo.utils.Times;

/**
 * https://leetcode-cn.com/problems/climbing-stairs/
 * 
 * @Description:
 * @author gjyip
 * @date 2021-05-16
 */
public class _0070_爬楼梯 {

	public static void main(String[] args) {
		int n = 3;
		Times.test("climbStairs1", () -> {
			System.out.println(climbStairs1(n));
		});
	}

	/**
	 * 记忆化递归
	 * 
	 * @param n
	 * @return
	 */
	public static int climbStairs2(int n) {
		if (n <= 2) {
			return 1;
		}

		return climbStairs1(n - 1) + climbStairs1(n - 2);
	}

	/**
	 * 暴力递归
	 * 
	 * @param n
	 * @return
	 */
	public static int climbStairs1(int n) {
		if (n <= 2) {
			return 1;
		}

		return climbStairs1(n - 1) + climbStairs1(n - 2);
	}

	/**
	 * 利用滚动数组
	 * 
	 * 时间复杂度 O(n) 空间间复杂度 O(1)
	 * 
	 * @param n
	 * @return
	 */
	public int climbStairs5(int n) {
		if (n < 2) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		int first = 1;
		int second = 2;
		for (int i = 3; i <= n; i++) {
			second = first + second;
			first = second - first;
		}
		return second;
	}

}
