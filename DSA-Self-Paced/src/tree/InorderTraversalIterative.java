package tree;

import java.util.Stack;

public class InorderTraversalIterative {

	public void inOrderIter(Node root) {
		
		//space required == O(H) : H== height of the binary tree
		Stack<Node> st = new Stack<>();
		Node curr=root;
		while(curr!=null || st.isEmpty()==false) {
			while(curr!=null) {
				st.push(curr);
				curr=curr.left;
			}
			curr=st.pop();
			System.out.println(curr.key);
			curr=curr.right;
		}
	}
	
	
}
