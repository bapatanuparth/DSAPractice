package linkedlist;

public class SearchIterative {
	//search for data, return the position if present
	public static int searchIt(Node head, int key) {
		int pos=1;
		while(head!=null) {
			if(head.data==key)
				return pos;
			head=head.next;
			pos++;
		}
		return -1;
	}
	
	public static void main(String[] args) {

		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		System.out.println(searchIt(head, 10));
	}

}
