package binarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class FixBSTWith2NodesSwapped {

	Node prev=null, first=null, second=null;
	//perform in order traversal and mark the 2 nodes for which the sorted order gets violated
	void fixBst(Node root) {
		if(root==null)return;
		
		fixBst(root.left);
		
		if(prev!=null && prev.key> root.key) {
			if(first==null)first=prev;
			second=root;
		}
		
		prev=root;
		fixBst(root.right);
	}
}
