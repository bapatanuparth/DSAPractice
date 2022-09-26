package backTracking;

//Given an array arr[] of size N, check if it can be partitioned into two parts such that the sum of elements in both parts is the same.
public class PartitionEqualSum {

	static int equalPartition(int N, int arr[]) {
		// code here
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}

		if (sum % 2 == 1)
			return 0;
		if (isPart(arr, 0, 0, sum / 2))
			return 1;
		else
			return 0;

	}

	static boolean isPart(int arr[], int i, int sum, int halfsum) {
		if (sum > halfsum)
			return false;
		if (sum == halfsum)
			return true;

		for (; i < arr.length; i++) {
			sum += arr[i];
			if (isPart(arr, i + 1, sum, halfsum))
				return true;
			sum -= arr[i];
		}

		return false;
	}
}
