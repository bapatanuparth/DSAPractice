package MathematicsProb;

//use of logarithm to count number of digits in a number
// vv smart code

public class CountFactorialDigit {
	public static void main(String[] args) {
		System.out.println(digitsInFactorial(19));
	}
    public static int digitsInFactorial(int N){
        // code here
        double res=0;
        // code here
        //log(m*n)=log m + log n;
        for(int i=1;i<=N;i++){
            res=res+Math.log10(i);
        }
        return (int)res+1;
    }
}
