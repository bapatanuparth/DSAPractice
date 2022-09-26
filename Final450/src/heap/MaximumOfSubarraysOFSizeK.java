package heap;

import java.util.PriorityQueue;
import java.util.*;

//Given an array and an integer K, find the maximum for each and every contiguous subarray of size k.
public class MaximumOfSubarraysOFSizeK {

	//using priority queue
//	Create a Self-balancing BST (AVL tree) to store and find the maximum element. 
//	Traverse through the array from start to end.
//	Insert the element in the AVL tree.
//	If the loop counter is greater than or equal to k then delete i-k th element from the BST
//	Print the maximum element of the BST.
	void printMaxOfSubarr(int arr[], int k) {
		
		Queue<Integer> q= new PriorityQueue<>((a,b)->b-a);		
		List<Integer> res= new ArrayList<>();
		
		for(int i=0;i<k;i++) {
			q.add(arr[i]);
		}
		
		//largest number in first sub array
		res.add(q.peek());
		q.remove(arr[0]);
		
		for(int i=k;i<arr.length;i++) {
			q.add(arr[i]);
			res.add(q.peek());
			q.remove(arr[i-k+1]);
		}
	}
}
