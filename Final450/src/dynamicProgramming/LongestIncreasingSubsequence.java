package dynamicProgramming;

public class LongestIncreasingSubsequence {

	static int longestSubsequence(int size, int a[]) {
		// code here
		int[] dp = new int[size + 1];

		dp[0] = 1; // single element will have LIS == 1

		int omax = 0;
		for (int i = 1; i < a.length; i++) {
			int max = 0;

			for (int j = 0; j < i; j++) {
				if (a[j] < a[i])
					if (dp[j] > max)
						max = dp[j];
			}
			dp[i] = max + 1;
			if (dp[i] > omax)
				omax = dp[i];
		}

		return omax;
	}
}
