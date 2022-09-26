package Recursion;
import java.util.*;

public class AllSubsets {
	
	 public static void main(String args[]) {
	     int [] ip = new int[]{1,2,3,4};
	     List<Integer> list= new ArrayList<>();
	     
	     getSet(ip,list,0);
	    }

	   static void getSet(int [] input, List<Integer> list, int start){
	        System.out.println(list);
	        
	        for(int i=start;i<input.length;i++){
	            list.add(input[i]);
	            getSet(input, list, i+1);
	            list.remove(list.size()-1);
	        }
	        
	    }
}
