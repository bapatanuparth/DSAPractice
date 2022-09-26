package tree;

import java.util.Stack;

public class PreOrderIterative {

	public void preOrderIter(Node root) {
		Stack<Node> st = new Stack<>();
		Node curr=root;
		while(curr!=null || !st.isEmpty()) {
			while(curr!=null) {
				System.out.println(curr);
				st.push(curr);
				curr=curr.left;
			}
			curr=st.pop();
			curr=curr.right;
		}
	}
	
public void preOrderIterM2(Node root) {
	Stack<Node> st = new Stack<>();
	st.push(root);
	while(!st.isEmpty()) {
		Node curr = st.pop();
		System.out.println(curr.key);
		if(curr.right!=null) st.push(curr.right);
		if(curr.left!=null) st.push(curr.left); 
	}
}
}
