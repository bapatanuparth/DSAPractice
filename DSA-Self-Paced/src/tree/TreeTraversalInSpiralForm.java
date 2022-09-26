package tree;
import java.util.*;

public class TreeTraversalInSpiralForm {

	//code from video
	//efficient using 2 stacks
	public static void spiralTravEff(Node root) {
		Stack<Node> s1= new Stack<>();
		Stack<Node> s2= new Stack<>();
		
		s1.push(root);
		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				Node curr= s1.pop();
				System.out.println(curr.key);
				//push in natural order to s2
				if(curr.left!=null) s2.push(curr.left);
				if(curr.right!=null) s2.push(curr.right);
			}
			while(!s2.isEmpty()) {
				Node curr= s2.pop();
				System.out.println(curr.key);
				//push in reverse order in s1
				if(curr.right!=null) s2.push(curr.right);
				if(curr.left!=null) s2.push(curr.left);
			}
			
		}
		
	}
	
	
	
	//code from video
	//method 2
	public static void spiralTrav2(Node root) {
		Deque<Node> ad= new ArrayDeque<>();
		//use stack to print the level that should be reverse
		Stack<Integer> st= new Stack<>();
		ad.add(root);
		//to know which level to be reversed
		boolean reverse =false;
		
		while(!ad.isEmpty()) {
			//calculate size and run another loop to print all elements till that size
			int count=ad.size();

			for(int i=0;i<count;i++) {
				Node curr=ad.pollFirst();
				if(reverse)
					//push the odd level into stack and then pop it to print in reverse
					st.push(curr.key);
				else
					//print right level in same order
					System.out.print(curr.key+ " ");
				if(curr.left!=null)ad.offerLast(curr.left);
				if(curr.right!=null)ad.offerLast(curr.right);
			}
			if(reverse) {
				while(!st.isEmpty()) {
					System.out.println(st.pop()+" ");
				}
			}
			reverse=!reverse;
			
		}
	}
	
	
	//my code works fine
	public static void spiralTraversal(Node root) {
		if(root==null)return;
		Deque<Node> q = new LinkedList<>();
		q.add(root);
		int count=0;
		while(!q.isEmpty()) {
			int size= q.size();
			//use duplicate queue just to be able to print every even step in the right order
			Deque<Node> temp= q;
			if(count%2==0) {
				for(int i=0;i<size;i++) {
					Node curr= temp.pollLast();
					System.out.println(curr.key);
		
				}
				//separate loop to add new elements to the queue in the right way
				for(int i=0;i<size;i++) {
					Node curr= q.pollFirst();
					if(curr.right!=null)q.add(curr.right);
					if(curr.left!=null)q.add(curr.left);
				}
				
			}else {
				//if odd step, print the elements in regular direction from the queue
				for(int i=0;i<size;i++) {
					Node curr= q.pollFirst();
					System.out.println(curr.key);
					//adding right first and left second to maintain the order
					if(curr.right!=null)q.add(curr.right);
					if(curr.left!=null)q.add(curr.left);
				}
				
			}
			
			count++;
		}
		
	}
}
