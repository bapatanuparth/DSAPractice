package tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class BFSLineByLine {

//based on the fact that when we reach the end node of every level-> we already have all the elements of next level in queue
	public static void printBFS(Node root) {
		Deque<Node> ad= new LinkedList<>();
		ad.add(root);
		//use null as a marker indicating that previous level has ended
		ad.add(null);
		while(ad.size()>1) {//we will be left with one last null in queue at the end
			Node curr=ad.pollFirst();
			if(curr==null) {
				System.out.println();//add newline
				ad.add(null);//add null to mark the last node of the next level
				continue;
			}
			if(curr.left!=null)ad.offerLast(curr.left);
			if(curr.right!=null)ad.offerLast(curr.right);
			System.out.print(root.key+ " ");
		}
	}
	
	
	public static void printBFS2(Node root) {
		Deque<Node> ad= new ArrayDeque<>();
		
		ad.add(root);
	
		while(!ad.isEmpty()) {
			//calculate size and run another loop to print all elements till that size
			int count=ad.size();

			for(int i=0;i<count;i++) {
				Node curr=ad.pollFirst();
				System.out.println(curr.key+ " ");
				if(curr.left!=null)ad.offerLast(curr.left);
				if(curr.right!=null)ad.offerLast(curr.right);
			}
			
			System.out.println();
		}
	}
}
