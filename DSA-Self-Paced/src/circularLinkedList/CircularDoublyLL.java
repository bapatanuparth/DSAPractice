package circularLinkedList;

class NodeCDLL{
	int data;
	NodeCDLL prev;
	NodeCDLL next;
	NodeCDLL(int x){
		data=x;
		prev=null;
		next=null;
	}
}
public class CircularDoublyLL {
	
	//insert at begin
	public static NodeCDLL insertBegin(NodeCDLL head, int k) {
		NodeCDLL newNode=new NodeCDLL(k);
		if(head==null) {
			newNode.next=newNode;
			newNode.prev=newNode;
			return newNode;
		}
		NodeCDLL last=head.prev;
		newNode.next=head;
		newNode.prev=head.prev;
		last.next=newNode;
		head.prev=newNode;
		return newNode;
	}
}
