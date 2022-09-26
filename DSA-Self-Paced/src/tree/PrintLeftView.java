package tree;

//print left element of each level

public class PrintLeftView {

	//my code - it is right
	public static void printLeftView(Node root) {
		if(root==null)return;
		System.out.println(root.key);
		if(root.left==null && root.right==null) {
			return;
		}
		else if(root.left==null) {
			printLeftView(root.right);
		}
		else {
			printLeftView(root.left);
		}
	}
	
	//code from the video
	//pass level ==1 in first method call
	int maxLevel=0;
	void printLeft2(Node root, int level) {
		if(root==null)return;
		if(maxLevel<level) {
			System.out.println(root.key);
			maxLevel= level;
		}
		printLeft2(root.left, level+1);
		printLeft2(root.right, level+1);
	}
}
