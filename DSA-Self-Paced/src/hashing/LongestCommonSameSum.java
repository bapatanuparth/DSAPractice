package hashing;

import java.util.HashMap;

//2 binary arrays given as input having same size
//find longest length of sub array in both arrays having same sum

public class LongestCommonSameSum {

	static int maxCommoneff(int arr1[],int arr2[]) {
		int temp[]=new int [arr1.length];
		for(int i=0;i<arr1.length;i++) {
			temp[i]=arr1[i]-arr2[i];
		}
		
		//solve just like finding longest sub array with given sum==0
		HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		int curr=0;
		int res=0;
		for(int i=0;i<temp.length;i++) {
			curr=curr+temp[i];
			if(curr==0)res=i+1;
			if(map.containsKey(curr)==false)
				map.put(curr, i);
			if(map.containsKey(curr))
				res=Math.max(res, i-map.get(curr));
		}
		return res;
	}
	
	//naive approach
	//find each sub array for both arrays
	//calculate sum of each sub array and if sum is equal, 
	//make it result if it is max till now
	static int maxCommon(int arr1[],int arr2[]) {
		int res=0;
		for(int i=0;i<arr1.length;i++) {
			int sum1=0,sum2=0;
			for(int j=i;j<arr1.length;j++) {
				sum1+=arr1[j];
				sum2+=arr2[j];
				if(sum1==sum2)
					res=Math.max(res, j-i+1);
			}
		}
		return res;
	}

}
