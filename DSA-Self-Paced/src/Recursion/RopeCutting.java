package Recursion;

public class RopeCutting {
	public static void main(String[] args) {
		System.out.println(numOfCuts(5, 2, 5, 1));
	}
	
	//tough to understand!!
	
	static int numOfCuts(int n, int a, int b, int c) {
		if(n<0)
			return -1;
		if(n==0)
			return 0;
		int x=numOfCuts(n-a, a, b, c);
		int y=numOfCuts(n-b, a, b, c);
		int z=numOfCuts(n-c, a, b, c);
		
		int res=Math.max(Math.max(x, y),z);
		if(res==-1)
			return -1;
		
		return +1;
	}
}
