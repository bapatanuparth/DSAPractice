package tree;
import java.util.*;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class ReverseLevelOrderTraversal {

	 public ArrayList<Integer> reverseLevelOrder(Node node) 
	    {
	        // code here
	        if(node==null)return null;
	        ArrayList<Integer> ls= new ArrayList<>();
	        
	        Queue<Node> q= new ArrayDeque<>();
	        q.add(node);
	        while(!q.isEmpty()){
	            Node temp=q.poll();
	            ls.add(temp.data);
	            if(temp.right!=null)q.add(temp.right);
	            if(temp.left!=null)q.add(temp.left);
	        }
	        
	         Collections.reverse(ls);
	         return ls;
	       
	        
	    }
}
