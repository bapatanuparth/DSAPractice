package Recursion;

public class JosephusFormulaWay {
	public static void main(String[] args) {
		System.out.println(jos(5,3));
	}
	
	static int jos(int n,int k) {
		if(n==1)
			return 0;
		else
			return (jos(n-1,k)+k)%n;
		
	}

}
