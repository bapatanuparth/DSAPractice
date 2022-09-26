package linkedListQues;

public class DetectandRemoveLoop {
	
	//can use extra hash table to store the nodes and then detect the loop
	//but this will require O(n) extra space
	
	//Use floyds algorithm to detect loop, ur fast and slow pointers will meet if loop exists
	//take slow pointer to the head and traverse again at same speed this time
	//the point where slow and fast meet is where the loop is beginning
	public static void detectAndRemove(Node head) {
		Node slow=head, fast=head;
		boolean loop=false;
		//search where the 2 nodes meet to detect loop with speed fast=2x slow
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				loop=true;break;
				}
			}
		if(!loop)return;
		//if loop present, reiterate from head, and speeds fast=1xslow 
		//when fast.next=slow.next, that is the loop entry point, make it null to remove
		slow=head;
		while(slow.next!=fast.next) {
			slow=slow.next;
			fast=fast.next;
		}
		fast.next=null;
		
		}
	

}
