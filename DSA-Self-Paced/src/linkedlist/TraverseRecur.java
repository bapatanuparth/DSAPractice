package linkedlist;


//recursive linked list traversal
public class TraverseRecur {
	static Node init() {
		Node head=new Node(10);
		Node temp1=new Node(20);
		Node temp2=new Node(30);
		
		head.next=temp1;
		temp1.next=temp2;
		return head;
}
	static void recursiveTrav(Node n) {
		if(n==null)
			return;
		System.out.println(n.data);
		recursiveTrav(n.next);
	}
	
	public static void main(String[] args) {
		recursiveTrav(init());
	}
	
	
}
