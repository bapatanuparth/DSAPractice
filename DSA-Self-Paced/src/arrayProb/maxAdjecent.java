package arrayProb;

public class maxAdjecent {
	//Function should print max adjacents for all pairs
	  static void maximumAdjacent(int sizeOfArray, int arr[]){
	        for(int i=1;i<arr.length;i++) {
	        	System.out.print(Math.max(arr[i-1], arr[i])+" ");
	        }
	        
	    }
	  
}
