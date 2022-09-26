package Mathematics;

public class AllFactors {
	public static void main(String[] args) {
		allFactors(25);
	}
	static void allFactors(int n) {
		int i;
		for(i=1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		for( i=i-2;i>=1;i--) {
			if(n%i==0) {
				System.out.print((n/i)+" ");
			}
		}
	}
}
