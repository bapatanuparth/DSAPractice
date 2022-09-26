package linkedListQues;

import java.util.ArrayList;
import java.util.List;

//reverse given linked list
public class ReverseLinkedListIterative {

	//Naive approach --> using extra array
	//requires extra space, not good
	public static Node reverseIter(Node head) {
		List<Integer> list=new ArrayList<>();
		for(Node curr=head;curr!=null;curr=curr.next) {
			list.add(curr.data);
		}
		for(Node curr=head;curr!=null;curr=curr.next) {
			curr.data=list.remove(list.size()-1);
		}
		return head;
	}
	
	//efficient code --> just shift the links' direction
	//maintain 2 extra references to change the direction of links
	public static Node reverseIterEff(Node head) {
		if(head==null || head.next==null)return head;
		Node prev=head,curr=head;
		Node next;
		curr=curr.next;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			if(prev==head)
				prev.next=null;
			prev=curr;
			curr=next;
		}
		return prev;
	}
}
