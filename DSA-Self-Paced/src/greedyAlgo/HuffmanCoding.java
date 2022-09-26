package greedyAlgo;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Node{
	char ch;
	int freq;
	Node left;
	Node right;
	
	public Node(char c, int f, Node l, Node r) {
		// TODO Auto-generated constructor stub
		ch=c;
		freq=f;
		left=l;
		right=r;
	}
}

public class HuffmanCoding {

	
	public void huffmanCode(char [] chars, int [] freq) {
		
		List<Node> leaves= new ArrayList<>();
		
		for(int i=0;i<chars.length;i++) { //create all the leaves of the tree. these are not connected at this point
			leaves.add(new Node(chars[i],freq[i],null,null));
		}
		
		PriorityQueue<Node> h= new PriorityQueue<>((a,b)-> a.freq- b.freq); //for minHeap
		
		for(Node n:leaves) { //create a minHeap of all the leaves
			h.add(n);
		}
		
		while(h.size()>1) { //build huffman tree. build tree from bottom up
			Node left=h.poll();
			Node right=h.poll();
			
			h.add(new Node('$',left.freq+right.freq,left,right)); //create new node and add into the tree.
		}
		printRec(h.peek(), "");
	}
	
	void printRec(Node root, String s) { //traverse the tree and print the code of each leaf as we moe down
		if(root==null)return;
		
		if(root.ch!='$') {
			System.out.println(root.ch+" "+s);
			return;
		}
		printRec(root.left, s+"0"); //going to left -- append 0
		printRec(root.right, s+"1"); //going to right -- append 1
		
	}
}
