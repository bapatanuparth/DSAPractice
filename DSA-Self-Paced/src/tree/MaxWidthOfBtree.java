package tree;
import java.util.*;

public class MaxWidthOfBtree {

	public static int maxWidth(Node root) {
		if(root==null)return 0;
		int max=1;
		Deque<Node> ad= new LinkedList<>();
		ad.add(root);
		ad.add(null);
		
		while(ad.size()>1) {
			Node curr= ad.pollFirst();
			if(curr==null) {
				max= Math.max(max, ad.size());
				ad.add(null);
				continue;
			}
			if(curr.left!=null)ad.offerLast(curr.left);
			if(curr.right!=null)ad.offerLast(curr.right);
			
		}
		return max;
		
	}
}
