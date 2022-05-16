/* Difficulty: EASY
 * Status: UNSOLVED
 * You are climbing a staircase. It takes n steps to reach the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
package LeenCodeJava;

public class ClimbingStairs {
	public int climbStairs(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (n % 2 == 1) {
			int add = 0;
			for (int i = 0; i <= n / 2; i++) {
				add += binomialCoeff(n, i) - binomialCoeff(n - 1, i);
			}
			return add + climbStairs(n - 1);
		} else {
			int add = 0;
			for (int i = 0; i < n / 2; i++) {
				add += binomialCoeff(n, i) - binomialCoeff(n - 1, i);
			}
			return add + 1 + climbStairs(n - 1);
		}
	}

	public int binomialCoeff(int n, int k) {
		int res = 1;
		int prod = 1;
		if (k > n - k)
			k = n - k;
		for (int i = 0; i < k; ++i) {
			res *= (n - i);
			prod *= (i + 1);
			if (res % prod == 0) {
				res /= prod;
				prod = 1;
			}
		}

		return res;
	}
}

/*
 * 4 1 + 1 + 1 + 1 4C0 1 + 1 + 2 3C1 2 + 2 2C2
 * 
 * 5 1 + 1 + 1 + 1 + 1 5C0 1 + 1 + 1 + 2 4C1 1 + 2 + 2 3C2
 * 
 * 6 1 + 1 + 1 + 1 + 1 + 1 6C0 1 + 1 + 1 + 1 + 2 5C1 1 + 1 + 2 + 2 4C2 2 + 2 + 2
 * 3C3
 */
