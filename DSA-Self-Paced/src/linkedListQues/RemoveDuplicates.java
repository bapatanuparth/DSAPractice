package linkedListQues;

//we have sorted LL
//remove duplicates from this sorted LL
//10->20->20->30->40->40 === 10->20->30->40
public class RemoveDuplicates {
	
	public Node removeDup(Node head) {
		Node curr=head;
		while(curr!=null && curr.next!=null){
			if(curr.data==curr.next.data) {
				curr.next=curr.next.next;
			}
			else
				curr=curr.next;
		}
		return head;
	}

}
