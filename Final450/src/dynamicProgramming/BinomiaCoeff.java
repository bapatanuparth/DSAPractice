package dynamicProgramming;

//Given two integers n and r, find nCr. Since the answer may be very large, calculate the answer modulo 109+7.
public class BinomiaCoeff {

	static int nCr(int n, int r) {
		// code here
		int M = 1000000007;
		int dp[][] = new int[n + 1][r + 1];

		// fill the details for nC0 == 1 and nCn ==1 and nC1 == n
		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= r; j++) {
				if (j == i || j == 0)
					dp[i][j] = 1;
				if (j == 1)
					dp[i][j] = i;
			}
		}

		// use tabulation
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= r; j++) {
				if (j > i)
					continue;
				dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % M;

			}
		}

		return dp[n][r];
	}
}
