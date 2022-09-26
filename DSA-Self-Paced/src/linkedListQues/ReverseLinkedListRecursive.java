package linkedListQues;

public class ReverseLinkedListRecursive {
	
	//assume we already have reversed all the remaining list till original head;
	// we have reference to the new head, i.e. end of linked list ==rev_head
	public Node recRev1(Node head) {
		if(head==null || head.next==null)return head;
		Node rev_head=recRev1(head.next);
		Node rev_tail=head.next;
		rev_tail.next=head;
		head.next=null;
		return rev_head;
	}
	
	//maintain curr and prev 2 pointer
	//initially prev==null, next==null
	public Node recRev2(Node curr, Node prev) {
		if( curr==null)return prev;
		Node next=curr.next;
		curr.next=prev;
		return recRev2(next,curr);
		
	}

}
