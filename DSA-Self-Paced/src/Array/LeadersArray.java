package Array;

public class LeadersArray {
	public static void main(String[] args) {
		leaders(new int[] {7,10,4,3,6,5,2});
	}
	
	static void leaders(int arr[]) {
		int last=arr[arr.length-1];
		System.out.print(last+" ");
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>last)
				{
				System.out.print(arr[i]+" ");
				last=arr[i];
				}
		}
		
	}
}
