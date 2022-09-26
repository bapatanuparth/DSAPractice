package linkedListQues;


//Find the middle node of the linked list
//very nice solution for efficient  method
public class MiddleofLinkedList {
	
	//Naive soluton
	public static int middleNode(Node head) {
		if(head==null)return -1;
		int count=0;
		Node curr=head;
		while(curr!=null) {
			count++;
			curr=curr.next;
		}
		curr=head;
		for(int i=0;i<count/2;i++) {
			curr=curr.next;
		}
		System.out.println(curr.data);
		return curr.data;
	}
	
	
	//efficient solution
	//fast moves twice as rate of slow. hence when fast reaches end, slow is in middle
	public static int middleNode2(Node head) {
		if(head==null)return -1;
		Node slow=head, fast=head;
		while(fast!=null &&  fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
		

	}
}
