package dynamicProgramming;

//given coins array and sum, calculate how many combinations of coins can give the sum
//ex [1,2,3] and sum=4, 
//op - 4 --> 1 1 1 1 || 2 2 || 3 1 || 4
public class CoinChange {
	
	
	//iterative solution
	int getCountIter(int coins[], int n, int sum) {
		int dp[][]= new int[sum+1][n+1];
		
		for(int i=0;i<=n;i++) {
			dp[0][i]=1; //if sum == 0, we have 1 possible way to generate that
		}
		for(int i=0;i<=sum;i++)
			dp[i][0]=0; //if n == 0, there are 0 ways to generate given sum
		
		for(int i=1;i<=sum;i++) {
			
			for(int j=1;j<=n;j++) {
				
				dp[i][j]=dp[i][j-1]; //ignore jth coin , case 1
				
				if(coins[j-1]<=i)
					dp[i][j]+= dp[i-coins[j-1]][j];
			}
		}
		return dp[sum][n];
	}
	
	//recursive solution
	int getCount(int coins[], int n, int sum) { //n == length of array (nth coin to be considered)
		
		if(sum==0)return 1; //if sum == 0, we can only get that in 1 way
		
		if(n==0) return 0; //n == no.of coins. so from 0 coins we cannot get +ve sum. hence, there are 0 ways to do so
		
		//2 cases -- we either include current coin in combination or we dont include it
		
		int res= getCount(coins, n-1, sum); //here we ignore current coin and dont include it in sum
		if(coins[n-1]<=sum)
			res=res+ getCount(coins, n-1, sum-coins[n-1]); //we reduce the sum and make recursive call which means we include that coin in the sum and try next combination
		return res;
	}

}
