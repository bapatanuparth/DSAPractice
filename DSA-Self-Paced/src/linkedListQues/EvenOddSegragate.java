package linkedListQues;

//need to perform in 1 traversal only
//one way is to create a separate odd an even LL and then patch
public class EvenOddSegragate {
	
	//important interview question
	
	public Node evenOddSeparate(Node head) {
		//even start, even end, odd start, odd end nodes
		Node eS=null, eE=null, oS=null, oE=null;
		for(Node curr=head;curr!=null;curr=curr.next) {
			int x=curr.data;
			//if even, connect in even LL
			if(x%2==0) {
				if(eS==null) {
					eS=curr;
					eE=eS;
				}else {
					eE.next=curr;
					eE=eE.next;
				}
			}
			//if odd connect in odd LL
			else if(x%2!=0) {
				if(oS==null) {
					oS=curr;
					oE=oS;
				}else {
					oE.next=curr;
					oE=oE.next;
				}
			}
		}
		if(oS==null || eS==null)return head;
		eE.next=oS;
		oE.next=null;
		return eS;
	}

}
