package sorting;

import java.util.Arrays;
import java.util.Comparator;

class MyComp implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a%2-b%2;
	}
	
}

//use comparator to sort the array such that all even elements are ahead of all odd
public class SeparateEvenandOddInts {
	
	public static void main(String[] args) {
		Integer []arr=new Integer[]{1,2,4,5,6,7,8};
		Arrays.sort(arr, new MyComp());
		System.out.println(Arrays.toString(arr));
	}
	

}
