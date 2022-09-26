package sorting;


//given an array and an element P, 
//give partition of the array such that all values in arr <p are on LHS in res arr
//and all the values in arr> P are on RHS of P
//return the new index of P
public class NaivePartition {
	
	//Naive Algorithm is stable
	//this will be used in recursive quick sort
	public static int naivePartition(int []arr, int low, int high, int p) {
		int j=0;
		int res[]=new int[high-low+1];
		//add all arr[i] < arr[p]
		for(int i=low;i<=high;i++) {
			if(arr[i]<arr[p]) {
				res[j]=arr[i];
				j++;
			}
		}
		//add all arr[i] = arr[p]
		for(int i=low;i<=high;i++) {
			if(arr[i]==arr[p]) {
				res[j]=arr[i];
				j++;
			}
		}
		int op=low+j-1;
		//add all arr[i] > arr[p]
		for(int i=low;i<=high;i++) {
			if(arr[i]>arr[p]) {
				res[j]=arr[i];
				j++;
			}
		}
		//copy in main arr
		for(int i=low;i<=high;i++) {
			arr[i]=res[i-low];
			
		}
		return op;
	}

}
