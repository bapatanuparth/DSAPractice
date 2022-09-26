package linkedListQues;

import java.util.HashSet;
import java.util.Set;

public class DetectLoop {
	
	//floyd cycle detection O(1) extra space, O(n)
	//use 2 pointers -->slow_head and fast_head;
	//slow moves 1 place at a time and fast moves 2 places in one iteration.
	//according to floyd cycle, there will come a point where these will meet if there is a loop in LL
	public static boolean isLoopFloyd(Node head) {
		Node slow=head, fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)return true;
		}
		return false;
	}
	
	
	//method 1 using hashSet
	public static boolean isLoop(Node head) {
		Node curr=head;
		Set<Node> set= new HashSet<>();
		while(curr!=null) {
			System.out.println(set);
			if(set.contains(curr))return true;
			set.add(curr);
			curr=curr.next;
		}
		return false;
	}
	
	//use a temp Node and where each node's next points to.
	//if we encounter a node whose next is already pointing to temp, it means we 
	//have encountered a loop
	public static boolean isLoop2(Node head) {
		Node curr=head;
		Node next;
		Node temp=new Node(-1);
		while(curr!=null) {
			next=curr.next;
			if(curr.next==temp)return true;
			curr.next=temp;
			curr=next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		//head.next.next.next=head;
		System.out.println(isLoop(head));
	}

}
