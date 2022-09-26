package backTracking;

import java.util.ArrayList;

public class RatInMaze {
	
	ArrayList<String> ls= new ArrayList<>();
	
	//working solution , much shorter
	    public ArrayList<String> findPathEff(int[][] m, int n) {
	    // Your code here
	    String s= "";
	    if(m[0][0]==0)return ls;
	    if(m[n-1][n-1]==0)return ls;
	    
	    pathFinder(m,0,0,n,s);
	    
	    return ls;
	        
	    }
	    
	   void pathFinder(int [][]m, int i, int j, int n, String s){
	         if(i>=n || i<0 || j<0 || j>=n || m[i][j]==0) //isSafe implemented here
	            return; 
	        
	        if(i==n-1 && j==n-1)
	           { 
	               ls.add(s);
	                return;
	           }
	          
	           m[i][j] = 0; //mark the current element as 0 so that in next calls we dont come back here while we make call for LEFT and UP
	           //and we wont get caught in loop
	           pathFinder(m,i + 1, j, n, s + "D");
	           pathFinder(m,i - 1, j, n, s + "U");
	           pathFinder(m,i, j + 1, n, s + "R");
	           pathFinder(m,i, j - 1, n, s + "L");
	           m[i][j] = 1;
	    }
	  
	
	
	
	//a solution that prints all paths that the rat can follow DRDDRD etc (down/right) ONLY FOR DOWN OR RIGHT
	

	
	 public ArrayList<String> findPath(int[][] m, int n) {
		    // Your code here
		    StringBuilder sb= new StringBuilder();
		    
		    
		    if(pathFinder(m,0,0,n,sb))ls.add(sb.toString());
		    
		    return ls;
		        
		    }
		    
		   boolean pathFinder(int [][]m, int i, int j, int n, StringBuilder sb){
		        
		        if(i==n-1 && j==n-1){
		        	ls.add(sb.toString());
		            return true;
		        }
		  
		        if(isSafe(m, i, j+1, n)){
		            sb.append("R");
		            pathFinder(m,i,j+1,n,sb);
		            sb.deleteCharAt(sb.length()-1);
		        
		        if(isSafe(m, i+1, j, n)){
		            sb.append("D");
		             pathFinder(m,i+1,j,n,sb);
		            sb.deleteCharAt(sb.length()-1);
		        }
		        }
		        return false;
		    }
		    
		    boolean isSafe(int [][] m, int i, int j ,int n){
		        if(i>=n || i<0 || j<0 || j>=n || m[i][j]==0)
		            return false; 
		        else return true;
		    }

}
