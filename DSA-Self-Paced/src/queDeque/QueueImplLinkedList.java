package queDeque;

class Node{
	int val;
	Node next;
	public Node(int x) {
		// TODO Auto-generated constructor stub
		val=x;
		next=null;
	}
}


class QueueLL{
	int val;
	Node front=null, rear=null;
	
	void enque(int x) {
		Node temp=new Node(x);
		if(front==null && rear==null) {
			front=temp;
			rear=temp;
		}
		else {
		rear.next=temp;
		rear=rear.next;
		}
	}
	
	void deque() {
		if(front==null)return;
		front=front.next;
		if(front==null)rear=null;
	}
	
	int getFront() {
		return front.val;
	}
	int getRear() {
		return rear.val;
	}
	
	boolean isEmpty() {
		return front==null;
	}
}

public class QueueImplLinkedList {

	
}
