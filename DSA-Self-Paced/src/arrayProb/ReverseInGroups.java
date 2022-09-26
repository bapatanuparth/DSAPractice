package arrayProb;

import java.util.ArrayList;
import java.util.Arrays;

//Reverse every sub-array group of size K
public class ReverseInGroups {
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>(
		Arrays.asList(1,2,3,4,5));
		reverseInGroups(list,3);
	}	
    static void reverseInGroups(ArrayList<Integer> arr, int k) {
        // code here
    	ArrayList<Integer>a2=new ArrayList<>(arr);
    	int fix=k;
    	k=k-1;
    	for(int i=0;i<arr.size();) {
    		if(k>=arr.size())k=arr.size()-1;
    		int count=0;
    		while(count<fix && i<arr.size())
    			{
    			arr.set(i, a2.get(k));
    			i++;
    			count++;
    			k--;
    			}
    		k=k+2*fix;
    	}
    }
}
