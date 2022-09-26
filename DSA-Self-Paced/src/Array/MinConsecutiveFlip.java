package Array;

public class MinConsecutiveFlip {
	public static void main(String[] args) {
		minFlips2(new int[]{1,0,0,0,1,0,0,1,1,1,1});
	}
	
	//very interesting approach
	//efficient
	static void minFlips2(int arr[]) {
		// 110001 == if starting and ending same--> obviously second group should 
		//be switched
		if(arr[0]==arr[arr.length-1] && arr[0]==1) {
			for(int i=1;i<arr.length;i++) {
				if(arr[i-1]==1 && arr[i]==0) {
					System.out.print("From "+i+" to ");
				}
				else if(arr[i-1]==0 && arr[i]==1) {
					System.out.print(i-1+"\n");
				}
			}
		}
		else if(arr[0]==arr[arr.length-1] && arr[0]==0) {
			for(int i=1;i<arr.length;i++) {
				if(arr[i-1]==0 && arr[i]==1) {
					System.out.print("From "+i+" to ");
				}
				else if(arr[i-1]==1 && arr[i]==0) {
					System.out.print(i-1+"\n");
				}
			}
		}
		
		else {
			for(int i=1;i<arr.length;i++) {
				if(arr[i-1]==0 && arr[i]==1) {
					System.out.print("From "+i+" to ");
				}
				else if(arr[i-1]==1 && arr[i]==0) {
					System.out.print(i-1+"\n");
				}
			}
		}
		
		
	}
	
	//naive method
	//find out number of groups of ones and no of groups of zeros
	// if zeros < ones == switch all the groups
	static void minFlips(int arr[]) {
		int res,ones=0,zeros=0;
		int start=arr[0];
		if(arr.length==1)System.out.println(" one element");
		//to find out the number of groups of ones and twos
		for(int i=0;i<arr.length;) {
			if(arr[i]==1) {
				while(i<arr.length && arr[i]==1) {
					i++;
				}
				ones++;
			}
			else if(arr[i]==0) {
				while(i<arr.length && arr[i]==0) {
					i++;
				}
				zeros++;
			}
		}
		System.out.println(ones + " "+zeros);
		// to print which indexes to be switched
		if(zeros<ones) {
			for(int i=1;i<arr.length;i++) {
				if(arr[i-1]==1 && arr[i]==0) {
					System.out.print("From "+i+" to ");
				}
				else if(arr[i-1]==0 && arr[i]==1) {
					System.out.print(i-1+"\n");
				}
			}
		}
		else if(ones<=zeros) {
			for(int i=1;i<arr.length;i++) {
				if(arr[i-1]==0 && arr[i]==1) {
					System.out.print("From "+i+" to ");
				}
				else if(arr[i-1]==1 && arr[i]==0) {
					System.out.print(i-1+"\n");
				}
			}
		}
	}
}
