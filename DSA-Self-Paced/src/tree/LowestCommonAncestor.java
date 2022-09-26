package tree;
import java.util.*;


public class LowestCommonAncestor {
	
	//Efficient solution --> single traversal of BTree
	//assumes that both the keys are present in the tree
	public Node getLCAEff(Node root, int n1, int n2) {
		if(root==null)return null;
		if(root.key==n1 || root.key==n2) {
			return root;
		}
		Node lca1= getLCAEff(root.left, n1, n2);
		Node lca2= getLCAEff(root.right, n1, n2);
		
		//l1 and l2 both not being null means that this node has n1 on one side and n2 on other side
		//hence this node has to be the LCA. bcz if its 2 branches have the 2 nodes, it is the least common element parent
		if(lca1!=null && lca2!=null)return root;
		//we reach here only if both the keys lie either on LHS or RHS of given root
		
		
		//this case occurs only when the left subtree has both n1 and n2
		if(lca1!=null)return lca1;
		//this case occurs only when both n1 and n2 are present on the right subtree of the given root
		else
			return lca2;
	}
	
	
	//my code completely
	//works perfect
	static boolean found=false;
		
	public static int getLCA(Node root, int n1, int n2) {
		//create 2 lists
		List<Integer> list1= new ArrayList<>();
		List<Integer> list2= new ArrayList<>();
		//save ancestors of 1st element
		getAncestors(root, n1,list1);
		found=false;
		//save for 2nd element
		getAncestors(root, n2,list2);
		System.out.println(list1);
		System.out.println(list2);
		//find the lowest common parent
		for(int i:list1) {
			if(list2.contains(i)) {
				System.out.println(i);
				return i;
			}
		}
		return -1;
	}
	
	public static void getAncestors(Node root, int n, List<Integer> ls) {
		if(root==null) return;
		//go recursively till find the number
		//if number found, dont make any further recursive calls, just go back till root while adding each parent on the way
		if(root.key==n || found) {
			found=true;
			return;
		}
		//if element not found, keep searching in left and right subtree
		getAncestors(root.left,n,ls);
		getAncestors(root.right,n,ls);
		//if somewhere element is found, add all the elements while recursion unfolds
		if(found)ls.add(root.key);
		
	}
	
	public static void main(String[] args) {
		Node root= new Node(10);
		root.left=new Node(20);
		root.right= new Node(30);
		root.right.left= new Node(40);
		root.right.right= new Node(50);
		root.right.left.left= new Node(60);
		root.right.right.left= new Node(70);
		root.right.right.right= new Node(80);
		
		getLCA(root, 60, 80);
	}
}
