package linkedListQues;


//Trick interview question
//you do not have head or anything, just the reference to the npde to be deleted.
//how to delete it from the linked list
public class DeleteNodeusingOnlyPointer {
	
	//trick is to just copy the data of next node to previous node 
	//join the next to next node with node to be deleted
	
	//cannot delete the last node using this
	//java automatic garbage collection takes care of this
	void deleteNode(Node del) {
		del.data=del.next.data;
		del.next=del.next.next;
	}

}
