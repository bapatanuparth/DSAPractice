package heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestSumContiguousSubarray {

	int kthLargestSum(int[] arr, int k) {

		int[] presum = new int[arr.length];

		int sum = 0;
		presum[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			presum[i] = presum[i - 1] + arr[i];
		}

		Queue<Integer> q = new PriorityQueue<>((a, b) -> a - b);

		for (int i = 1; i < arr.length; i++) {

			for (int j = i; j < i; j++) {
				int x = presum[j] - presum[i - 1];

				if (q.size() < k)
					q.add(x);
				else {
					q.poll();
					q.add(x);
				}
			}
		}

		return q.poll();
	}
}
