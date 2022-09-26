package doublylinkedlist;

public class InsertEnd {
	
	public static Node insertEnd(Node head, int data) {
		Node temp=head;
		Node newNode=new Node(data);
		if(head==null)return newNode;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=newNode;
		newNode.prev=temp;
		return head;
	}

}
