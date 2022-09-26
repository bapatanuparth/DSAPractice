package Mathematics;
import Mathematics.GCD;

public class LCM {
	public static void main(String[] args) {
		System.out.println(lcm(8,10));
	}
	static int lcm(int a, int b) {
		int m=Math.min(a,b);
		int temp=Math.max(a, b);
		int x=temp;
		for (int i=0;i<=m;i++) {
			if(temp%m==0) {
				return temp;
			}
			temp=x*(i+1);
		}
		return temp;
	}
	//OR
	int lcm2(int a, int b) {
		return (a*b)/GCD.gcd2(a,b);
	}

}
