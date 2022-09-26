package linkedListQues;


//return the value of Nth Node from the end of the linked list
//10>20>30>40>50 , n=2 ---> return 40;
public class NthNodeFromEnd {

	//method 1
	public static int nthFromEnd(Node head, int n) {
		if(head==null)return -1;
		int count=0;
		Node curr=head;
		while(curr!=null) {
			count++;
			curr=curr.next;
		}
		if(count<n)return -1;
		curr=head;
		int i=1;
		while(i<count-n+1) {
			i++;
			curr=curr.next;
		}
		return curr.data;
	}
	
	public static int nthFromEnd2(Node head, int n) {
		if(head==null)return -1;
		int count=0;
		Node first=head;
		Node slow=head;
		for(int i=0;i<n;i++) {
			if(first==null)return -1;
			first=first.next;
		}
		while(first!=null) {
			first=first.next;
			slow=slow.next;
		}

		return slow.data;
	}
}
