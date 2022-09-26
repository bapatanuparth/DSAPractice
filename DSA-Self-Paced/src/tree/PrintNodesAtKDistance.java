package tree;

public class PrintNodesAtKDistance {

	public static void printNodes(Node root, int k) {
		if(root==null)return;
		if(k==0)
			{
			System.out.println(root.key);
			return;
			}
		else{
			printNodes(root.left, k-1);
			printNodes(root.right, k-1);
		}	
	}
	
}
