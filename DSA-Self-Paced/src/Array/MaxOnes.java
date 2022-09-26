package Array;

import java.util.ArrayList;

//find maximum ones consecutively occuring
public class MaxOnes {
	public static void main(String[] args) {
	System.out.println(maxOne(new int[] {1,1,1,1,1}));
}
	//efficient
	static int maxOne2(int arr[]) {
		int res=0,curr=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				curr=0;
			else {
				curr++;
				res=Math.max(curr, res);
			}
		}
		return res;
	}
	
	static int maxOne(int arr[]) {
		int i=0,temp=0,count=0;
		ArrayList<Integer>alist=new ArrayList<Integer>();
		for(i=0;i<arr.length;i++) {
			while(i<arr.length && arr[i]==1) {
				count++;
				i++;
			}
				alist.add(count);
			count=0;
		}
		System.out.println(alist);
		//take max from alist
		return 1;
	}
}
