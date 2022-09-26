package binarySearchTree;
import java.util.*;

//check if the given tree is BST
public class CheckIfBST {

	//efficient solution
	//pass range during each call
	boolean checkIfBSTEff(Node root, int low, int high) {
		if(root==null)return true;
		if(root.key>high || root.key<low)return false;
		//in left subtree call set upper limit to current root
		if(!checkIfBSTEff(root.left, low, root.key))return false;
		//in right subtree call set lower limit to current root
		if(!checkIfBSTEff(root.right, root.key, high))return false;
		return true;
		
		
	}
	
	
	
	
	
	//my solution using in-order traversal and checking if the elements are sorted in in-order traversal
	List<Integer> arr= new ArrayList<>();
	int idx=0;
	boolean checkIfBST(Node root) {
		if(root==null)return true;
		if(!checkIfBST(root.left))return false;
		if(!arr.isEmpty() && arr.get(idx-1)> root.key)return false;
		arr.add(root.key);
		idx=idx++;
		if(!checkIfBST(root.right))return false;
		else
			return true;
		
	}
}
