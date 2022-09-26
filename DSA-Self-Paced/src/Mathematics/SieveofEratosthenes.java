package Mathematics;
import java.util.Arrays;

import Mathematics.*;

//all prime numbers before a number
public class SieveofEratosthenes {
	public static void main(String[] args) {
		//primeNos(23);
		SieveAlgo(50);
		
	}

	//Naive method
	static void primeNos(int n) {
		int i=2;
		while(i<=n) {
			if(PrimeCheck.isPrime3(i)) {
				System.out.print(i+" ");
			}
			i++;
		}
	}
	//Sieve of Eratosthenes algorithm
	static void SieveAlgo(int n) {
		boolean arr[]=new boolean[n+1];
		for(int i=2;i*i<=n;i++) {
			if(!arr[i]) {
				for(int j=2*i;j<=n;j=j+i) {
					arr[j]=true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(!arr[i])
				System.out.print(i+" ");
		}
	}
}
