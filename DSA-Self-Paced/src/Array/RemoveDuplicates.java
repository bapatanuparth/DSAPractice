package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicates {
	public static void main(String[] args) {
		removeDup(new int[] {10,10,11,20,25,30,40},7);
		
	}
	
	static int remDup(int arr[],int n) {
		int temp[]=new int[n];
		temp[0]=arr[0];
		int res=1;
		for(int i=1;i<n;i++) {
			if(temp[res-1]!=arr[i]) {
				temp[res]=arr[i];
				res++;
			}
		}
		for(int i=0;i<res;i++) {
			arr[i]=temp[i];
		}
	return arr.length;	
	}
	
	// not good O(n2)
	static int removeDup(int arr[],int n) {
		int size=0,i=0,j=1;
		boolean flag=false;
		ArrayList<Integer>alist=new ArrayList<Integer>();
		//	if(n==1)return 1;
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(arr[i]==arr[j])
					arr[j]=-1;
				else if(arr[i]!=arr[j])
				{	alist.add(j);
					i=j-1;
					break;
				}
			}
		}
		for(int k=0;k<alist.size();k++) {
			arr[k+1]=arr[alist.get(k)];
		}
		for(int k=alist.size()+1;k<n;k++) {
			arr[k]=-1;
		}
		System.out.println(Arrays.toString(arr));
		return alist.size()+1;
		
	}
}

