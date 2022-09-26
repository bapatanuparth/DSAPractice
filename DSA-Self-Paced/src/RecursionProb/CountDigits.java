package RecursionProb;

public class CountDigits {
	public static void main(String[] args) {
		System.out.println(countDigits(253));
	}
	    // look at the base case
		// it should not be (n==0) return 0 !!!
	    public static int countDigits(int n)
	    {
	        if(n<10)
	            return 1;
	        return countDigits(n/10)+1;
	    }

}
