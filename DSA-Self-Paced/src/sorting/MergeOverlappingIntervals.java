package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//you are given an array of intervals like 
//[[5,10],[11,20],[15,30]]
//you have to provide output after merging the overlapped intervals
//o/p ==> [[5,10],[11,30]]

//interval class with start and end
class Interval implements Comparable<Interval>{
	int start,end;
	public Interval() {
		// TODO Auto-generated constructor stub
	}
	public Interval(int a,int b) {
		this.start=a;
		this.end=b;
	}
	@Override
	public int compareTo(Interval o) {
		// TODO Auto-generated method stub
		return this.start-o.start;
	}
	
}

public class MergeOverlappingIntervals {

	public static List<Interval> mergeOverlaps(Interval []arr){
		//sort interval based on start time
		Arrays.sort(arr);
		int a=arr[0].start,b=arr[0].end;
		List<Interval> res=new ArrayList<>();
		
		//traverse through array, and check whether ith start lies in between i-1th interval
		//if it does, keep the maximum of 2 ends as the new interval boundary
		for(int i=1;i<arr.length;i++) {
			if(arr[i].start>b) {
				res.add(new Interval(a,b));
				a=arr[i].start;b=arr[i].end;
				continue;
			}
			if(arr[i].end>b)b=arr[i].end;
		}
		//add the last pair to the result
		res.add(new Interval(a,b));
		for(int j=0;j<res.size();j++) {
			System.out.print(res.get(j).start+ "  "+res.get(j).end+" \n" );
		}
	return res;
		
		
	}
	public static void main(String[] args) {
		
		Interval []arr2=new Interval[] {new Interval(11,20),new Interval(6,10),new Interval(4,8),new Interval(1,3)};
		mergeOverlaps(arr2);
		System.out.println(""+arr2[0].start+arr2[1].start+arr2[2].start);
	}
}
