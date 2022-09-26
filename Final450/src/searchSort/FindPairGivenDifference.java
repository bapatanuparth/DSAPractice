package searchSort;

import java.util.Arrays;

//Given an array Arr[] of size L and a number N, you need to write a program to find if there exists a pair of elements in the array whose difference is N.
//Input:
//L = 6, N = 78
//arr[] = {5, 20, 3, 2, 5, 80}
//Output: 1
public class FindPairGivenDifference {

	public boolean findPair(int arr[], int size, int N) {
		// code here.
		Arrays.sort(arr);

		// two pointers one after other
		int left = 0, right = 1;

		while (right < size) {

			int currdiff = arr[right] - arr[left];
			// if curr diff == N
			if (currdiff == N && left != right)
				return true;
			// if currdiff > N it means we need to move previous pointer to right and check
			// if lower diff can be get
			else if (currdiff > N)
				left++;
			// otherwise move right ahead to check if diff increses to become equal to N
			else
				right++;
		}

		return false;
	}
}
