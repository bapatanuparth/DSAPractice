package dynamicProgramming;

import java.util.Arrays;

public class PaintingTheFence {

	// very intuitive solution
	long countWaysEff(int n, int k) {
		// code here.
		if (n == 1)
			return k;
		if (n == 2)
			return k * k;

		long same = k * 1;
		long diff = k * (k - 1);
		long total = (same + diff) % 1000000007;

		for (int i = 3; i <= n; i++) {
			same = diff * 1;
			diff = total * (k - 1) % 1000000007;
			total = (same + diff) % 1000000007;
		}

		return total;
	}

	// way 2
	long countWays(int n, int k) {
		// code here.
		long dp[] = new long[n + 1];
		Arrays.fill(dp, -1);
		return solution(n, k, dp) % 1000000007;
	}

	long solution(int n, int k, long dp[]) {

		if (n == 1)
			return k;
		if (n == 2)
			return k * k;
		if (dp[n] != -1)
			return dp[n];

		return dp[n] = solution(n - 2, k, dp) * (k - 1) % 1000000007 + solution(n - 1, k, dp) * (k - 1) % 1000000007;
	}
}
