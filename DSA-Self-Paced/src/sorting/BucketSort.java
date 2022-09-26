package sorting;
import java.util.*;

public class BucketSort {

	//k --> number of buckets to divide the data in
	public static void bucketSort(int arr[], int k) {
		int n=arr.length;
		int max_val=arr[0];
		//find maximum element of the array
		for(int i:arr) {
			max_val=Math.max(arr[i], max_val);
		}
		max_val++; //why to increase?
		//--> later, we use this max_value to determine the bucket in which an element shoul be placed
		//as max_value is existing in this array, the calculation of arr[i]/max_value ==1 for max_value element
		//this can give array index out of bounds
		//incrementing max_value by 1 ensures that all the elements in the array < max_value and can be segregated accordingly
		ArrayList<ArrayList<Integer>> bkt=new ArrayList<>();
		//create k buckets 
		for(int i=0;i<k;i++) {
			bkt.add(new ArrayList<>());
		}
		//fill the buckets with appropriate values based on the interval range the value lies in
		for(int i=0;i<n;i++) {
			int bi=k*arr[i]/max_val;
			bkt.get(bi).add(arr[i]);
		}
		//sort individual buckets separately
		for(ArrayList<Integer> list:bkt) {
			Collections.sort(list);
		}
		//merge sorted buckets
		int index=0;
		for(int i=0;i<k;i++) {
			for(int j=0;j<bkt.get(i).size();j++) {
				arr[index]=bkt.get(i).get(j);
			}
		}
		
		
		
	}
}
