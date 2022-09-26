package linkedlist;

public class DeleteLast {

	static Node deleteLast(Node head) {
		Node temp=head;
		if(head==null)return null;
		if(head.next==null)return null;
		while(temp.next.next!=null) 
			temp=temp.next;
		temp.next=null;
		return head;
	}
	
	public static void main(String[] args) {
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		System.out.println(deleteLast(head).next);
	}
}
