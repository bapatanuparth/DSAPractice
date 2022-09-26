package searchSort;

public class FindMissingAndRepeating {

	 int[] findTwoElement(int arr[], int n) {
	        // code here
	        
		 //count array to keep count of each element
	        int count[] = new int[n+1];
	        
	        //count each element
	        for(int i=0;i<arr.length;i++){
	            count[arr[i]]++;
	        }
	        //out in result based on its count
	        int [] res= new int[2];
	        for(int i=1;i<count.length;i++){
	            if(count[i]==0)
	                res[1]=i;
	            if(count[i]>1)
	                res[0]=i;
	        }
	        
	        return res;
	    }
}
