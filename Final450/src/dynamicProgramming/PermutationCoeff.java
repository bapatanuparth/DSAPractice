package dynamicProgramming;

//p(n, k)= n!/(n-k)!
public class PermutationCoeff {

	int permute(int n, int r) {

		int[][] dp = new int[n + 1][r + 1];

		// write base cases for nP1 = n, np0=1, nPn=1
		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= r; j++) {

				if (i == j || j == 0)
					dp[i][j] = 1;

				if (j == 1)
					dp[i][j] = i;
			}
		}

		// solve in bottom up dp
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= r; j++) {

				if (j > i)
					continue;

				dp[i][j] = dp[i - 1][j] + (j * dp[i - 1][j - 1]); // formula to recursively calculate the value
			}
		}

		return dp[n][r];

	}
}
