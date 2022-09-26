package dynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubsequence {

	//ex -- s1 = "AXYZ" ,s2 = "BAZ"	
	//tabulation solution
	int m;int n; //these are lengths of the strings s1 and s2
	
	int lcsTab(String s1, String s2) {
		
		int dp[][]= new int[m+1][n+1]; //assume a 2D array of sizes of both the strings
		//vertically assume all the characters of S1 and horizaontally all the characters of S2 along the index
		//the first row and column will be == 0 as m==0 || n==0 we have the base case i.e. 0 common subsequence if any of the string empty
		
		for(int i=1;i<=m;i++) {
			
			for(int j=1;j<=n;j++){
				
				if(s1.charAt(i-1)==s2.charAt(j-1))//check if the character is matching on ith and jth position
					dp[i][j]=1+dp[i-1][j-1]; //if the character matches, then add 1 to the previous value of longest common subsequence
				else
					dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]); //if characters dont match, take whatever was the max value till i-1 j or i j-1
			}
			
		}
		return dp[m][n];
}
	
	
	
	
	//memoization solution
	
	int memo[][]= new int[m+1][n+1];
	//Arrays.fill(memo, -1);
	int lcsMemo(String s1, String s2, int m, int n) {
		//if value of memo is non negative, it means that we have already seen this string combination of s1 and s2
		if(memo[m][n]!=-1)return memo[m][n]; //if we have previously seen these strings, m and n will represent the lengths of s1 and s2
		
		if(m==0 || n==0)memo[m][n]=0; //if we reach empty string of any of s1 or s2, store 0 in memo
		
		if(s1.charAt(m-1)==s2.charAt(n-1)) {
			memo[m][n]= 1+lcsMemo(s1, s2, m-1, n-1);//if 2 characters are equal, +1 to the previous lcs and store it in memo
		}
		else {
			memo[m][n]= Math.max(lcsMemo(s1, s2, m, n-1), lcsMemo(s1, s2, m-1, n));
		}
		return memo[m][n];
	}
	
	
	
	//simple recursive solution
	int lcs(String s1, String s2, int m, int n){
		
		if(m==0 || n==0)return 0;
		
		if(s1.charAt(m-1)==s2.charAt(n-1)) {
			return 1+lcs(s1,s2,m-1,n-1);
		}
		
		int removeFirst= lcs(s1,s2,m-1,n);
		int removeSec = lcs(s1,s2,m,n-1);
		
		return Math.max(removeFirst, removeSec);
	}
}
