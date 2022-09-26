package binarySearchTree;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(){}
	TreeNode (int val){this.val=val;}
	TreeNode (int val, TreeNode left, TreeNode right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	
}

//the node after deletion is the next node in the inorder tree traversal
//so when u find the node that is to be deleted, find its successor that is the next node in inorder traversal
//copy that value in current node and then delete the successor node
//this way u re arrange the whole BST
public class DeleteNodeBST {

	  public TreeNode deleteNode(TreeNode root, int key) {
	        if(root==null)return null;
	        
	        if(key> root.val){
	            root.right=deleteNode(root.right, key);
	        }
	        else if(key<root.val) root.left=deleteNode(root.left, key);
	        else{
	            if(root.left==null)return root.right;
	            else if(root.right==null) return root.left;
	            else{
	            TreeNode successor = getSuccessor(root);
	            root.val= successor.val;
	            root.right= deleteNode(root.right, successor.val);
	            }
	        }
	        
	        return root;
	        
	    }
	    
	    TreeNode getSuccessor(TreeNode root){
	        TreeNode curr= root.right;
	        while(curr!=null && curr.left!=null){
	            curr=curr.left;
	        }
	        
	        return curr;
	    }
}
