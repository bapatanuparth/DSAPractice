package searching;

//find square root of the number
//if not perfect square, return the floor
public class SquareRoot {
	
	//naive solution O(sq.root of x)
	public int squareRoot(int x) {
		int i;
		for(i=1;i*i<=x;i++) {
			if(i*i==x)return i;
		}
		return i-1;
	}

	//efficient solution O(log x)
	//use concept of binary search
	public int squareRootEff(int x) {
		int low=1, high=x, ans=-1;
		while(low<=high) {
			int mid =(low+high)/2;
			int sq=mid*mid;
			if(sq==x)return mid;
			if(sq>x) {
				high=mid-1;
			}else {
				//low=mid+1 to hunt for a greater possible solution
				low=mid+1;
				//store ans when sq. of mid< x because we need to find the max possible 
				//lowest value i.e. the floor of square root
				ans=mid;
			}
		}
		return ans;
	}
}
