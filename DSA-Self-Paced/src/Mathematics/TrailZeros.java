package Mathematics;

public class TrailZeros {
	public static void main(String[] args) {
		// count trailing zeros in a value of factorial
		//for that count number of 10s in the prime factorization
		//as number of 5s < number of 2s , count number of 5s only
		//print no. of 5s
		System.out.println(countZero(251));
		
	}
	static int countZero(int n) {
//		int base = n/5;
//		int temp=base/5;
//		System.out.println(temp);
//		if(base%5==0) {
//			base=base+temp;
//		}
		int res=0;
		for(int i=5;i<=n;i=i*5) {
			res=res+n/i;
		}
		return res;
	}
}
