package Mathematics;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(isPal(2003));
		
	}
	
	public static boolean isPal(int i) {
		int rev=0;
		int temp=i;
		int fact;
		while(temp!=0) {
			fact=temp%10;
			rev=rev*10+fact;
			temp=temp/10;
		}
		return (i==rev);
	}

}
