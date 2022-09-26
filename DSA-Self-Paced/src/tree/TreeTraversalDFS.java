package tree;

public class TreeTraversalDFS {

	// Left -> Root -> Right
	public static void inOrder(Node root) {
		if(root==null)
			return;

		inOrder(root.left);
		System.out.print(root.key+ " ");
		inOrder(root.right);
	}
	
	// Root -> Left ->  Right
	public static void preOrder(Node root) {
		if(root==null)
			return;
		
		System.out.print(root.key+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//Left -> Right-> Root
	public static void postOrder(Node root) {
		if(root==null)
			return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.key+" ");
	}
	
	public static void main(String[] args) {
		Node root= new Node(10);
		root.left= new Node(20);
		root.right= new Node(30);
		root.left.left= new Node(40);
		root.left.right= new Node(50);
		root.left.right.left=new Node(70);
		root.left.right.right=new Node(80);
		root.right.right=new Node(60);
		
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
	}
}
