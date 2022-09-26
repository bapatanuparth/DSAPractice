package backTracking;

import java.util.ArrayList;
import java.util.Collections;

//Given an array of integers and a sum B, find all unique combinations in the array where the sum is equal to B. The same number may be chosen from the array any number of times to make B.
//
//Note:
//        1. All numbers will be positive integers.
//        2. Elements in a combination (a1, a2, …, ak) must be in non-descending order. (ie, a1<= a2<= …<= ak).
//        3. The combinations themselves must be sorted in ascending order.
public class CombinationSum {

	static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
		// add your code here
		ArrayList<ArrayList<Integer>> op = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		Collections.sort(A);

		combi(op, A, B, 0, temp, 0);
		return op;
	}

	// same integer can be repeated
	static void combi(ArrayList<ArrayList<Integer>> op, ArrayList<Integer> a, int sum, int currsum,
			ArrayList<Integer> temp, int ind) {

		if (currsum > sum)
			return;

		if (sum == currsum) {
			op.add(new ArrayList<>(temp));
			return;
		}

		// we do not want the numbers repeating
		// hence dont start i from zero in loop
		for (int i = ind; i < a.size(); i++) {
			// to avoid repetitions when duplicates are present
			if (i > ind && a.get(i) == a.get(i - 1))
				continue;
			currsum += a.get(i);
			temp.add(a.get(i));
			combi(op, a, sum, currsum, temp, i);
			temp.remove(temp.size() - 1);
			currsum -= a.get(i);
		}

	}
}
