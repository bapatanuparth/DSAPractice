package sorting;

import java.util.ArrayList;
import java.util.List;

//*************tricky



//problem of taking an unsorted array and counting the inversions in it. 
//There are two conditions for the  elements to be inverse:
//
//arr[i] > arr[j]
//i < j

//naive solution --> run 2 loops and check for every elemnt which elemnt on right is smaller
public class CountInversionsInArray {
	
	//Efficient solution -->
	//use merge sort--> count inversions from left half, count inversions from right half
	//and while merging we count inversions
	//time and space as merge sort
	public static int countInv(int []arr, int l, int r) {
		int res=0;
		if(l<r) {
			int mid=l+(r-l)/2;
			res+=countInv(arr,l,mid);
			res+=countInv(arr, mid+1, r);
			res+=countAndMerge(arr, l,mid,r);
		}
		return res;
	}
	
	public static int countAndMerge(int []arr, int low,int mid, int high) {
		//all code is same like merge sort, just few differences
		int n1=mid-low+1, n2=high-mid;
		int left[]=new int[n1];
		int right[]=new int [n2];
		for(int i=0;i<n1;i++) {
			left[i]=arr[low+i];
		}
		for(int i=0;i<n2;i++) {
			right[i]=arr[mid+1+i];
		}
		
		//use same logic as merging 2 diff arrays
		int i=0,j=0,k=0,res=0;
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				arr[k]=left[i];
				i++;k++;
			}else {
				arr[k]=right[j];
				j++;k++;
				res=res+(n1-i);
			}
		}
			while(j<right.length) {
				arr[k]=right[j];j++;k++;
			}
			while(i<left.length) {
				arr[k]=left[i];
				i++;k++;
			}	
			return res;
	}
	
	

	
	
	//partial naive solution
	public static void countInversions(int arr[]) {
		int i=Integer.MIN_VALUE;
		int min=arr[0];
		int count=0;
		List<Integer> temp=new ArrayList<>();
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>i) {
				temp.add(arr[j]);
				i=arr[j];
			}
			else if(arr[j]<i) {
				for(int k=0;k<temp.size();k++) {
					if(arr[j]<temp.get(k)) {
						if(k==0)count--;//this is kept for when m==temp[1]
						//hence, this count will be made twice- 1. while checking in temp
						//2. while checking with min. 
						count=count+temp.size()-k;
						break;
					}
				}
			}
			if(arr[j]<min) {
				min=arr[j];
				count++;
			}
			//if(m==temp.get(0))count--;
		}
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		countInversions(new int[] {2,4,6,1,0,-2,3,5});
	}
}
