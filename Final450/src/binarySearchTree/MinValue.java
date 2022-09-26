package binarySearchTree;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class MinValue {

int minValue(Node root) {
        
        if(root==null)return -1;
        if(root.left==null)return root.data;
        return(minValue(root.left));
    }
}
