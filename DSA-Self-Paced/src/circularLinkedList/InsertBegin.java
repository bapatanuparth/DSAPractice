package circularLinkedList;

public class InsertBegin {
	
	//efficient way
	// way to do this in O(1)-->
	//insert new node after head between 1st and 2nd. 
	//swap the data of head and the new node
	// this is as good as making the new node as the first
	public static Node insertBeginEff(Node head, int data) {
		Node fix=head;
		Node newNode=new Node(data);
		if(head==null) {
			newNode.next=newNode;
			return newNode;
		}
		else {
			newNode.next=head.next;
			head.next=newNode;
			int t=head.data;
			head.data=newNode.data;
			newNode.data=t;
			return head;
		}
	}

	//traverse till the tail O(n)
	//add new node after tail and before head
	public static Node insertBegin(Node head, int data) {
		Node fix=head;
		Node newNode=new Node(data);
		if(head==null) {
			newNode.next=newNode;
		}
		else {
			while(head.next!=fix) 
				head=head.next;
			newNode.next=fix;
			head.next=newNode;
		}
		return newNode;
	}
}

