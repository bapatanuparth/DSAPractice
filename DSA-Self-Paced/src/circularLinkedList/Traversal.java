package circularLinkedList;

public class Traversal {
	//traverse and print all the items of circular linked list
	public static Node traverseLL(Node head) {
		Node fix=head;
		if(head==null)return null;
		while(head.next!=fix) {
			System.out.println(head.data);
			head=head.next;
		}
		System.out.println(head.data);
		return fix;
	}
	
	public static void main(String[] args) {
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		//30->10 ---> circular link
		head.next.next.next=head;
		traverseLL(head);
	}
	

}
