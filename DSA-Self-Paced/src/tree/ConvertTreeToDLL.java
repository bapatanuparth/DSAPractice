package tree;

//convert given tree to doubly linked list


class DLLNode{
	DLLNode next=null;
	DLLNode prev=null;
	int val;
	public DLLNode (int v){
		val=v;
	}
	
	public DLLNode() {
		// TODO Auto-generated constructor stub
	}
}


public class ConvertTreeToDLL {
	
	//code from the video
	//here, not using separate DLL class, use root.left as prev pointer and root.right as next pointer
	//use previous pointer which is available in all calls
	Node prev= null;
	//following the same logic of inorder traversal
	//solve left part -> find head -> keep incrementing prev node -> call right part
	Node BTreeToDLL(Node root) {
		if(root==null)return root;
		
		Node head= BTreeToDLL(root.left);
		//if prev==null, this is the first node
		//will be executed only once
		if(prev==null)head=root;
		else {
			//add double link such that left child of root is prev and next of this child is the current root
			root.left=prev;
			prev.right=root;
		}
		prev=root;
		
		BTreeToDLL(root.right);
		return head;
				
	}
	
	

	
	//my code this should work
	boolean first=false;
	DLLNode head=null;
	public DLLNode convToDLL(Node root, DLLNode prev, DLLNode curr) {
		if(root==null)return null;
		
		DLLNode left=convToDLL(root.left,prev,curr);
		if(left==null && !first) {
			head= new DLLNode(root.key);
			prev=head;
			first=true;
		}else {
			curr= new DLLNode(root.key);
			prev.next=curr;
			curr.prev=prev;
			prev=curr;
		}
		DLLNode right= convToDLL(root.right,prev,curr);
		if(right!=null) {
			curr= new DLLNode(root.key);
			prev.next=curr;
			curr.next=prev;
			prev=curr;
		}
		return prev;
	}
}
