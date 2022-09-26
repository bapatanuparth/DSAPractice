package tree;

import java.util.ArrayList;
import java.util.List;


public class PathOFNodeFromRoot {

	 private List<Integer> pathFromRoot(Node root, int x){
	        if(root.key == x){
	            List<Integer> res = new ArrayList<>();
	            res.add(root.key);
	            return res;
	        }
	        
	        if(root.left != null){
	           List<Integer> l = pathFromRoot(root.left, x);
	           if(l.size() > 0){
	               l.add(root.key);
	               return l;
	           }
	        }
	        
	        if(root.right != null){
	           List<Integer> r = pathFromRoot(root.right, x);
	           if(r.size() > 0){
	               r.add(root.key);
	               return r;
	           }
	        }
	        
	        return new ArrayList<Integer>();
	    }
	    public void pathNode(Node root, int x, int y) {
	        List<Integer> pathX = pathFromRoot(root, x);
	       
	    }
}
