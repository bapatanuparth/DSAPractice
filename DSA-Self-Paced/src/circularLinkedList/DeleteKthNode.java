package circularLinkedList;


//delete kth node from the CLL
public class DeleteKthNode {
	
	//10 20 30
	public static Node deleteKth(Node head, int k) {
		int i=1;
		Node fix=head;
		while(i!=k) {
			head=head.next;
			i++;
		}
		head.data=head.next.data;;
		head.next=head.next.next;
		return fix;
		
	}
	
	//2nd way
	public static Node deleteKth2(Node head, int k) {
		Node curr=head;
		if(k==1)//delete head code
		for(int i=0;i<k-2;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		return head;
		
	}

}
