package MathematicsProb;

public class SumUnderModulo {
	public static void main(String[] args) {
		System.out.println(sumUnderModulo(12, 1000000007));
		
	}
	
	// use rule (a+b)%m = (a%m +b%m)%m
	  public static long sumUnderModulo(long a, long b){
	        // code here
	        long c=a+b;
	        long d= (long)Math.pow(10,9)+7;
	        return c%d;
	    }   
	  
	  //use (a*b)%m=((a%m)*(b%m))%m
	  static long multiplicationUnderModulo(long a, long b)
	    {
	        // add your code here
	        long m= (int)Math.pow(10,9)+7;
	        long a1=a%m;
	        long a2=b%m;
	        return (a1*a2)%m;
	    }
}
