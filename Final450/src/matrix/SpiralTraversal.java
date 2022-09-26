package matrix;
import java.util.*;

//Input:  {{1,    2,   3,   4},
		//  {5,    6,   7,   8},
		//  {9,   10,  11,  12},
		//  {13,  14,  15,  16 }}
//Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
public class SpiralTraversal {

	  public List<Integer> spiralOrder(int[][] mat) {
	        
	        int m=mat.length;
	        int n=mat[0].length;
	        
	        //create 4 variables indicating maximum bounds of the part of matrix to be considered during any iteration
	        int maxUp= 0, maxRight=mat[0].length;
			int maxDown=mat.length, maxLeft=0;
			
			List<Integer> ls= new ArrayList<>();
			
			while(maxUp<=maxDown || maxLeft<=maxRight) {
		
				 //top horizontal
			for(int i=maxLeft;i<maxRight;i++) {
				ls.add(mat[maxUp][i]);
			}
	        if(ls.size()==m*n)break;
			maxUp++;
			
			//right vertical down
			for(int i=maxUp;i<maxDown;i++) { 
				ls.add(mat[i][maxRight-1]);
			}
			if(ls.size()==m*n)break;
	        maxRight--;
			
	      //horizontal bottom reverse
			for(int i=maxRight-1;i>=maxLeft;i--) { 
				ls.add(mat[maxDown-1][i]);
			}
	             if(ls.size()==m*n)break;

	            maxDown--;
			
	            //vertical bottom up
			for(int i=maxDown-1;i>=maxUp;i--) {
				ls.add(mat[i][maxLeft]);
			}
	             if(ls.size()==m*n)break;
			    maxLeft++;
	            
			}

	        return ls;
	    }
	
}
