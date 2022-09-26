package dynamicProgramming;

public class FriendsPairingProblem {

	public long countFriendsPairings(int n) {
		// code here
		long M = 1000000007;

		long dp[] = new long[n + 1];

		for (int i = 0; i <= n; i++) {
			if (i <= 2)
				dp[i] = i;

			else
				dp[i] = (dp[i - 1] + dp[i - 2] * (i - 1)) % M;
		}

		return dp[n];
	}
}
