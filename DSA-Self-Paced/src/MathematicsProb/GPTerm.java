package MathematicsProb;

public class GPTerm {
	public static void main(String[] args) {
		System.out.println(termOfGP(84, 87, 3));
	}
	
	// do not perform double/int
    public static double termOfGP(double A,int B,int N)
    {
        //Your code here
        double r=B/A;
        System.out.println(r);
        double r2= Math.pow(r,N-1);
        return A*r2;
    }

}
