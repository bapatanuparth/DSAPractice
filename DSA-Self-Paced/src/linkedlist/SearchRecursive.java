package linkedlist;


//recursively search for an element
public class SearchRecursive {
	
	public static int searchRe(Node head, int key, int pos) {
		if(head==null)return -1;
		if(head.data==key)return pos;
		return searchRe(head.next, key, pos+1);
	}
	
	
	public static void main(String[] args) {
	Node head=new Node(10);
	head.next=new Node(20);
	head.next.next=new Node(30);
	System.out.println(searchRe(head, 30,1));
	}
}
