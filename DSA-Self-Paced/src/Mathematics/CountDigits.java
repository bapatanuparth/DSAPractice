package Mathematics;

public class CountDigits {
	public static int count(int i) {
		if(i==0) {
			return 0;
		}
		return 1+count(i/10);
	}
	public static void main(String[] args) {
		System.out.println(count(123));
		
	}
}
