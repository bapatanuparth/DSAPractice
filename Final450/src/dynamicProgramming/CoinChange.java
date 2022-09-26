package dynamicProgramming;

//Given a value N, find the number of ways to make change for N cents, 

//if we have infinite supply of each of S = { S1, S2, .. , SM } valued coins.

public class CoinChange {

//bottom up / tabulation approach
	public long count(int S[], int n, int sum) {
		// code here.

		long[][] dp = new long[sum + 1][n + 1];

		for (int i = 0; i <= n; i++)
			dp[0][i] = 1; // if sum ==0 we can make it with any # of coins in 1 way

		for (int i = 0; i <= sum; i++)
			dp[i][0] = 0; // if #of coins ==0 we cant make any sum

		for (int i = 1; i <= sum; i++) { // indexes of the DP table

			for (int j = 1; j <= n; j++) {

				dp[i][j] = dp[i][j - 1]; // case 1: we do not include the current coin in the sum

				if (S[j - 1] <= i) { // we include the coin in the sum and add no.of ways we could get to the amount
										// - coin_value
					dp[i][j] += dp[i - S[j - 1]][j];
				}
			}
		}

		return dp[sum][n];
	}
}
