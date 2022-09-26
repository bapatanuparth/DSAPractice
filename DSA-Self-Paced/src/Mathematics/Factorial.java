package Mathematics;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(fact(10));
	}
	
	public static int fact(int i) {
		if(i==0) {
			return 1;
		}
		else {
			return i*fact(i-1);
		}
	}

}
