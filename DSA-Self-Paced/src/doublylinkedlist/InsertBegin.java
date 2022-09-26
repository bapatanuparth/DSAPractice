package doublylinkedlist;

public class InsertBegin {
	
	public static Node insertBeg(Node head,int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		if(head!=null)head.prev=newNode;
		return newNode;
	}
	
	public static void main(String[] args) {
		Node head=new Node(10);
		Node temp1=new Node(20);
		Node temp2=new Node(30);
		head.next=temp1;
		temp1.next=temp2;
		temp1.prev=head;
		temp2.prev=temp1;
		insertBeg(head,100);
	}

}
