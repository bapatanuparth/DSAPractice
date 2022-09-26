package MathematicsProb;
import Mathematics.PrimeCheck;

public class Exactly3Divisor {
	public static void main(String[] args) {
		System.out.println(exactly3Divisors(67));
	}

// check numbers with exactly 3 divisors under any number
	static public int exactly3Divisors(int N)
    {
        //Your code here
		int count=0;
		int root= (int)Math.sqrt(N);
		for(int i=2;i<=root;i++) {
			if(PrimeCheck.isPrime3(i))
				count++;
		}
		return count;
    }
}
