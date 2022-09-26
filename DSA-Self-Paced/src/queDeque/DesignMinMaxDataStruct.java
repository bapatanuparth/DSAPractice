package queDeque;

//design a data structure such that insert min, max, getMin and getMax
//insertMin will always have number less than numbers present already
//insertMax will always have number greater than the elements present already

import java.util.ArrayDeque;

class MinMax{
	
	ArrayDeque<Integer> ad=new ArrayDeque<>();
	
	public void insertMin(int min) {
		ad.offerFirst(min);
	}
	
	public void insertMax(int max) {
		ad.offerLast(max);
	}
	
	public int getMin() {
		return ad.peekFirst();
	}
	
	public int getMax() {
		return ad.peekLast();
	}
	 
	public int extractMin() {
		return ad.pollFirst();
	}
	
	public int extractMax() {
		return ad.pollLast();
	}
	
}

public class DesignMinMaxDataStruct {

}
