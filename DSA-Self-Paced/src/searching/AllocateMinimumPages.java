package searching;

//popular interview problem

//find out minimum possible value of the pages read by a student such that all pages
//are covered amongst given K students
//i.e. minimize the maximum pages read by any student
//
//each element of the array denotes the number of pages of each book
//a student can read only contiguous books. so while dividing amongst students,
//the books per student must be divided as groups of contiguous elements
public class AllocateMinimumPages {

	//Naive solution
	//recursive but tricky, refer video again if needed
	public int minPages(int [] arr, int n, int k) {
		if(k==1)return sum(arr, 0,n-1);
		
		if(n==1)return arr[0];
		int res=Integer.MAX_VALUE;
		for(int i=1;i<n;i++) {
			res=Math.min(res,Math.max(minPages(arr, i, k-1), sum(arr, i, n-1)));
		}
		return res;
				
	}
	
	public static int sum(int []arr, int start, int end) {
		int sum=0;
		for(int i=start; i<=end;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	//Efficient solution**********
	//solution using Binary Search approach
	//get the min and max number of pages to be read by a single reader
	//min pages to be read--> max of the array, max --> sum of all elements of array(in case k==1)
	public static int minPagesBinary(int arr[], int k) {
		int n=arr.length;
		int mx=0,sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			mx=Math.max(mx, arr[i]);
		}
		int high=sum, low=mx;
		int res=0;
		while(low<=high) {
			int mid=(low+high)/2;
			//if the cut is feasible, go to left in range to see if there is any better solution
			if(isFeasible(arr,mid,k)) {
				res=mid;
				high=mid-1;
			}else
				//if cut not feasible, go to higher value of maximum pages read by a person
				low=mid+1;
	}
		return res;
}
	
	//for a given mid value, go through the whole array and add elements one by one
	//if sum > mid , make one cut and proceed
	//this way get sums till the end of array and see if number if cuts made<=k
	//if cuts<=k, this means it can be a valid solution
	//if cuts>k --> the solution is not valid and we need to go on the higher side
	public static boolean isFeasible(int[] arr, int mid, int k) {
		int sum=0, temp=1;
		for(int i=0;i<arr.length;i++) {
			if(sum+arr[i]>mid) {
				temp++;
				sum=arr[i];
			}else 
				sum+=arr[i];
		}
		return temp<=k;
	}
}
