package searchSort;

import java.util.ArrayList;

//Given a sorted array arr containing n elements with possibly duplicate elements, the task is to find indexes of first and last occurrences of an element x in the given array.

//n=9, x=5
//arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
//Output:  2 5
public class FirstAndLastOccurrence {

	 ArrayList<Long> find(long arr[], int n, int x)
	    {
	        // code here
	        ArrayList<Long> ls = new ArrayList<>();
	        
	        long st=0, end=arr.length-1;
	        long first=-1, last=-1;
	        while(st<=end){
	            int mid= (int)(st+end)/2;
	            if(arr[mid]<x)st=mid+1;
	            else if(arr[mid]>x)end=mid-1;
	            else {
	                if(mid>0 && arr[mid-1]==x)
	                    end=mid-1;
	                else {first=mid;break;}
	            }
	        }
	        
	        st=0; end=n-1;
	        while(st<=end){
	            int mid= (int)(st+end)/2;
	            if(arr[mid]<x)st=mid+1;
	            else if(arr[mid]>x)end=mid-1;
	            else {
	                if(mid<n-1 && arr[mid+1]==x)
	                    st=mid+1;
	                else {last=mid;break;}
	                }
	        }
	    
	        ls.add(first);
	        ls.add(last);
	        return ls;
	    }
}
