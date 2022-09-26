package linkedlist;

public class InsertAtPos {
	
	//insert node at specified position
	//head at position 1
	static Node insertPosition(Node head, int x, int data) {
		int count=1;
		Node temp=head;
		while(x-count!=1) {
			temp=temp.next;
			count++;
		}
		Node newnode=new Node(data);
		newnode.next=temp.next;
		temp.next=newnode;
		return head;
	}
	
	static void traverse(Node n) {
		Node curr=n;
	while(curr!=null) {
		System.out.println(curr.data);
		curr=curr.next;
	}
}
	public static void main(String[] args) {
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		traverse(insertPosition(head, 4, 50));
	}

}
