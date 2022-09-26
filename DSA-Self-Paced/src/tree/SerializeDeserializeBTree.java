package tree;
import java.util.*;

//serialize -- process of converting Btree into a string or array such that we can reconstruct the tree back with that info
//Deserialize-- convert array/string into BTree again

//application -- 
// if u have data in tree DS and u want to send the data across the network, use serialization
//writing test cases for practice problems

public class SerializeDeserializeBTree {

	//using pre-order traversal approach
	public void serializeTree(Node root, List<Integer> op){
		if(root==null) {
			op.add(-1);
		}
		op.add(root.key);
		serializeTree(root.left, op);
		serializeTree(root.right, op);
	}
	
	int i=0;
	//can also pass this index by reference to function call to avoid using global variable
	//desrialize in same pre  order traversal 
	public Node deserializeTree(List<Integer> ip) {
		if(i==ip.size())return null;
		if(ip.get(i)==-1) {
			return null;
		}
		Node root= new Node(ip.get(i));
	
		root.left=deserializeTree(ip);
	
		root.right=deserializeTree(ip);
		return root;
	}
}

