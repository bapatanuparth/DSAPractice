package linkedListQues;

public class IntersectionOfLL {
	
	//solution works in O(m+n) time and O(1) extra space
	//1. find the lengths of both LLs
	//2. ull know which LL is bigger.
	//3. traverse that LL till the node where both LLs are of same length now.
	//4. Now, you can increase both pointers to noth LLs smultaneously and check where they meet
	public int itersectionLL(Node head1, Node head2) {
		int c1=1,c2=1;
		Node curr1=head1;
		while(curr1!=null) {
			curr1=curr1.next;
			c1++;
		}
		Node curr2=head2;
		while(curr2!=null) {
			curr2=curr2.next;
			c2++;
		}
		int diff=Math.abs(c1-c2);
		curr1=head1;curr2=head2;
		if(c1>c2) {
			while(diff>0) {
				curr1=curr1.next;
				diff--;
			}
		}
		else if (c2>c1) {
			while(diff>0) {
				curr2=curr2.next;
				diff--;
			}
		}
		while(curr1!=null && curr2!=null) {
			if(curr1==curr2)return curr1.data;
			curr1=curr1.next;
			curr2=curr2.next;
		}
		return -1;
	}

}
