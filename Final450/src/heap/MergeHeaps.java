package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

//Given two binary max heaps as arrays, merge the given heaps to form a new max heap.
public class MergeHeaps {

	public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
		// your code here
		Queue<Integer> q = new PriorityQueue<>((Collections.reverseOrder()));

		for (int i : a)
			q.add(i);

		for (int i : b)
			q.add(i);

		int[] ans = new int[n + m];
		int i = 0;
		while (!q.isEmpty()) {
			ans[i] = q.poll();
			i++;
		}

		return ans;
	}
}
