package Mathematics;

public class PrimeFactors {
	public static void main(String[] args) {
		primeFactors2(14);
	}
	
	//efficient way
	static void primeFactors(int n) {
		int i;
		i=2;
		while(i<=n) {
			if(n%i==0) {
				System.out.print(i +" ");
				n=n/i;
				i=2;
				continue;
			}
			i++;
		}
		if(i==n) {
			System.out.print(i);
		}
	}
	
	//efficient way 2
	static void primeFactors2(int n) {
		for(int i=2;i*i<=n;i++) {
			while(n%i==0) {
				System.out.print(i);
				n=n/i;
			}
		}
		if(n>1) 
			System.out.print(n);
	}
}
