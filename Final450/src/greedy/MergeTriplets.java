package greedy;

import java.util.Arrays;

//A triplet is an array of three integers. You are given a 2D integer array triplets, where triplets[i] = [ai, bi, ci] describes the ith triplet. You are also given an integer array target = [x, y, z] that describes the triplet you want to obtain.
//
//To obtain target, you may apply the following operation on triplets any number of times (possibly zero):
//
//Choose two indices (0-indexed) i and j (i != j) and update triplets[j] to become [max(ai, aj), max(bi, bj), max(ci, cj)].
//For example, if triplets[i] = [2, 5, 3] and triplets[j] = [1, 7, 5], triplets[j] will be updated to [max(2, 1), max(5, 7), max(3, 5)] = [2, 7, 5].
//Return true if it is possible to obtain the target triplet [x, y, z] as an element of triplets, or false otherwise.

//Input: triplets = [[2,5,3],[1,8,4],[1,7,5]], target = [2,7,5]
//Output: true

//Input: triplets = [[2,5,3],[2,3,4],[1,2,5],[5,2,3]], target = [5,5,5]
//Output: true

public class MergeTriplets {

	public boolean mergeTripletsEff(int[][] triplets, int[] target) {
		int x = 0, y = 0, z = 0;
		for (int i = 0; i < triplets.length; i++) {
			if (triplets[i][0] <= target[0] && triplets[i][1] <= target[1] && triplets[i][2] <= target[2]) {
				x = Math.max(x, triplets[i][0]);
				y = Math.max(y, triplets[i][1]);
				z = Math.max(z, triplets[i][2]);

				if (x == target[0] && y == target[1] && z == target[2]) {
					return true;
				}
			}
		}

		return false;
	}

	// use the property of max operator that max(max(A, B), C) == max(A, max(B,C))
	// i.e. max value will remain the same no matter what order u process the values
	public boolean mergeTriplets(int[][] triplets, int[] target) {

		// values to reach to
		int x = target[0];
		int y = target[1];
		int z = target[2];

		// initialize desiredx, desiredy, and desiredz variables to 0
		int desx = 0;
		int desy = 0;
		int desz = 0;

		// to keep a count of which array to be neglected and which to be selected
		boolean[] count = new boolean[triplets.length];
		Arrays.fill(count, true);

		// idea is to check first whether any element from the current triplet is going
		// above the target [j] th value
		// if its > target[j] , then this triplet needs to be ignored as it cannot be
		// used to reach target
		for (int i = 0; i < triplets.length; i++) {

			for (int j = 0; j < triplets[0].length; j++) {

				if (j == 0 && triplets[i][j] > x) {
					count[i] = false;
					break;
				}
				if (j == 1 && triplets[i][j] > y) {
					count[i] = false;
					break;
				}
				if (j == 2 && triplets[i][j] > z) {
					count[i] = false;
					break;
				}
			}

			// if all 3 elements in triplet are lower than their corresponding target j
			// values, then set the values of desiredx, y, z
			if (count[i] == true) {
				for (int j = 0; j < triplets[0].length; j++) {
					if (j == 0)
						desx = Math.max(triplets[i][j], desx);
					else if (j == 1)
						desy = Math.max(triplets[i][j], desy);
					else if (j == 2)
						desz = Math.max(triplets[i][j], desz);
				}
			}

		}

		// if desiredx, y, z is same as the original, then u can say that target can be
		// formed from given set of triplets
		return (desx == x && desy == y && desz == z);
	}
}
