package doublylinkedlist;

public class DeleteLast {

	public static Node deleteLast(Node head) {
		Node temp=head;
		if(head==null || head.next==null)return null;
		while(temp.next.next!=null)temp=temp.next;
		temp.next.prev=null;
		temp.next=null;
		return head;
	}
}
