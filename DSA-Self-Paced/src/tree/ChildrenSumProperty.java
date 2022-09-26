package tree;


//if both children present --> sum of both children == parent key
//if any of the children is null, remaining node == parent key
// if both children null -- return true
public class ChildrenSumProperty {

	//code from video
	public static boolean isChildSum(Node root) {
		if(root==null)return true;
		
		if(root.left==null && root.right==null) return true;
		int sum=0;
		if(root.left!=null)sum+=root.left.key;
		if(root.right!=null)sum+=root.right.key;
		
		return sum==root.key && isChildSum(root.left) && isChildSum(root.right);
	}
	
	//my code
	static boolean temp=true;
	public static boolean childSum(Node root) {
		if(!temp)return temp;
		if(root.left!=null && root.right!=null) {
			if(root.left.key+root.right.key!=root.key)temp= false;
			childSum(root.left);
			childSum(root.right);
		}
		else if(root.left==null && root.right==null)return true;
		else if(root.left!=null) {
			if(root.key!=root.left.key)temp=false;
			childSum(root.left);
		}
		else if(root.right!=null){
			if(root.key!=root.right.key)temp=false;
			childSum(root.right);
		}
		return temp;
		
	}
}
