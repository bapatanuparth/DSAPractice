package stackQueue;

import java.util.Stack;

//Given an array arr[ ] of size N having elements, the task is to find the next greater element for each element of the array in order of their appearance in the array.
//Next greater element of an element in the array is the nearest element on the right which is greater than the current element.
//If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.

//Input: 
//N = 4, arr[] = [1 3 2 4]
//Output:
//3 4 4 -1
public class NextLargerElement {

	public static long[] nextLargerElement(long[] arr, int n) {
		// Your code here

		long[] op = new long[arr.length];
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < arr.length; i++) {

			while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
				op[st.peek()] = arr[i];
				st.pop();
			}
			st.push(i);
		}

		while (!st.isEmpty()) {
			op[st.peek()] = -1;
			st.pop();
		}

		return op;
	}
}
