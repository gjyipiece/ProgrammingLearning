package com.guo.algorithm.recusion;

import com.guo.utils.Times;

/**
 * 斐波那契数列
 * 
 * @Description:
 * @author gjyip
 * @date 2021-04-05
 */
public class Fib {

	public static void main(String[] args) {

		int n = 42;
		Times.test("斐波那契数列1", () -> {
			System.out.println(fib1(n));
		});
		Times.test("斐波那契数列2", () -> {
			System.out.println(fib6(n));
		});
	}

	/**
	 * 暴力递归
	 * 
	 * @param n
	 * @return
	 */
	public static int fib1(int n) {
		if (n <= 2) {
			return 1;
		}
		return fib1(n - 2) + fib1(n - 1);
	}

	public static int fib6(int n) {
		if (n <= 2) {
			return 1;
		}
		int first = 1;
		int second = 1;
		for (int i = 3; i <= n; i++) {
			second = first + second;
			first = second - first;
		}
		return second;
	}
}
