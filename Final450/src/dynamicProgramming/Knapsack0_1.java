package dynamicProgramming;

public class Knapsack0_1 {

	// rows == # of items
	// columns == capacity values from 0-given capacity
	// for each item, we try to figure out the maximum possible value for all the
	// capacities
	// for ex - only using item #1, we try to get max possible value for each
	// capacity value starting from 0

	// if we dont include the current item, we need to look on the row above, i.e.
	// the maximum possible value will remain the same as previous item's value at
	// that capacity if new item is not included
	// in the knapsack

	// Function to return max value that can be put in knapsack of capacity W.
	static int knapSack(int cap, int wt[], int val[], int n) {
		// your code here
		// create a 2D array, rows == #items, cols == capacity value from 1 to cap
		int[][] dp = new int[n + 1][cap + 1];

		for (int i = 1; i <= n; i++) { // 1 - base array

			int w = wt[i - 1], v = val[i - 1]; // get the value and weight of item #i

			for (int size = 1; size <= cap; size++) { // iterate over each possible size of the sack till capacity

				dp[i][size] = dp[i - 1][size]; // case 1: we dont include current item in knapsack
				// so max possible value for ith item in the dp[][] is same as value that was
				// their at i-1 th item

				// case 2:
				// we include the current element and see if the value is better than not
				// including the current element
				// dp[i-1][size-w] == the value (at the previous #items) before adding current
				// weight (size- w)
				// we need to check if the calue of current item + value till previous item
				// before adding current weight > value without including current item
				if (w <= size && dp[i - 1][size - w] + v > dp[i][size]) {
					dp[i][size] = dp[i - 1][size - w] + v;
				}

			}
		}

		return dp[n][cap];
	}
}
