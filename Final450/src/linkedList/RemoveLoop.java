package linkedList;

public class RemoveLoop {

	  public static void removeLoop(Node head){
	        // code here
	        // remove the loop without losing any nodes
		  
		  //find loop using floyds cycle detection
	         Node slow=head;
	        Node fast=head;
	        boolean loop=false;
	        
	        while(fast !=null && fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	            if(slow==fast)
	                {//System.out.println(slow.data);
	                loop=true;break;}
	        }
	        
	        if(!loop)return;
	        
	        //edge case where last node connects back to head
	        if(fast==head){
	            while(fast.next!=head)fast=fast.next;
	            fast.next=null;
	            return;
	        }
	        
	        //else, run the loop from starting again till when fast.next== slow.next
	        slow=head;
	        while(slow.next!=fast.next){
	           // System.out.println(slow.data);
	            slow=slow.next;
	            fast=fast.next;
	        }
	        
	        //remove the loop from fast.next
	        fast.next=null;
	        
	    }
}
