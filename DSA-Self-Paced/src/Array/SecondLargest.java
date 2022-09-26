package Array;

public class SecondLargest {
	public static void main(String[] args) {
		System.out.println(secondLarge(new int [] {10,0,5}));
	}
	//efficient way
	static int secondLargeEff(int arr[]) {
		int res=-1, largest=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest)
			{
				res=largest;
				largest=i;
				
			}
			else if(arr[i]!=arr[largest]) {
				if(res==-1)res=i;
				if(arr[i]>arr[res])res=i;
			}
			
		}
		return res;
	}
	static int secondLarge(int arr[]) {
		int max=0,val=-1;
		int i=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]>max)
				{
				max=arr[i];
				}
		}
		int val2=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]>val2&&arr[i]!=max) {
				val2=arr[i];
				val=i;
			}
		}
		if(val==-1)
			return -1;
		return val;
	}
	
	
}
