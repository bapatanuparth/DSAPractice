package queDeque;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

	//iterative solution
	public static void revQueIter(Queue<Integer> q) {
		Stack<Integer> st=new Stack<>();
		while(!q.isEmpty()) {
			st.push(q.poll());
		}
		while(!st.isEmpty()) {
			q.add(st.pop());
		}
			
	}
	
	//recursive approach
	void reverse(Queue<Integer> q) {
		if(q.isEmpty())return;
		int x=q.poll();
		reverse(q);
		q.add(x);
	}
}
