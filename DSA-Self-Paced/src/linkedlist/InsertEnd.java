package linkedlist;

public class InsertEnd {
	
	//insert at the end
static Node insertEnd(Node head, int x) {
	Node temp=new Node(x);
	//when head is empty
	if(head==null)
		return temp;
	Node n=head;
	//if head not empty, go to the end
	while(n.next!=null) {
		n=n.next;
	}
	n.next=temp;
	return head;
}

public static void main(String[] args) {
	Node head=null;
	head=insertEnd(head, 10);
	head=insertEnd(head, 20);
	head=insertEnd(head, 30);
}
}
