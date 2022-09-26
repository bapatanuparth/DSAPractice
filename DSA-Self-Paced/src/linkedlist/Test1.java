package linkedlist;

//singly linked list
//use this class node
class Node{
	int data;
	Node next; // self referencial structure
	Node(int x){
		data=x;
		next=null;
	}
}

public class Test1 {
	public static void main(String[] args) { //initialize linked list
		Node head=new Node(10);
		Node temp1=new Node(20);
		Node temp2=new Node(30);
		
		head.next=temp1;
		temp1.next=temp2;
	}

}
