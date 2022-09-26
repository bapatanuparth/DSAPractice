package linkedlist;

//linked list traversal using while loop
public class Traversal {
	//initialize linked list
	static Node init() {
		Node head=new Node(10);
		Node temp1=new Node(20);
		Node temp2=new Node(30);
		
		head.next=temp1;
		temp1.next=temp2;
		return head;
}

	//traverse linked list
	static void traverse(Node n) {
		Node curr=n;
	while(curr!=null) {
		System.out.println(curr.data);
		curr=curr.next;
	}
}

	public static void main(String[] args) {
		traverse(init());
	}
}

