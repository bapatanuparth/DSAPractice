package doublylinkedlist;

public class DeleteHead {

	//delete the first node of DLL
	public static Node deleteHead(Node head) {
		if(head==null || head.next==null)return null;
		head=head.next;
		head.prev=null;
		return head;
	}
}
