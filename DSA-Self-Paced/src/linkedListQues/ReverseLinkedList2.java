package linkedListQues;

class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class ReverseLinkedList2 {

	 public ListNode reverseBetween(ListNode head, int left, int right) {
	        ListNode curr=head, prev=head, next=head;
	        if(left==right)return head;
	        if(head==null || head.next==null)return head;
	        int n=1;
	        ListNode rev_head=head;
	        //reach starting point of reverse
	        while(n<left){
	            if(n==left-1)rev_head=curr;//save the node before starting point of reverse to attach later
	            curr=curr.next;
	            n++;
	        }
	        prev=curr;
	        ListNode temp=curr;
	        curr=curr.next;
	        //reverse till reach the right
	        while(n<right){
	            next=curr.next;
	            curr.next=prev;
	            if(prev==temp)prev.next=null;
	            prev=curr;
	            curr=next;
	            n++;
	        }
	        //attach right to the node after reversing
	        temp.next=curr;
	        //attach left to node before reversing
	        if(left!=1)rev_head.next=prev;
	        
	        return (left==1)?prev:head;
	    }
}
