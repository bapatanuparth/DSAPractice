package linkedListQues;

public class MergeTwoSortedLL {
	
	public static Node mergeSorted(Node head1, Node head2) {
		Node a=head1, b=head2;
		while(a!=null && b!=null) {
			if(a.data<=b.data) {
				if(a.next!=null && a.next.data<=b.data) {
					a=a.next;continue;
				}else {
					Node a1=a.next;
					a.next=b;
					a=a1;
				}
			}
			else if(b.data<a.data) {
				if(b.next!=null && b.next.data<a.data) {
					b=b.next;continue;
				}else {
					Node b1=b.next;
					b.next=a;
					b=b1;
				}
			}
		}
		return head1.data<head2.data?head1:head2;
	}
	public static Node mergeSorted2(Node head1, Node head2) {
		Node a=null, b=null;
		Node head=null,tail=null;
		if(head1.data<=head2.data) {
			 head=head1;
			 tail=head;
			 a=head1.next; b=head2;
		}else {
				 head=head2;
				 tail=head;
				 a=head1; b=head2.next;
		}
		while(a!=null && b!=null) {
			if(a.data<=b.data) {
				tail.next=a;
				a=a.next;
			}else if(b.data<a.data) {
				tail.next=b;
				b=b.next;
			}
		}
		if(b==null)tail.next=a;
		if(a==null)tail.next=b;
	
		return head;
	}

}
