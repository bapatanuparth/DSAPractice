package linkedListQues;


//reverse LL in group of K
//Kth node will be the new head of the LL

//10->20->30->40->50->60 , k=3 -->
//30->20->10->60->50->40

public class ReverseLinkedListinGroups {
	
	//recursive solution
	public Node recRev(Node head,int k) {
//assume you already have 1st k elements reverse,
//and recursively get remaining all reverse
		//loop reverses the k elements, then make recursive call for next group of K
		//Kth element from beginning will always be the new head
		//use curr, prev and next pointers
		Node curr=head;
		Node next=null;
		Node prev=null;
		int count=0;
		while(curr!=null && count<k) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		}
		if(next!=null) {
			Node rest_head=recRev(curr,k);
			head.next=rest_head;
		}
		
		return prev;
	}
	
	//iterative solution
	public Node revIter1(Node head, int k) {
		
		Node curr=head, prevfirst=null;
		//to set the head at first pass i.e. the Kth element will be head
		boolean isfirstPass=true;
		while(curr!=null) {
			Node first=curr,prev=null;
			int count=0;
			while(curr!=null && count<k) {
				Node next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
				count++;
			}
			if(isfirstPass) {
				prevfirst=first;
				head=prev;isfirstPass=false;
			}
			//connect separately reversed groups
			//after k reversed elements "prev" will have the value of node 
			//which is to be connected to the next K node group
			//for all groups, we want to connect head of the current pass to the 
			//first of the previous pass
			else prevfirst.next=prev;
			prevfirst=first;
		}
	return head;	
	}

}
