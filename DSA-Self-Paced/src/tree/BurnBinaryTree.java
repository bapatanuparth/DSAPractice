package tree;

//given a leaf node, we need to find time to burn the Binary Tree if we burn the given leaf at 0-th second. 

class Distance{
	int val;
	Distance(int d){
		val=d;
	}
}

//bit tricky, pls watch video again if not understood
public class BurnBinaryTree {

	//to solve this problem, all we need to find is the farthest node from the given leaf node
	//it will give us the time to burn the whole tree
	int res=0;
	public int burnTree(Node root, int leaf, Distance dist) {
		if(root==null)return 0;
		
		if(root.key==leaf) {
			dist.val=0;return 1;
		}
		
		//wrapper Distance is used because this way the ldist and rdist can be passed as a reference
		//so any node which is an ancestor of the leaf will have either rdist or ldist >-1
		Distance ldist = new Distance(-1);
		Distance rdist = new Distance(-1);
		
		//during any function call, after execution of below 2 lines, we will have the left and right height of the subtree
		int lh= burnTree(root.left, leaf, ldist);
		int rh= burnTree(root.left, leaf, rdist);
		//here we know left and right height of the passed root
		
		//function falls in any of the below cases only if it is an ancestor of the leaf in question
		//if any of this case is true, we start setting the distance variable of root passed.
		//this distance variable in every function call will be equal to the distance of that ancestor from the leaf in question.
		if(ldist.val!=-1) {
			dist.val= ldist.val+1;
			//result is changed if we found a ancestor who has the the point farthest from leaf in question
			res=Math.max(res, dist.val+rh);
		}
		else if(rdist.val!=-1) {
			dist.val= rdist.val+1;
			res=Math.max(res, dist.val+lh);
		}
		//we are returning the max height of the root
		return Math.max(lh, rh)+1;
	
		//we aare setting 2 things here after a function call
		//1. returning the height of given node from leaf 
		//2. distance of the node if leaf is its descendent
	}
}
