package RecursionProb;

public class DigitalRoot {
	public static void main(String[] args) {
		
		System.out.println(digitalRoot(99999));
	}
	   public static int digitalRoot(int n)
	    {
	        // add your code here
	        if(n<10)
	            return n;
	        int i=n;
	        int sum=0;
	        while(i>0){
	            sum=sum+(i%10);
	            i=i/10;
	        }
	        return digitalRoot(sum);
	    }
}
