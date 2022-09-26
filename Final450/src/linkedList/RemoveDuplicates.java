package linkedList;

//Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).
//Note: Try not to use extra space. Expected time complexity is O(N). The nodes are arranged in a sorted way.

public class RemoveDuplicates {

	Node removeDuplicates(Node head)
    {
	// Your code here
	Node curr=head;
	Node next;
	
	while(curr!=null){
	    next=curr.next;
	    while(next!=null && next.data == curr.data){
	        curr.next=next.next;
	        next.next=null;
	        next=curr.next;
	    }
	    curr=curr.next;
	}
	
	return head;
    }
}
