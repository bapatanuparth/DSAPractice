package Mathematics;

public class PrimeCheck {
	public static void main(String[] args) {
		
	}

	static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//faster approach
	//check only till sqrt(n) as the factors will be in pairs
	static boolean isPrime2(int n) {
		if(n==1) {
			return false;
		}
		int root=(int) Math.sqrt(n);
		for(int i=2;i<=root;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//fastest approach check for /2 and /3 at first
	//upto 3 times faster than previous
	public static boolean isPrime3(int n) {
		if(n==1)
			return false;
		if(n==2 || n==3) {
			return true;
		}
		if(n%2==0 || n%3==0) {
			return false;
		}
		for(int i=5;i*i<=n;i=i+6) {
			if(n%i==0 || n%(i+2)==0)
				return false;
		}
		return true;
	}
}
