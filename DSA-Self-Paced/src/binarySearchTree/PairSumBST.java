package binarySearchTree;

import java.util.HashMap;
import java.util.*;

//find if a pair exists in BST such that their sum == x
public class PairSumBST {

	//using in Order traversal and HashMap
	Set<Integer> set= new HashSet<>();
	boolean pairSum(Node root, int sum){
		if(root==null)return false;
		boolean l= pairSum(root.left, sum);
		if(set.contains(sum-root.key))return true;
		set.add(root.key);
		return l || pairSum(root.right, sum);
		
	}
}
