package linkedListQues;

import java.util.HashMap;
import java.util.Map;

//given a linked list with next and random pointers
//create a completely new LinkedList that clones all the mappings of original LL

//special definition of nodes for the question
class NodeClone{
	int data;
	NodeClone next; // self referencial structure
	NodeClone random;
	NodeClone(int x){
		data=x;
		next=null;
		random=null;
	}
	NodeClone(NodeClone val){
		data=val.data;
		next=null;
		random=null;
	}
}

public class CloneLinkedList {
	
	
	//method O(n) time and O(n) space
	//create a map with previous nodes as keys and new nodes as values
	public static NodeClone cloneList(NodeClone head) {
		Map<NodeClone, NodeClone> map=new HashMap<>();
		for(NodeClone curr=head;curr!=null;curr=curr.next) {
			map.put(curr, new NodeClone(curr));
		}
		NodeClone head2=map.get(head);
		
		//access new nodes' next and randoms using key values in maps
		//i.e. nodes in new LL will be mapped by a key from old LL
		for(NodeClone curr=head;curr!=null;curr=curr.next) {
			NodeClone clonecurr=map.get(curr);
			clonecurr.next=map.get(curr.next);
			clonecurr.random=map.get(curr.random);
		}
		return head2;
	}
	
	//O(n) and O(1) space
	//very tricky and intuitive solution
	
	public static NodeClone cloneListEff(NodeClone head) {
		//create a duplicate node of each node in front of that node
		//before loop
		//10->20->30->40
		for(NodeClone curr=head;curr!=null;curr=curr.next) {
			NodeClone next=curr.next;
			curr.next= new NodeClone(curr.data);
			curr.next.next=next;
			curr=next;
		}
		//after loop
		//10->10->20->20->30->30->40->40
		//now create new references based on old nodes' references
		for(NodeClone curr=head;curr!=null;curr=curr.next.next) {
			//new nodes' random= old node's random.next
			curr.next.random=(curr.random!=null)?curr.random.next:null;
		}
		NodeClone head2=head.next;
		//break the new LL from the old
		for(NodeClone curr=head;curr!=null;curr=curr.next.next) {
			NodeClone temp=curr.next;
			curr.next=curr.next.next;
			curr=temp.next;
			temp.next=curr.next;
		}
		return head2;
	}
	
	

}
