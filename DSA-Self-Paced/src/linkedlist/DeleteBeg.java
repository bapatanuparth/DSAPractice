package linkedlist;

public class DeleteBeg {

	static Node deleteBegin(Node head) {
		if(head==null)return null;
		// DO NOT NEED TO WORRY ABOUT MEMORY DEALLOCATION IN JAVA!!
		return head.next;
	}
	
	public static void main(String[] args) {
		Node head=new Node(10);
		head.next=new Node(20);
		//head.next.next=new Node(30);
		System.out.println(deleteBegin(head));
	}
	
}
