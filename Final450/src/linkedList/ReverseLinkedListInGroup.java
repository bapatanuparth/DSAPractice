package linkedList;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

public class ReverseLinkedListInGroup {

	
	 public static Node reverse(Node head, int k)
	    {
	        //Your code here
	        Node prev=null;
	        Node next=null;
	        Node curr=head;
	        int count=0;
	        
	        while(curr!=null && count<k){
	            next=curr.next;
	            curr.next=prev;
	            prev=curr;
	            curr=next;
	            count++;
	        }
	        //assume we get the next K reverse and their head from the next recursive call
	        if(next!=null){
	            Node rest_head= reverse(curr, k);
	            head.next=rest_head;
	        }
	        
	        return prev;
	    }
	}
