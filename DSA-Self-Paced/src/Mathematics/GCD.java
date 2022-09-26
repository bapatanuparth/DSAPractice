package Mathematics;

public class GCD {
	public static void main(String[] args) {
		System.out.println(gcd(4,6));
		
	}
	public static int gcd(int a, int b) {
		int res=Math.min(a,b);
		for(int i=a;i>=1;i--) {
			if(b%i==0 && a%i==0) {
				return i;
			}
		}
		return 1;
	}
	
	//euclidean method
	static int gcd2(int a, int b)
	{
		while(a!=b) {
			if(a>b) 
				a=a-b;
			else
				b=b-a;
		}
		return a;
	}

}
