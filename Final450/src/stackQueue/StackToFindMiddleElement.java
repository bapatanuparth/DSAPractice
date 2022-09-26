package stackQueue;

//How to implement a stack which will support the following operations in O(1) time complexity? 
//1) push() which adds an element to the top of stack. 
//2) pop() which removes an element from top of stack. 
//3) findMiddle() which will return middle element of the stack. 
//4) deleteMiddle() which will delete the middle element. 
//Push and pop are standard stack operations.


//use doubly linked list to implement stack
class DLLNode{
	
	DLLNode prev;
	DLLNode next;
	int val;
	
	public DLLNode(int val) {
		// TODO Auto-generated constructor stub
		this.val=val;

	}
	public DLLNode() {
		// TODO Auto-generated constructor stub
	}
	
}

public class StackToFindMiddleElement {

	int size=0;
	DLLNode head;
	DLLNode mid;
	
	void push(int val) {
		DLLNode newnode= new DLLNode(val);
		if(size==0) {
			head=newnode;
			mid=newnode;
			size++;
			return;
		}
	
			head.next=newnode;
			newnode.prev= head;
			size++;
			
			if(size%2!=0)
				mid=mid.next;
			
			return;
	}
	
	int pop() {
		if(size==0) {
			return -1;
		}
		else if(size==1)
		{
			int temp=head.val;
			head=null;
			return temp;
		}
		
		DLLNode temp=head;
		head.prev.next=null;
		head=head.prev;
		temp.prev=null;
		size--;
		
		if(size%2==0)
			mid=mid.prev;
		
		return temp.val;
	}
	
	DLLNode findMiddle() {
		if(size==0)
			return null;
		else 
			return mid;
	}
	
	void deleteMiddleElement() {
		if(size==0)
			return;
		
		else if(size==1) {
			head=null;
			mid=null;
		}
		
		else if(size==2) {
			mid=mid.next;
			mid.prev.next=null;
			mid.prev=null;
		}
		
		else if(size%2!=0)
		{
			DLLNode temp=mid.prev;
			temp.next=mid.next;
			mid.prev=null;
			mid.next=null;
			mid=temp;
			
		}
		size--;
		return;
		
	}
}
