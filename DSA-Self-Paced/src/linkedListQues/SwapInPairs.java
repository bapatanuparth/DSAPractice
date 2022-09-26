package linkedListQues;

//1->2->3->4
//o/p == 2->1->4->3

//1->2->3->4->5
//o/p == 2->1->4->3->5

public class SwapInPairs {
	
	//swap curr data with curr.next data and move curr=curr.next.next;
	//method 1
	public Node swapInPair(Node head) {
		if(head==null || head.next==null)return head;
		Node curr=head;
		while(curr!=null && curr.next!=null) {
			int temp=curr.data;
			curr.data=curr.next.data;
			curr.next.data=temp;
			curr=curr.next.next;
		}
		return head;
		
	}
	
	//intuitive solution please look 
	public Node swapInPair2(Node head) {
		if(head==null || head.next==null)return head;
		Node curr=head, prev=head;
		//update head pointer explicitly
		curr=curr.next.next;
		head=head.next;
		head.next=prev;
		//swap nodes pairwise, better than swapping the data
		while(curr!=null && curr.next!=null) {
			prev.next=curr.next;
			prev=curr;
			Node next=curr.next.next;
			
			curr.next.next=curr;
			curr=next;
		}
		prev.next=curr;
		return head;
	}
}
