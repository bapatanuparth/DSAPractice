package linkedlist;

public class InsertBeg {
	public static Node insertBegin(Node head, int x) {
		Node n=new Node(x);
		n.next=head;
		return n;
	}
	
	public static void main(String[] args) {
		Node head=null;
		head=insertBegin(head, 30);
		head=insertBegin(head, 20);
		head=insertBegin(head, 10);
		
	}
}
