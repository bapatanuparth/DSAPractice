package linkedListQues;


//we have a sorted Singly linked list
//insert new data such that the LL remains sorted
public class SortedInsertLL {
	
	//10 30 40
	public static Node sortedInsert(Node head, int data) {
		Node out=new Node(data);
		if(head==null)return out;
		Node curr=head;
		if(out.data<curr.data) {out.next=head;head=out;return head;}
		while(curr.next!=null && out.data>curr.next.data ) {
			curr=curr.next;
		}
		if(curr.next==null) {curr.next=out;return head;}
		if(curr.data<=out.data && curr.next.data>=out.data) {
			out.next=curr.next;
			curr.next=out;
		}
		return head;
		
	}

}
