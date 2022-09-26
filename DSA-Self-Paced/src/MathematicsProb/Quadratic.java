package MathematicsProb;

import java.util.ArrayList;

public class Quadratic {
	public static void main(String[] args) {
		System.out.println(quadraticRoots(752,904,164));
	}
	
	public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> alist=new ArrayList<>(2);
        int b2=(int)Math.pow(b,2);
        int ac4=4*a*c;
        int sub=b2-ac4;
        int delta=(int)Math.sqrt(sub);
        int r1=delta-b;
        int a2=2*a;
        r1=r1/a2;
        int r2=-b-delta;
        r2=r2/a2;
        alist.add(r1);
        alist.add(r2);
        return alist;
    }

}
