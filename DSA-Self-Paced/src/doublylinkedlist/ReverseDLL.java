package doublylinkedlist;



public class ReverseDLL {

	//one way to swap data of 1st and last and all middle one by one
	public static Node revDLL(Node head) {
		Node tail=head;
		Node result=head;
		if(head==null)return null;
		while(tail.next!=null)tail=tail.next;
		
		int temp;
		while(head!=tail) {
			temp=head.data;
			head.data=tail.data;
			tail.data=temp;
			head=head.next;
			tail=tail.prev;
		}
		return result;
		
	}
	
	//to swap prev and next references
	public static Node revDLL2(Node head) {
		Node temp=head;
		Node pos=head;
		Node result=head;
		if(head==null || head.next==null)return null;
		//iterate through the DLL
		//swap prev and next links in each iteration till reach null
		while(result!=null) {
			temp=result.prev;
			result.prev=result.next;
			result.next=temp;
			result=result.prev;
		}
		return temp.prev;
		
	}
	
	public static void main(String[] args) {
		Node head=new Node(10);
		Node temp1=new Node(20);
		Node temp2=new Node(30);
		head.next=temp1;
		temp1.next=temp2;
		temp1.prev=head;
		temp2.prev=temp1;
		revDLL(head);
	}
}
