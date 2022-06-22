package com.guo.algorithm.dp;

import com.guo.utils.Times;

/**
 * @Description:
 * @author gjyip
 * @date 2021-05-02
 */
public class CoinChange {

	public static void main(String[] args) {
		int n = 41;
		Times.test("coinChange1", () -> {
			System.out.println(coinChange1(n));
		});

		Times.test("coinChange2", () -> {
			System.out.println(coinChange2(n));
		});

		Times.test("coinChange3", () -> {
			System.out.println(coinChange3(n));
		});

		Times.test("coinChange4", () -> {
			System.out.println(coinChange4(n));
		});
	}

	/**
	 * 递推（自底向上） 打印面值
	 * 
	 * @return
	 */
	public static int coinChange4(int n) {
		if (n < 1) {
			return -1;
		}

		int[] dp = new int[n + 1];
		int[] faces = new int[dp.length];
		for (int i = 1; i <= n; i++) {
			// dp[i]= Math.min(dp[n-1],dp[n-5],dp[n-20],dp[n-25]) +1
			int min = Integer.MAX_VALUE;
			if (i >= 1 && dp[i - 1] < min) {
				min = dp[i - 1];
				faces[i] = 1;
			}
			if (i >= 5 && dp[i - 5] < min) {
				min = dp[i - 5];
				faces[i] = 5;
			}

			if (i >= 20 && dp[i - 20] < min) {
				min = dp[i - 20];
				faces[i] = 20;
			}

			if (i >= 25 && dp[i - 25] < min) {
				min = dp[i - 25];
				faces[i] = 25;
			}
			dp[i] = min + 1;
		}
		print(faces, n);
		return dp[n];
	}

	/**
	 * 递推（自底向上）
	 * 
	 * @return
	 */
	public static int coinChange3(int n) {
		if (n < 1) {
			return -1;
		}

		int[] dp = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			// dp[i]= Math.min(dp[n-1],dp[n-5],dp[n-20],dp[n-25]) +1
			int min = Integer.MAX_VALUE;
			if (i >= 1) {
				min = Math.min(dp[i - 1], min);
			}
			if (i >= 5) {
				min = Math.min(dp[i - 5], min);
			}

			if (i >= 20) {
				min = Math.min(dp[i - 20], min);
			}

			if (i >= 25) {
				min = Math.min(dp[i - 25], min);
			}
			dp[i] = min + 1;
		}
		return dp[n];
	}

	private static void print(int[] faces, int n) {
		while (n > 0) {
			System.out.print(faces[n] + " ");
			n -= faces[n];
		}
		System.out.println();
	}

	/**
	 * 暴力递归（自顶向下）
	 * 
	 * @return
	 */
	public static int coinChange2(int n) {
		if (n < 1) {
			return -1;
		}
		int[] dp = new int[n + 1];
		int[] faces = { 1, 5, 20, 25 };
		for (int face : faces) {
			if (n < face) {
				break;
			}
			dp[face] = 1;
		}
		return coins2(n, dp);
	}

	static int coins2(int n, int[] dp) {
		// 这里的是递归基
		if (n < 1) {
			return Integer.MAX_VALUE;
		}

		if (dp[n] == 0) {
			// 此时说明要计算一遍
			int min1 = Math.min(coins(n - 25), coins(n - 20));
			int min2 = Math.min(coins(n - 5), coins(n - 1));
			dp[n] = Math.min(min1, min2) + 1;
		}
		return dp[n];
	}

	/**
	 * 暴力递归（自顶向下）
	 * 
	 * @return
	 */
	public static int coinChange1(int n) {
		return coins(n);
	}

	static int coins(int n) {
		if (n < 1) {
			return Integer.MAX_VALUE;
		}
		// 还需要考虑负数的情况
		if (n == 25 || n == 20 || n == 5 || n == 1) {
			return 1;
		}
		int min1 = Math.min(coins(n - 25), coins(n - 20));
		int min2 = Math.min(coins(n - 5), coins(n - 1));
		return Math.min(min1, min2) + 1;
	}

}
