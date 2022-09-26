package Array;

public class MajorityElement {
	public static void main(String[] args) {
		System.out.println(majority(new int[] {8,3,8,2,4}));
	}
	//Moore's voting algorithm O(n)
	static int majority2(int arr[]) {
		//phase 1
		//find the index of max occuring element
		int res=0, count=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[res]==arr[i])
				count++;
			else
				count--;
			if(count==0) {
				res=i;
				count=1;
			}
		}
		//phase 2
		//check if majority
		count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[res]==arr[i])
				count++;			
		}
		if(count<=arr.length/2)return -1;
		return res;
	}
	
	
	static int majority(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count=0;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]==arr[i])
				{
					count++;
					if(count>arr.length/2) {
						return j;
					}	
				}
			}
		}
		return -1;
	}
}
