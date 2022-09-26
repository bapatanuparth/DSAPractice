package circularLinkedList;

class Node{
	int data;
	Node next; // self referencial structure
	Node(int x){
		data=x;
		next=null;
	}
}

public class Test1 {

	public static void main(String[] args) {
		//10 -> 20-> 30
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		//30->10 ---> circular link
		head.next.next.next=head;
		
	}
}
