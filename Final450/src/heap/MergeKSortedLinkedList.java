package heap;

import java.util.PriorityQueue;
import java.util.Queue;

class Node {
	int data;
	Node next;

	Node(int key) {
		data = key;
		next = null;
	}
}

public class MergeKSortedLinkedList {

	Node mergeKList(Node[] arr, int K) {
		if (arr.length < 1)
			return null;
		// Add your code here.
		Queue<Node> q = new PriorityQueue<>((a, b) -> a.data - b.data);

		// add each node in min heap. make sure to remove the next pointers to avoid
		// cycles
		for (Node a : arr) {

			Node head = a;
			while (head != null) {
				q.add(head);
				Node next = head.next;
				head.next = null;
				head = next;
			}
		}

		// poll from queue, go on adding next pointer and attach the nodes to form one
		// single linked list
		Node head = q.poll();
		Node temp = head;
		while (!q.isEmpty()) {
			temp.next = q.poll();
			temp = temp.next;
		}
		return head;

	}
}
