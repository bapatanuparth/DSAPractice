package linkedListQues;

import java.util.Stack;

//check if given linked list is Palindrome

class PalNode{
	char data;
	PalNode next; // self referencial structure
	PalNode(char x){
		data=x;
		next=null;
	}
}
public class PalindromeLinkedList {
	
	//naive solution
	public boolean isPalindrome(PalNode head) {
		Stack<Character> st=new Stack<>();
		PalNode curr=head;
		while(curr!=null) {
			st.push(curr.data);
			curr=curr.next;
		}
		curr=head;
		while(curr!=null) {
			if(st.pop()!=curr.data)return false;
			curr=curr.next;
		}
		return true;
	}
	
	//O(n) and O(1) approach
	//find middle of LL and reverse the LL after that
	//compare node by node
	public boolean isPalindrome2(PalNode head) {
		PalNode slow=head,fast=head;
		while(fast!=null && fast.next!=null ) {
			slow=slow.next;
			fast=fast.next.next;
		}
		PalNode middle=slow;
		PalNode curr=slow.next;
		PalNode next=curr.next;
		while(curr.next!=null) {
			PalNode temp=next.next;
			if(temp==null)middle.next=curr.next;
			curr.next.next=curr;
			curr.next=null;
			curr=next;
			next=temp;
		}
		if(curr.next==null)middle.next=curr;
		PalNode first=head;
		while(middle!=null) {
			if(first.data!=middle.next.data)return false;
		}
		return true;
		
	}
}
