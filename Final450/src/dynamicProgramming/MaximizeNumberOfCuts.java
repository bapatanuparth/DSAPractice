package dynamicProgramming;

import java.util.Arrays;

//Given an integer N denoting the Length of a line segment. You need to cut the line segment in such a way that the cut length of a line segment each time is either x , y or z. Here x, y, and z are integers.
//After performing all the cut operations, your total number of cut segments must be maximum.

public class MaximizeNumberOfCuts {

	public int maximizeCuts(int n, int x, int y, int z) {
		// Your code here
		int dp[] = new int[n + 1];
		Arrays.fill(dp, -1);
		int r = dynamic(n, x, y, z, dp);
		return r < 0 ? 0 : r;

	}

	int dynamic(int n, int x, int y, int z, int[] dp) {
		if (n == 0) {
			return 0;
		}
		if (n < 0)
			return Integer.MIN_VALUE;

		if (dp[n] != -1)
			return dp[n];

		int n1 = dynamic(n - x, x, y, z, dp) + 1;
		int n2 = dynamic(n - y, x, y, z, dp) + 1;
		int n3 = dynamic(n - z, x, y, z, dp) + 1;
		dp[n] = Math.max(n1, Math.max(n2, n3));
		return dp[n];
	}
}
