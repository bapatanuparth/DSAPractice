package array;

import java.util.Stack;

//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6

public class TrappingRainWater {

	public int trap(int[] height) {

		Stack<Integer> st = new Stack<>();

		int n = height.length;
		if (n <= 2)
			return 0;

		// create 2 arrays to store max values from left and right side at each element
		int lmax[] = new int[height.length];
		int rmax[] = new int[height.length];

		// init 0th element , and max till now as also 0th element
		lmax[0] = height[0];
		int max = lmax[0];

		// fill lmax with values such that each index has value that represents max wall
		// size till that index
		// start loop from index 1 because the wall on 0th index cant have any water on
		// top of it
		for (int i = 1; i < n; i++) {
			max = Math.max(max, height[i]);
			lmax[i] = max;
		}

		// similarly init rmax with end value
		rmax[n - 1] = height[n - 1];
		max = rmax[n - 1];

		// start the loop from n-2 because the last wall (n-1) cant have any water on
		// top of it
		for (int i = n - 2; i >= 0; i--) {
			max = Math.max(max, height[i]);
			rmax[i] = max;
		}

		// calculate result for each cell
		int res = 0;

		for (int i = 1; i < n - 1; i++) {
			res = res + Math.min(lmax[i], rmax[i]) - height[i];
		}

		return res;

	}
}
