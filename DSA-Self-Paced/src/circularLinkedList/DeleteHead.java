package circularLinkedList;

public class DeleteHead {
	
	
	//naive solution O(n)
	public static Node deleteHead(Node head) {
		Node fix=head;
		if(head==null || head.next==null)return null;
		while(head.next!=fix) {
			head=head.next;
		}
		head.next=fix.next;
		fix.next=null;
		head=head.next;
		System.out.println(head.data);
		return head;
	}
	
	//efficient solution O(1)
	public static Node deleteHeadEff(Node head) {
		if(head==null || head.next==null)return null;
		//swap heads data with the next node, i.e. new head
		// remove the swapped node(previous data from the link)
		head.data=head.next.data;;
		head.next=head.next.next;
		System.out.println(head.data);
		return head;
	}
}
