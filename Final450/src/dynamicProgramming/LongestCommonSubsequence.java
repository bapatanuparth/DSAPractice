package dynamicProgramming;

public class LongestCommonSubsequence {

	static int lcs(int x, int y, String s1, String s2) {
		// your code here

		int dp[][] = new int[x + 1][y + 1];

		for (int i = 1; i <= x; i++) {

			for (int j = 1; j <= y; j++) {

				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else
					dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
			}
		}

		return dp[x][y];
	}
}
